/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2021 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citygml4j.ade.energy.bind;

import net.opengis.gml.*;
import org.citygml4j.ade.energy.model.buildingPhysics.*;
import org.citygml4j.ade.energy.model.core.VolumeType;
import org.citygml4j.ade.energy.model.core.*;
import org.citygml4j.ade.energy.model.materialAndConstruction.*;
import org.citygml4j.ade.energy.model.occupantBehaviour.*;
import org.citygml4j.ade.energy.model.supportingClasses.*;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.Reference;
import org.citygml4j.util.mapper.TypeMapper;
import org.sig3d.citygml._2.energy._1.AcquisitionMethodValue;
import org.sig3d.citygml._2.energy._1.ConstructionWeightValue;
import org.sig3d.citygml._2.energy._1.DayTypeValue;
import org.sig3d.citygml._2.energy._1.ElevationReferenceValue;
import org.sig3d.citygml._2.energy._1.EndUseTypeValue;
import org.sig3d.citygml._2.energy._1.FloorAreaTypeValue;
import org.sig3d.citygml._2.energy._1.InterpolationTypeValue;
import org.sig3d.citygml._2.energy._1.ObjectFactory;
import org.sig3d.citygml._2.energy._1.SurfaceSide;
import org.sig3d.citygml._2.energy._1.ThermalBoundaryTypeValue;
import org.sig3d.citygml._2.energy._1.VolumeTypeValue;
import org.sig3d.citygml._2.energy._1.WavelengthRangeType;
import org.sig3d.citygml._2.energy._1.WeatherDataTypeValue;
import org.sig3d.citygml._2.energy._1.*;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

import javax.xml.bind.JAXBElement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.ReentrantLock;

public class EnergyADEMarshaller implements ADEMarshaller {
    private final ReentrantLock lock = new ReentrantLock();
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    private TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            lock.lock();
            try {
                if (elementMapper == null) {
                    elementMapper = TypeMapper.<JAXBElement<?>>create()
                            .with(BuildingTypeProperty.class, this::createBuildingType)
                            .with(Construction.class, this::createConstruction)
                            .with(ConstructionWeightProperty.class, this::createConstructionWeight)
                            .with(DailyPatternSchedule.class, this::createDailyPatternSchedule)
                            .with(DailySchedule.class, this::createDailySchedule)
                            .with(DemandsProperty.class, this::createDemandsProperty)
                            .with(DHWFacilities.class, this::createDHWFacilities)
                            .with(ElectricalAppliances.class, this::createElectricalAppliances)
                            .with(EnergyDemand.class, this::createEnergyDemand)
                            .with(Facilities.class, this::createFacilities)
                            .with(FloorArea.class, this::createFloorArea)
                            .with(FloorAreaPropertyElement.class, this::createFloorAreaProperty)
                            .with(Gas.class, this::createGas)
                            .with(HeatExchangeType.class, this::createHeatExchangeType)
                            .with(HeightAboveGround.class, this::createHeightAboveGround)
                            .with(HeightAboveGroundPropertyElement.class, this::createHeightAboveGroundProperty)
                            .with(LayerComponent.class, this::createLayerComponent)
                            .with(Layer.class, this::createLayer)
                            .with(LightingFacilities.class, this::createLightingFacilities)
                            .with(Occupants.class, this::createOccupants)
                            .with(OpticalProperties.class, this::createOpticalProperties)
                            .with(PeriodOfYear.class, this::createPeriodOfYear)
                            .with(ReferencePointProperty.class, this::createReferencePoint)
                            .with(Reflectance.class, this::createReflectance)
                            .with(RegularTimeSeries.class, this::createRegularTimeSeries)
                            .with(RegularTimeSeriesFile.class, this::createRegularTimeSeriesFile)
                            .with(SolidMaterial.class, this::createSolidMaterial)
                            .with(ThermalBoundary.class, this::createThermalBoundary)
                            .with(ThermalOpening.class, this::createThermalOpening)
                            .with(ThermalZone.class, this::createThermalZone)
                            .with(ThermalZonePropertyElement.class, this::createThermalZoneProperty)
                            .with(TimeValuesProperties.class, this::createTimeValuesProperties)
                            .with(Transmittance.class, this::createTransmittance)
                            .with(UsageZone.class, this::createUsageZone)
                            .with(UsageZoneProperty.class, this::createUsageZoneProperty)
                            .with(VolumeType.class, this::createVolumeType)
                            .with(VolumeTypePropertyElement.class, this::createVolumeProperty)
                            .with(WeatherData.class, this::createWeatherData)
                            .with(WeatherDataPropertyElement.class, this::createWeatherDataProperty)
                            .with(WeatherStation.class, this::createWeatherStation);
                }
            } finally {
                lock.unlock();
            }
        }

        return elementMapper;
    }

    private TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            lock.lock();
            try {
                if (typeMapper == null) {
                    typeMapper = TypeMapper.create()
                            .with(AbstractConstructionProperty.class, this::marshalAbstractConstructionProperty)
                            .with(AbstractMaterialProperty.class, this::marshalAbstractMaterialProperty)
                            .with(AbstractScheduleProperty.class, this::marshalAbstractScheduleProperty)
                            .with(AbstractThermalZoneProperty.class, this::marshalAbstractThermalZoneProperty)
                            .with(AbstractTimeSeriesProperty.class, this::marshalAbstractTimeSeriesProperty)
                            .with(AbstractUsageZoneProperty.class, this::marshalAbstractUsageZoneProperty)
                            .with(Construction.class, this::marshalConstruction)
                            .with(DailyPatternSchedule.class, this::marshalDailyPatternSchedule)
                            .with(DailySchedule.class, this::marshalDailySchedule)
                            .with(DailyScheduleProperty.class, this::marshalDailyScheduleProperty)
                            .with(DHWFacilities.class, this::marshalDHWFacilities)
                            .with(ElectricalAppliances.class, this::marshalElectricalAppliances)
                            .with(EnergyDemand.class, this::marshalEnergyDemand)
                            .with(EnergyDemandProperty.class, this::marshalEnergyDemandProperty)
                            .with(Facilities.class, this::marshalFacilities)
                            .with(FacilitiesProperty.class, this::marshalFacilitiesProperty)
                            .with(FloorArea.class, this::marshalFloorArea)
                            .with(FloorAreaProperty.class, this::marshalFloorAreaProperty)
                            .with(Gas.class, this::marshalGas)
                            .with(HeatExchangeType.class, this::marshalHeatExchangeType)
                            .with(HeatExchangeTypeProperty.class, this::marshalHeatExchangeTypeProperty)
                            .with(HeightAboveGround.class, this::marshalHeightAboveGround)
                            .with(HeightAboveGroundProperty.class, this::marshalHeightAboveGroundProperty)
                            .with(LayerComponent.class, this::marshalLayerComponent)
                            .with(LayerComponentProperty.class, this::marshalLayerComponentProperty)
                            .with(Layer.class, this::marshalLayer)
                            .with(LayerProperty.class, this::marshalLayerProperty)
                            .with(LightingFacilities.class, this::marshalLightingFacilities)
                            .with(Occupants.class, this::marshalOccupants)
                            .with(OccupantsProperty.class, this::marshalOccupantsProperty)
                            .with(OpticalProperties.class, this::marshalOpticalProperties)
                            .with(OpticalPropertiesProperty.class, this::marshalOpticalPropertiesProperty)
                            .with(PeriodOfYear.class, this::marshalPeriodOfYear)
                            .with(PeriodOfYearProperty.class, this::marshalPeriodOfYearProperty)
                            .with(Reflectance.class, this::marshalReflectance)
                            .with(ReflectanceProperty.class, this::marshalReflectanceProperty)
                            .with(RegularTimeSeries.class, this::marshalRegularTimeSeries)
                            .with(RegularTimeSeriesFile.class, this::marshalRegularTimeSeriesFile)
                            .with(SolidMaterial.class, this::marshalSolidMaterial)
                            .with(ThermalBoundary.class, this::marshalThermalBoundary)
                            .with(ThermalBoundaryProperty.class, this::marshalThermalBoundaryProperty)
                            .with(ThermalOpening.class, this::marshalThermalOpening)
                            .with(ThermalOpeningProperty.class, this::marshalThermalOpeningProperty)
                            .with(ThermalZone.class, this::marshalThermalZone)
                            .with(ThermalZoneProperty.class, this::marshalThermalZoneProperty)
                            .with(TimeValuesProperties.class, this::marshalTimeValuesProperties)
                            .with(TimeValuesPropertiesProperty.class, this::marshalTimeValuesPropertiesProperty)
                            .with(Transmittance.class, this::marshalTransmittance)
                            .with(TransmittanceProperty.class, this::marshalTransmittanceProperty)
                            .with(UsageZone.class, this::marshalUsageZone)
                            .with(VolumeType.class, this::marshalVolumeType)
                            .with(VolumeTypeProperty.class, this::marshalVolumeTypeProperty)
                            .with(WeatherData.class, this::marshalWeatherData)
                            .with(WeatherDataProperty.class, this::marshalWeatherDataProperty)
                            .with(WeatherStation.class, this::marshalWeatherStation)
                            .with(WeatherStationProperty.class, this::marshalWeatherStationProperty);
                }
            } finally {
                lock.unlock();
            }
        }

        return typeMapper;
    }

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        return getElementMapper().apply(src);
    }

    @Override
    public Object marshal(ADEModelObject src) {
        return getTypeMapper().apply(src);
    }

    private void marshalAbstractContruction(AbstractConstruction src, AbstractConstructionType dest) {
        helper.getGMLMarshaller().marshalAbstractFeature(src, dest);
    }

    @SuppressWarnings("unchecked")
    private AbstractConstructionPropertyType marshalAbstractConstructionProperty(AbstractConstructionProperty src) {
        AbstractConstructionPropertyType dest = factory.createAbstractConstructionPropertyType();

        if (src.isSetAbstractConstruction()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getAbstractConstruction());
            if (elem != null && elem.getValue() instanceof AbstractConstructionType)
                dest.setAbstractConstruction((JAXBElement<? extends AbstractConstructionType>) elem);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalAbstractMaterial(AbstractMaterial src, AbstractMaterialType dest) {
        helper.getGMLMarshaller().marshalAbstractFeature(src, dest);
    }

    @SuppressWarnings("unchecked")
    private AbstractMaterialPropertyType marshalAbstractMaterialProperty(AbstractMaterialProperty src) {
        AbstractMaterialPropertyType dest = factory.createAbstractMaterialPropertyType();

        if (src.isSetAbstractMaterial()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getAbstractMaterial());
            if (elem != null && elem.getValue() instanceof AbstractMaterialType)
                dest.setAbstractMaterial((JAXBElement<? extends AbstractMaterialType>) elem);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalAbstractSchedule(AbstractSchedule src, AbstractScheduleType dest) {
        helper.getGMLMarshaller().marshalAbstractGML(src, dest);
    }

    @SuppressWarnings("unchecked")
    private AbstractSchedulePropertyType marshalAbstractScheduleProperty(AbstractScheduleProperty src) {
        AbstractSchedulePropertyType dest = factory.createAbstractSchedulePropertyType();

        if (src.isSetAbstractSchedule()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getAbstractSchedule());
            if (elem != null && elem.getValue() instanceof AbstractScheduleType)
                dest.setAbstractSchedule((JAXBElement<? extends AbstractScheduleType>) elem);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalAbstractThermalZone(AbstractThermalZone src, AbstractThermalZoneType dest) {
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.isSetContains()) {
            for (AbstractUsageZoneProperty property : src.getContains())
                dest.getContains().add(marshalAbstractUsageZoneProperty(property));
        }
    }

    @SuppressWarnings("unchecked")
    private AbstractThermalZonePropertyType marshalAbstractThermalZoneProperty(AbstractThermalZoneProperty src) {
        AbstractThermalZonePropertyType dest = factory.createAbstractThermalZonePropertyType();

        if (src.isSetAbstractThermalZone()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getAbstractThermalZone());
            if (elem != null && elem.getValue() instanceof AbstractThermalZoneType)
                dest.setAbstractThermalZone((JAXBElement<? extends AbstractThermalZoneType>) elem);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalAbstractTimeSeries(AbstractTimeSeries src, AbstractTimeSeriesType dest) {
        helper.getGMLMarshaller().marshalAbstractGML(src, dest);

        if (src.isSetVariableProperties())
            dest.setVariableProperties(marshalTimeValuesPropertiesProperty(src.getVariableProperties()));
    }

    @SuppressWarnings("unchecked")
    private AbstractTimeSeriesPropertyType marshalAbstractTimeSeriesProperty(AbstractTimeSeriesProperty src) {
        AbstractTimeSeriesPropertyType dest = factory.createAbstractTimeSeriesPropertyType();

        if (src.isSetAbstractTimeSeries()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getAbstractTimeSeries());
            if (elem != null && elem.getValue() instanceof AbstractTimeSeriesType)
                dest.setAbstractTimeSeries((JAXBElement<? extends AbstractTimeSeriesType>) elem);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalAbstractUsageZone(AbstractUsageZone src, AbstractUsageZoneType dest) {
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);
    }

    @SuppressWarnings("unchecked")
    private AbstractUsageZonePropertyType marshalAbstractUsageZoneProperty(AbstractUsageZoneProperty src) {
        AbstractUsageZonePropertyType dest = factory.createAbstractUsageZonePropertyType();

        if (src.isSetAbstractUsageZone()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getAbstractUsageZone());
            if (elem != null && elem.getValue() instanceof AbstractUsageZoneType)
                dest.setAbstractUsageZone((JAXBElement<? extends AbstractUsageZoneType>) elem);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private ConstructionType marshalConstruction(Construction src) {
        ConstructionType dest = factory.createConstructionType();
        marshalAbstractContruction(src, dest);

        if (src.isSetUValue())
            dest.setUValue(helper.getGMLMarshaller().marshalMeasure(src.getUValue()));

        if (src.isSetOpticalProperties())
            dest.setOpticalProperties(marshalOpticalPropertiesProperty(src.getOpticalProperties()));

        if (src.isSetLayer()) {
            for (LayerProperty property : src.getLayer())
                dest.getLayer().add(marshalLayerProperty(property));
        }

        return dest;
    }

    private DailyPatternScheduleType marshalDailyPatternSchedule(DailyPatternSchedule src) {
        DailyPatternScheduleType dest = factory.createDailyPatternScheduleType();
        marshalAbstractSchedule(src, dest);

        if (src.isSetPeriodOfYear()) {
            for (PeriodOfYearProperty property : src.getPeriodOfYear())
                dest.getPeriodOfYear().add(marshalPeriodOfYearProperty(property));
        }

        return dest;
    }

    private DailyScheduleType marshalDailySchedule(DailySchedule src) {
        DailyScheduleType dest = factory.createDailyScheduleType();

        if (src.isSetDayType())
            dest.setDayType(DayTypeValue.fromValue(src.getDayType().value()));

        if (src.isSetSchedule())
            dest.setSchedule(marshalAbstractTimeSeriesProperty(src.getSchedule()));

        return dest;
    }

    private DailySchedulePropertyType marshalDailyScheduleProperty(DailyScheduleProperty src) {
        DailySchedulePropertyType dest = factory.createDailySchedulePropertyType();

        if (src.isSetDaySchedule())
            dest.setDailySchedule(marshalDailySchedule(src.getDaySchedule()));

        return dest;
    }

    private DHWFacilitiesType marshalDHWFacilities(DHWFacilities src) {
        DHWFacilitiesType dest = factory.createDHWFacilitiesType();
        marshalFacilities(src, dest);

        return dest;
    }

    private ElectricalAppliancesType marshalElectricalAppliances(ElectricalAppliances src) {
        ElectricalAppliancesType dest = factory.createElectricalAppliancesType();
        marshalFacilities(src, dest);

        return dest;
    }

    private EnergyDemandType marshalEnergyDemand(EnergyDemand src) {
        EnergyDemandType dest = factory.createEnergyDemandType();
        helper.getGMLMarshaller().marshalAbstractFeature(src, dest);

        if (src.isSetEnergyAmount())
            dest.setEnergyAmount(marshalAbstractTimeSeriesProperty(src.getEnergyAmount()));

        if (src.isSetEndUse())
            dest.setEndUse(EndUseTypeValue.fromValue(src.getEndUse().value()));

        if (src.isSetMaximumLoad())
            dest.setMaximumLoad(helper.getGMLMarshaller().marshalMeasure(src.getMaximumLoad()));

        if (src.isSetEnergyCarrierType())
            dest.setEnergyCarrierType(helper.getGMLMarshaller().marshalCode(src.getEnergyCarrierType()));

        if (src.isSetDemandedBy()) {
            for (Reference reference : src.getDemandedBy())
                dest.getDemandedBy().add(helper.getGMLMarshaller().marshalReference(reference));
        }

        return dest;
    }

    private EnergyDemandPropertyType marshalEnergyDemandProperty(EnergyDemandProperty src) {
        EnergyDemandPropertyType dest = factory.createEnergyDemandPropertyType();

        if (src.isSetEnergyDemand())
            dest.setEnergyDemand(marshalEnergyDemand(src.getEnergyDemand()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalFacilities(Facilities src, FacilitiesType dest) {
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.isSetOperationSchedule())
            dest.setOperationSchedule(marshalAbstractScheduleProperty(src.getOperationSchedule()));

        if (src.isSetHeatDissipation())
            dest.setHeatDissipation(marshalHeatExchangeTypeProperty(src.getHeatDissipation()));
    }

    private FacilitiesType marshalFacilities(Facilities src) {
        FacilitiesType dest = factory.createFacilitiesType();
        marshalFacilities(src, dest);

        return dest;
    }

    @SuppressWarnings("unchecked")
    private FacilitiesPropertyType marshalFacilitiesProperty(FacilitiesProperty src) {
        FacilitiesPropertyType dest = factory.createFacilitiesPropertyType();

        if (src.isSetFacilities()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getFacilities());
            if (elem != null && elem.getValue() instanceof FacilitiesType)
                dest.setFacilities((JAXBElement<? extends FacilitiesType>) elem);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private FloorAreaType marshalFloorArea(FloorArea src) {
        FloorAreaType dest = factory.createFloorAreaType();

        if (src.isSetType())
            dest.setType(FloorAreaTypeValue.fromValue(src.getType().value()));

        if (src.isSetValue())
            dest.setValue(helper.getGMLMarshaller().marshalArea(src.getValue()));

        return dest;
    }

    private FloorAreaPropertyType marshalFloorAreaProperty(FloorAreaProperty src) {
        FloorAreaPropertyType dest = factory.createFloorAreaPropertyType();

        if (src.isSetFloorArea())
            dest.setFloorArea(marshalFloorArea(src.getFloorArea()));

        return dest;
    }

    private GasType marshalGas(Gas src) {
        GasType dest = factory.createGasType();
        marshalAbstractMaterial(src, dest);

        if (src.isSetIsVentilated())
            dest.setIsVentilated(src.isVentilated());

        if (src.isSetRValue())
            dest.setRValue(helper.getGMLMarshaller().marshalMeasure(src.getRValue()));

        return dest;
    }

    private HeatExchangeTypeType marshalHeatExchangeType(HeatExchangeType src) {
        HeatExchangeTypeType dest = factory.createHeatExchangeTypeType();

        if (src.isSetConvectiveFraction())
            dest.setConvectiveFraction(helper.getGMLMarshaller().marshalScale(src.getConvectiveFraction()));

        if (src.isSetLatentFraction())
            dest.setLatentFraction(helper.getGMLMarshaller().marshalScale(src.getLatentFraction()));

        if (src.isSetRadiantFraction())
            dest.setRadiantFraction(helper.getGMLMarshaller().marshalScale(src.getRadiantFraction()));

        if (src.isSetTotalValue())
            dest.setTotalValue(helper.getGMLMarshaller().marshalMeasure(src.getTotalValue()));

        return dest;
    }

    private HeatExchangeTypePropertyType marshalHeatExchangeTypeProperty(HeatExchangeTypeProperty src) {
        HeatExchangeTypePropertyType dest = factory.createHeatExchangeTypePropertyType();

        if (src.isSetHeatExchangeType())
            dest.setHeatExchangeType(marshalHeatExchangeType(src.getHeatExchangeType()));

        return dest;
    }

    private HeightAboveGroundType marshalHeightAboveGround(HeightAboveGround src) {
        HeightAboveGroundType dest = factory.createHeightAboveGroundType();

        if (src.isSetHeightReference())
            dest.setHeightReference(ElevationReferenceValue.fromValue(src.getHeightReference().value()));

        if (src.isSetValue())
            dest.setValue(helper.getGMLMarshaller().marshalLength(src.getValue()));

        return dest;
    }

    private HeightAboveGroundPropertyType marshalHeightAboveGroundProperty(HeightAboveGroundProperty src) {
        HeightAboveGroundPropertyType dest = factory.createHeightAboveGroundPropertyType();

        if (src.isSetHeightAboveGround())
            dest.setHeightAboveGround(marshalHeightAboveGround(src.getHeightAboveGround()));

        return dest;
    }

    private LayerComponentType marshalLayerComponent(LayerComponent src) {
        LayerComponentType dest = factory.createLayerComponentType();
        helper.getGMLMarshaller().marshalAbstractFeature(src, dest);

        if (src.isSetAreaFraction())
            dest.setAreaFraction(helper.getGMLMarshaller().marshalScale(src.getAreaFraction()));

        if (src.isSetThickness())
            dest.setThickness(helper.getGMLMarshaller().marshalLength(src.getThickness()));

        if (src.isSetMaterial())
            dest.setMaterial(marshalAbstractMaterialProperty(src.getMaterial()));

        return dest;
    }

    private LayerComponentPropertyType marshalLayerComponentProperty(LayerComponentProperty src) {
        LayerComponentPropertyType dest = factory.createLayerComponentPropertyType();

        if (src.isSetLayerComponent())
            dest.setLayerComponent(marshalLayerComponent(src.getLayerComponent()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private LayerType marshalLayer(Layer src) {
        LayerType dest = factory.createLayerType();
        helper.getGMLMarshaller().marshalAbstractFeature(src, dest);

        if (src.isSetLayerComponent()) {
            for (LayerComponentProperty property : src.getLayerComponent())
                dest.getLayerComponent().add(marshalLayerComponentProperty(property));
        }

        return dest;
    }

    private LayerPropertyType marshalLayerProperty(LayerProperty src) {
        LayerPropertyType dest = factory.createLayerPropertyType();

        if (src.isSetLayer())
            dest.setLayer(marshalLayer(src.getLayer()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private LightingFacilitiesType marshalLightingFacilities(LightingFacilities src) {
        LightingFacilitiesType dest = factory.createLightingFacilitiesType();
        marshalFacilities(src, dest);

        return dest;
    }

    private OccupantsType marshalOccupants(Occupants src) {
        OccupantsType dest = factory.createOccupantsType();
        helper.getGMLMarshaller().marshalAbstractFeature(src, dest);

        if (src.isSetHeatDissipation())
            dest.setHeatDissipation(marshalHeatExchangeTypeProperty(src.getHeatDissipation()));

        if (src.isSetNumberOfOccupants())
            dest.setNumberOfOccupants(src.getNumberOfOccupants());

        if (src.isSetOccupancyRate())
            dest.setOccupancyRate(marshalAbstractScheduleProperty(src.getOccupancyRate()));

        return dest;
    }

    private OccupantsPropertyType marshalOccupantsProperty(OccupantsProperty src) {
        OccupantsPropertyType dest = factory.createOccupantsPropertyType();

        if (src.isSetOccupants())
            dest.setOccupants(marshalOccupants(src.getOccupants()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private OpticalPropertiesType marshalOpticalProperties(OpticalProperties src) {
        OpticalPropertiesType dest = factory.createOpticalPropertiesType();

        if (src.isSetReflectance()) {
            for (ReflectanceProperty property : src.getReflectance())
                dest.getReflectance().add(marshalReflectanceProperty(property));
        }

        if (src.isSetTransmittance()) {
            for (TransmittanceProperty property : src.getTransmittance())
                dest.getTransmittance().add(marshalTransmittanceProperty(property));
        }

        if (src.isSetGlazingRatio())
            dest.setGlazingRatio(helper.getGMLMarshaller().marshalScale(src.getGlazingRatio()));

        return dest;
    }

    private OpticalPropertiesPropertyType marshalOpticalPropertiesProperty(OpticalPropertiesProperty src) {
        OpticalPropertiesPropertyType dest = factory.createOpticalPropertiesPropertyType();

        if (src.isSetOpticalProperties())
            dest.setOpticalProperties(marshalOpticalProperties(src.getOpticalProperties()));

        return dest;
    }

    private PeriodOfYearType marshalPeriodOfYear(PeriodOfYear src) {
        PeriodOfYearType dest = factory.createPeriodOfYearType();

        if (src.isSetPeriod())
            dest.setPeriod(marshalTimePeriodProperty(src.getPeriod()));

        if (src.isSetDailySchedule()) {
            for (DailyScheduleProperty property : src.getDailySchedule())
                dest.getDailySchedule().add(marshalDailyScheduleProperty(property));
        }

        return dest;
    }

    private PeriodOfYearPropertyType marshalPeriodOfYearProperty(PeriodOfYearProperty src) {
        PeriodOfYearPropertyType dest = factory.createPeriodOfYearPropertyType();

        if (src.isSetPeriodOfYear())
            dest.setPeriodOfYear(marshalPeriodOfYear(src.getPeriodOfYear()));

        return dest;
    }

    private ReflectanceType marshalReflectance(Reflectance src) {
        ReflectanceType dest = factory.createReflectanceType();

        if (src.isSetFraction())
            dest.setFraction(helper.getGMLMarshaller().marshalScale(src.getFraction()));

        if (src.isSetSurface())
            dest.setSurface(SurfaceSide.fromValue(src.getSurface().value()));

        if (src.isSetWavelengthRangeType())
            dest.setWavelengthRange(WavelengthRangeType.fromValue(src.getWavelengthRangeType().value()));

        return dest;
    }

    private ReflectancePropertyType marshalReflectanceProperty(ReflectanceProperty src) {
        ReflectancePropertyType dest = factory.createReflectancePropertyType();

        if (src.isSetReflectance())
            dest.setReflectance(marshalReflectance(src.getReflectance()));

        return dest;
    }

    private RegularTimeSeriesType marshalRegularTimeSeries(RegularTimeSeries src) {
        RegularTimeSeriesType dest = factory.createRegularTimeSeriesType();
        marshalAbstractTimeSeries(src, dest);

        if (src.isSetTimeInterval())
            dest.setTimeInterval(marshalTimeIntervalLength(src.getTimeInterval()));

        if (src.isSetTemporalExtent())
            dest.setTemporalExtent(marshalTimePeriodProperty(src.getTemporalExtent()));

        if (src.isSetValues())
            dest.setValues(helper.getGMLMarshaller().marshalMeasureList(src.getValues()));

        return dest;
    }

    private RegularTimeSeriesFileType marshalRegularTimeSeriesFile(RegularTimeSeriesFile src) {
        RegularTimeSeriesFileType dest = factory.createRegularTimeSeriesFileType();
        marshalAbstractTimeSeries(src, dest);

        if (src.isSetUom()) {
            UnitOfMeasureType uom = new UnitOfMeasureType();
            uom.setUom(src.getUom());
            dest.setUom(uom);
        }

        if (src.isSetFile())
            dest.setFile(src.getFile());

        if (src.isSetTemporalExtent())
            dest.setTemporalExtent(marshalTimePeriodProperty(src.getTemporalExtent()));

        if (src.isSetTimeInterval())
            dest.setTimeInterval(marshalTimeIntervalLength(src.getTimeInterval()));

        if (src.isSetNumberOfHeaderLines())
            dest.setNumberOfHeaderLines(src.getNumberOfHeaderLines());

        if (src.isSetFieldSeparator())
            dest.setFieldSeparator(src.getFieldSeparator());

        if (src.isSetRecordSeparator())
            dest.setRecordSeparator(src.getRecordSeparator());

        if (src.isSetDecimalSymbol())
            dest.setDecimalSymbol(src.getDecimalSymbol());

        if (src.isSetValueColumnNumber())
            dest.setValueColumnNumber(src.getValueColumnNumber());

        return dest;
    }

    private SolidMaterialType marshalSolidMaterial(SolidMaterial src) {
        SolidMaterialType dest = factory.createSolidMaterialType();
        marshalAbstractMaterial(src, dest);

        if (src.isSetConductivity())
            dest.setConductivity(helper.getGMLMarshaller().marshalMeasure(src.getConductivity()));

        if (src.isSetDensity())
            dest.setDensity(helper.getGMLMarshaller().marshalMeasure(src.getDensity()));

        if (src.isSetPermeance())
            dest.setPermeance(helper.getGMLMarshaller().marshalMeasure(src.getPermeance()));

        if (src.isSetSpecificHeat())
            dest.setSpecificHeat(helper.getGMLMarshaller().marshalMeasure(src.getSpecificHeat()));

        return dest;
    }

    private ThermalBoundaryType marshalThermalBoundary(ThermalBoundary src) {
        ThermalBoundaryType dest = factory.createThermalBoundaryType();
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.isSetThermalBoundaryType())
            dest.setThermalBoundaryType(ThermalBoundaryTypeValue.fromValue(src.getThermalBoundaryType().value()));

        if (src.isSetAzimuth())
            dest.setAzimuth(helper.getGMLMarshaller().marshalAngle(src.getAzimuth()));

        if (src.isSetInclination())
            dest.setInclination(helper.getGMLMarshaller().marshalAngle(src.getInclination()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLMarshaller().marshalArea(src.getArea()));

        if (src.isSetSurfaceGeometry())
            dest.setSurfaceGeometry(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getSurfaceGeometry()));

        if (src.isSetConstruction())
            dest.setConstruction(marshalAbstractConstructionProperty(src.getConstruction()));

        if (src.isSetContains()) {
            for (ThermalOpeningProperty property : src.getContains())
                dest.getContains().add(marshalThermalOpeningProperty(property));
        }

        if (src.isSetDelimits()) {
            for (ThermalZoneProperty property : src.getDelimits())
                dest.getDelimits().add(marshalThermalZoneProperty(property));
        }

        return dest;
    }

    private ThermalBoundaryPropertyType marshalThermalBoundaryProperty(ThermalBoundaryProperty src) {
        ThermalBoundaryPropertyType dest = factory.createThermalBoundaryPropertyType();

        if (src.isSetThermalBoundary())
            dest.setThermalBoundary(marshalThermalBoundary(src.getThermalBoundary()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private ThermalOpeningType marshalThermalOpening(ThermalOpening src) {
        ThermalOpeningType dest = factory.createThermalOpeningType();
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.isSetArea())
            dest.setArea(helper.getGMLMarshaller().marshalArea(src.getArea()));

        if (src.isSetConstruction())
            dest.setConstruction(marshalAbstractConstructionProperty(src.getConstruction()));

        if (src.isSetSurfaceGeometry())
            dest.setSurfaceGeometry(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getSurfaceGeometry()));

        return dest;
    }

    private ThermalOpeningPropertyType marshalThermalOpeningProperty(ThermalOpeningProperty src) {
        ThermalOpeningPropertyType dest = factory.createThermalOpeningPropertyType();

        if (src.isSetThermalOpening())
            dest.setThermalOpening(marshalThermalOpening(src.getThermalOpening()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private ThermalZoneType marshalThermalZone(ThermalZone src) {
        ThermalZoneType dest = factory.createThermalZoneType();
        marshalAbstractThermalZone(src, dest);

        if (src.isSetFloorArea()) {
            for (FloorAreaProperty property : src.getFloorArea())
                dest.getFloorArea().add(marshalFloorAreaProperty(property));
        }

        if (src.isSetVolume()) {
            for (VolumeTypeProperty property : src.getVolume())
                dest.getVolume().add(marshalVolumeTypeProperty(property));
        }

        if (src.isSetInfiltrationRate())
            dest.setInfiltrationRate(helper.getGMLMarshaller().marshalMeasure(src.getInfiltrationRate()));

        if (src.isSetIsCooled())
            dest.setIsCooled(src.isCooled());

        if (src.isSetIsHeated())
            dest.setIsHeated(src.isHeated());

        if (src.isSetVolumeGeometry())
            dest.setVolumeGeometry(helper.getGMLMarshaller().marshalSolidProperty(src.getVolumeGeometry()));

        if (src.isSetThermalBoundary()) {
            for (ThermalBoundaryProperty property : src.getThermalBoundary())
                dest.getThermalBoundary().add(marshalThermalBoundaryProperty(property));
        }

        return dest;
    }

    private ThermalZonePropertyType marshalThermalZoneProperty(ThermalZoneProperty src) {
        ThermalZonePropertyType dest = factory.createThermalZonePropertyType();

        if (src.isSetThermalZone())
            dest.setThermalZone(marshalThermalZone(src.getThermalZone()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private TimeIntervalLengthType marshalTimeIntervalLength(TimeIntervalLength src) {
        TimeIntervalLengthType dest = new TimeIntervalLengthType();

        if (src.isSetValue())
            dest.setValue(BigDecimal.valueOf(src.getValue()));

        if (src.isSetUnit())
            dest.setUnit(src.getUnit());

        if (src.isSetRadix())
            dest.setRadix(BigInteger.valueOf(src.getRadix()));

        if (src.isSetFactor())
            dest.setFactor(BigInteger.valueOf(src.getRadix()));

        return dest;
    }

    private TimePeriodType marshalTimePeriod(TimePeriod src) {
        TimePeriodType dest = new TimePeriodType();

        ZonedDateTime beginPosition = src.getBeginPosition();
        ZonedDateTime endPosition = src.getEndPosition();

        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        if (beginPosition != null && endPosition != null) {
            LocalDate epoch = LocalDate.of(1970, 1, 1);
            if (epoch.isEqual(beginPosition.toLocalDate()) && epoch.isEqual(endPosition.toLocalDate()))
                formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        }

        if (beginPosition != null) {
            TimePositionType timePosition = new TimePositionType();
            timePosition.getValue().add(beginPosition.format(formatter));
            dest.setBeginPosition(timePosition);
        }

        if (endPosition != null) {
            TimePositionType timePosition = new TimePositionType();
            timePosition.getValue().add(endPosition.format(formatter));
            dest.setEndPosition(timePosition);
        }

        return dest;
    }

    private TimePeriodPropertyType marshalTimePeriodProperty(TimePeriodProperty src) {
        TimePeriodPropertyType dest = new TimePeriodPropertyType();

        if (src.isSetTimePeriod())
            dest.setTimePeriod(marshalTimePeriod(src.getTimePeriod()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private TimeValuesPropertiesType marshalTimeValuesProperties(TimeValuesProperties src) {
        TimeValuesPropertiesType dest = factory.createTimeValuesPropertiesType();

        if (src.isSetAcquisitionMethod())
            dest.setAcquisitionMethod(AcquisitionMethodValue.fromValue(src.getAcquisitionMethod().value()));

        if (src.isSetInterpolationType())
            dest.setInterpolationType(InterpolationTypeValue.fromValue(src.getInterpolationType().value()));

        if (src.isSetQualityDescription())
            dest.setQualityDescription(src.getQualityDescription());

        if (src.isSetSource())
            dest.setSource(src.getSource());

        if (src.isSetThematicDescription())
            dest.setThematicDescription(src.getThematicDescription());

        return dest;
    }

    private TimeValuesPropertiesPropertyType marshalTimeValuesPropertiesProperty(TimeValuesPropertiesProperty src) {
        TimeValuesPropertiesPropertyType dest = factory.createTimeValuesPropertiesPropertyType();

        if (src.isSetTimeValuesProperties())
            dest.setTimeValuesProperties(marshalTimeValuesProperties(src.getTimeValuesProperties()));

        return dest;
    }

    private TransmittanceType marshalTransmittance(Transmittance src) {
        TransmittanceType dest = factory.createTransmittanceType();

        if (src.isSetFraction())
            dest.setFraction(helper.getGMLMarshaller().marshalScale(src.getFraction()));

        if (src.isSetWavelengthRangeType())
            dest.setWavelengthRange(WavelengthRangeType.fromValue(src.getWavelengthRangeType().value()));

        return dest;
    }

    private TransmittancePropertyType marshalTransmittanceProperty(TransmittanceProperty src) {
        TransmittancePropertyType dest = factory.createTransmittancePropertyType();

        if (src.isSetTransmittance())
            dest.setTransmittance(marshalTransmittance(src.getTransmittance()));

        return dest;
    }

    private UsageZoneType marshalUsageZone(UsageZone src) {
        UsageZoneType dest = factory.createUsageZoneType();
        marshalAbstractUsageZone(src, dest);

        if (src.isSetCoolingSchedule())
            dest.setCoolingSchedule(marshalAbstractScheduleProperty(src.getCoolingSchedule()));

        if (src.isSetHeatingSchedule())
            dest.setHeatingSchedule(marshalAbstractScheduleProperty(src.getHeatingSchedule()));

        if (src.isSetUsageZoneType())
            dest.setUsageZoneType(helper.getGMLMarshaller().marshalCode(src.getUsageZoneType()));

        if (src.isSetVentilationSchedule())
            dest.setVentilationSchedule(marshalAbstractScheduleProperty(src.getVentilationSchedule()));

        if (src.isSetFloorArea()) {
            for (FloorAreaProperty property : src.getFloorArea())
                dest.getFloorArea().add(marshalFloorAreaProperty(property));
        }

        if (src.isSetOccupiedBy()) {
            for (OccupantsProperty property : src.getOccupiedBy())
                dest.getOccupiedBy().add(marshalOccupantsProperty(property));
        }

        if (src.isSetEquippedWith()) {
            for (FacilitiesProperty property : src.getEquippedWith())
                dest.getEquippedWith().add(marshalFacilitiesProperty(property));
        }

        return dest;
    }

    private VolumeTypeType marshalVolumeType(VolumeType src) {
        VolumeTypeType dest = factory.createVolumeTypeType();

        if (src.isSetType())
            dest.setType(VolumeTypeValue.fromValue(src.getType().value()));

        if (src.isSetValue())
            dest.setValue(helper.getGMLMarshaller().marshalVolume(src.getValue()));

        return dest;
    }

    private VolumeTypePropertyType marshalVolumeTypeProperty(VolumeTypeProperty src) {
        VolumeTypePropertyType dest = factory.createVolumeTypePropertyType();

        if (src.isSetVolumeType())
            dest.setVolumeType(marshalVolumeType(src.getVolumeType()));

        return dest;
    }

    private WeatherDataType marshalWeatherData(WeatherData src) {
        WeatherDataType dest = factory.createWeatherDataType();
        helper.getGMLMarshaller().marshalAbstractGML(src, dest);

        if (src.isSetWeatherDataType())
            dest.setWeatherDataType(WeatherDataTypeValue.fromValue(src.getWeatherDataType().value()));

        if (src.isSetValues())
            dest.setValues(marshalAbstractTimeSeriesProperty(src.getValues()));

        if (src.isSetPosition())
            dest.setPosition(helper.getGMLMarshaller().marshalPointProperty(src.getPosition()));

        return dest;
    }

    private WeatherDataPropertyType marshalWeatherDataProperty(WeatherDataProperty src) {
        WeatherDataPropertyType dest = factory.createWeatherDataPropertyType();

        if (src.isSetWeatherData())
            dest.setWeatherData(marshalWeatherData(src.getWeatherData()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private WeatherStationType marshalWeatherStation(WeatherStation src) {
        WeatherStationType dest = factory.createWeatherStationType();
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.isSetStationName())
            dest.setStationName(src.getStationName());

        if (src.isSetPosition())
            dest.setPosition(helper.getGMLMarshaller().marshalPointProperty(src.getPosition()));

        if (src.isSetParameter()) {
            for (WeatherDataProperty property : src.getParameter())
                dest.getParameter().add(marshalWeatherDataProperty(property));
        }

        return dest;
    }

    private WeatherStationPropertyType marshalWeatherStationProperty(WeatherStationProperty src) {
        WeatherStationPropertyType dest = factory.createWeatherStationPropertyType();

        if (src.isSetWeatherStation())
            dest.setWeatherStation(marshalWeatherStation(src.getWeatherStation()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private JAXBElement<?> createConstruction(Construction src) {
        return factory.createConstruction(marshalConstruction(src));
    }

    private JAXBElement<?> createBuildingType(BuildingTypeProperty src) {
        return factory.createBuildingType(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createConstructionWeight(ConstructionWeightProperty src) {
        return factory.createConstructionWeight(ConstructionWeightValue.fromValue(src.getValue().value()));
    }

    private JAXBElement<?> createDailyPatternSchedule(DailyPatternSchedule src) {
        return factory.createDailyPatternSchedule(marshalDailyPatternSchedule(src));
    }

    private JAXBElement<?> createDailySchedule(DailySchedule src) {
        return factory.createDailySchedule(marshalDailySchedule(src));
    }

    private JAXBElement<?> createDemandsProperty(DemandsProperty src) {
        return factory.createDemands(marshalEnergyDemandProperty(src.getValue()));
    }

    private JAXBElement<?> createDHWFacilities(DHWFacilities src) {
        return factory.createDHWFacilities(marshalDHWFacilities(src));
    }

    private JAXBElement<?> createElectricalAppliances(ElectricalAppliances src) {
        return factory.createElectricalAppliances(marshalElectricalAppliances(src));
    }

    private JAXBElement<?> createEnergyDemand(EnergyDemand src) {
        return factory.createEnergyDemand(marshalEnergyDemand(src));
    }

    private JAXBElement<?> createFacilities(Facilities src) {
        return factory.createFacilities(marshalFacilities(src));
    }

    private JAXBElement<?> createFloorArea(FloorArea src) {
        return factory.createFloorArea(marshalFloorArea(src));
    }

    private JAXBElement<?> createFloorAreaProperty(FloorAreaPropertyElement src) {
        return factory.createFloorAreaProperty(marshalFloorAreaProperty(src.getValue()));
    }

    private JAXBElement<?> createGas(Gas src) {
        return factory.createGas(marshalGas(src));
    }

    private JAXBElement<?> createHeatExchangeType(HeatExchangeType src) {
        return factory.createHeatExchangeType(marshalHeatExchangeType(src));
    }

    private JAXBElement<?> createHeightAboveGround(HeightAboveGround src) {
        return factory.createHeightAboveGround(marshalHeightAboveGround(src));
    }

    private JAXBElement<?> createHeightAboveGroundProperty(HeightAboveGroundPropertyElement src) {
        return factory.createHeightAboveGroundProperty(marshalHeightAboveGroundProperty(src.getValue()));
    }

    private JAXBElement<?> createLayerComponent(LayerComponent src) {
        return factory.createLayerComponent(marshalLayerComponent(src));
    }

    private JAXBElement<?> createLayer(Layer src) {
        return factory.createLayer(marshalLayer(src));
    }

    private JAXBElement<?> createLightingFacilities(LightingFacilities src) {
        return factory.createLightingFacilities(marshalLightingFacilities(src));
    }

    private JAXBElement<?> createOccupants(Occupants src) {
        return factory.createOccupants(marshalOccupants(src));
    }

    private JAXBElement<?> createOpticalProperties(OpticalProperties src) {
        return factory.createOpticalProperties(marshalOpticalProperties(src));
    }

    private JAXBElement<?> createPeriodOfYear(PeriodOfYear src) {
        return factory.createPeriodOfYear(marshalPeriodOfYear(src));
    }

    private JAXBElement<?> createReferencePoint(ReferencePointProperty src) {
        return factory.createReferencePoint(helper.getGMLMarshaller().marshalPointProperty(src.getValue()));
    }

    private JAXBElement<?> createReflectance(Reflectance src) {
        return factory.createReflectance(marshalReflectance(src));
    }

    private JAXBElement<?> createRegularTimeSeries(RegularTimeSeries src) {
        return factory.createRegularTimeSeries(marshalRegularTimeSeries(src));
    }

    private JAXBElement<?> createRegularTimeSeriesFile(RegularTimeSeriesFile src) {
        return factory.createRegularTimeSeriesFile(marshalRegularTimeSeriesFile(src));
    }

    private JAXBElement<?> createSolidMaterial(SolidMaterial src) {
        return factory.createSolidMaterial(marshalSolidMaterial(src));
    }

    private JAXBElement<?> createThermalBoundary(ThermalBoundary src) {
        return factory.createThermalBoundary(marshalThermalBoundary(src));
    }

    private JAXBElement<?> createThermalOpening(ThermalOpening src) {
        return factory.createThermalOpening(marshalThermalOpening(src));
    }

    private JAXBElement<?> createThermalZone(ThermalZone src) {
        return factory.createThermalZone(marshalThermalZone(src));
    }

    private JAXBElement<?> createThermalZoneProperty(ThermalZonePropertyElement src) {
        return factory.createThermalZoneProperty(marshalAbstractThermalZoneProperty(src.getValue()));
    }

    private JAXBElement<?> createTimeValuesProperties(TimeValuesProperties src) {
        return factory.createTimeValuesProperties(marshalTimeValuesProperties(src));
    }

    private JAXBElement<?> createTransmittance(Transmittance src) {
        return factory.createTransmittance(marshalTransmittance(src));
    }

    private JAXBElement<?> createUsageZone(UsageZone src) {
        return factory.createUsageZone(marshalUsageZone(src));
    }

    private JAXBElement<?> createUsageZoneProperty(UsageZoneProperty src) {
        return factory.createUsageZoneProperty(marshalAbstractUsageZoneProperty(src.getValue()));
    }

    private JAXBElement<?> createVolumeProperty(VolumeTypePropertyElement src) {
        return factory.createVolume(marshalVolumeTypeProperty(src.getValue()));
    }

    private JAXBElement<?> createVolumeType(VolumeType src) {
        return factory.createVolumeType(marshalVolumeType(src));
    }

    private JAXBElement<?> createWeatherData(WeatherData src) {
        return factory.createWeatherData(marshalWeatherData(src));
    }

    private JAXBElement<?> createWeatherDataProperty(WeatherDataPropertyElement src) {
        return factory.createWeatherDataProperty(marshalWeatherDataProperty(src.getValue()));
    }

    private JAXBElement<?> createWeatherStation(WeatherStation src) {
        return factory.createWeatherStation(marshalWeatherStation(src));
    }
}
