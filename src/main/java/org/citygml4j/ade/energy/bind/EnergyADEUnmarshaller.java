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

import net.opengis.gml.CodeType;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.ReferenceType;
import net.opengis.gml.TimeIntervalLengthType;
import net.opengis.gml.TimePeriodPropertyType;
import net.opengis.gml.TimePeriodType;
import net.opengis.gml.TimePositionType;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalBoundary;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalBoundaryProperty;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalBoundaryTypeValue;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalOpening;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalOpeningProperty;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalZone;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalZoneProperty;
import org.citygml4j.ade.energy.model.core.AbstractConstruction;
import org.citygml4j.ade.energy.model.core.AbstractConstructionProperty;
import org.citygml4j.ade.energy.model.core.AbstractThermalZone;
import org.citygml4j.ade.energy.model.core.AbstractThermalZoneProperty;
import org.citygml4j.ade.energy.model.core.AbstractUsageZone;
import org.citygml4j.ade.energy.model.core.AbstractUsageZoneProperty;
import org.citygml4j.ade.energy.model.core.BuildingTypeProperty;
import org.citygml4j.ade.energy.model.core.ConstructionWeightProperty;
import org.citygml4j.ade.energy.model.core.ConstructionWeightValue;
import org.citygml4j.ade.energy.model.core.DemandsProperty;
import org.citygml4j.ade.energy.model.core.ElevationReferenceValue;
import org.citygml4j.ade.energy.model.core.EndUseTypeValue;
import org.citygml4j.ade.energy.model.core.EnergyDemand;
import org.citygml4j.ade.energy.model.core.EnergyDemandProperty;
import org.citygml4j.ade.energy.model.core.FloorArea;
import org.citygml4j.ade.energy.model.core.FloorAreaProperty;
import org.citygml4j.ade.energy.model.core.FloorAreaPropertyElement;
import org.citygml4j.ade.energy.model.core.FloorAreaTypeValue;
import org.citygml4j.ade.energy.model.core.HeatExchangeType;
import org.citygml4j.ade.energy.model.core.HeatExchangeTypeProperty;
import org.citygml4j.ade.energy.model.core.HeightAboveGround;
import org.citygml4j.ade.energy.model.core.HeightAboveGroundProperty;
import org.citygml4j.ade.energy.model.core.HeightAboveGroundPropertyElement;
import org.citygml4j.ade.energy.model.core.ReferencePointProperty;
import org.citygml4j.ade.energy.model.core.ThermalZonePropertyElement;
import org.citygml4j.ade.energy.model.core.Transmittance;
import org.citygml4j.ade.energy.model.core.TransmittanceProperty;
import org.citygml4j.ade.energy.model.core.UsageZoneProperty;
import org.citygml4j.ade.energy.model.core.VolumeType;
import org.citygml4j.ade.energy.model.core.VolumeTypeProperty;
import org.citygml4j.ade.energy.model.core.VolumeTypePropertyElement;
import org.citygml4j.ade.energy.model.core.VolumeTypeValue;
import org.citygml4j.ade.energy.model.core.WavelengthRangeType;
import org.citygml4j.ade.energy.model.core.WeatherData;
import org.citygml4j.ade.energy.model.core.WeatherDataProperty;
import org.citygml4j.ade.energy.model.core.WeatherDataPropertyElement;
import org.citygml4j.ade.energy.model.core.WeatherDataTypeValue;
import org.citygml4j.ade.energy.model.materialAndConstruction.AbstractMaterial;
import org.citygml4j.ade.energy.model.materialAndConstruction.AbstractMaterialProperty;
import org.citygml4j.ade.energy.model.materialAndConstruction.Construction;
import org.citygml4j.ade.energy.model.materialAndConstruction.Gas;
import org.citygml4j.ade.energy.model.materialAndConstruction.Layer;
import org.citygml4j.ade.energy.model.materialAndConstruction.LayerComponent;
import org.citygml4j.ade.energy.model.materialAndConstruction.LayerComponentProperty;
import org.citygml4j.ade.energy.model.materialAndConstruction.LayerProperty;
import org.citygml4j.ade.energy.model.materialAndConstruction.OpticalProperties;
import org.citygml4j.ade.energy.model.materialAndConstruction.OpticalPropertiesProperty;
import org.citygml4j.ade.energy.model.materialAndConstruction.Reflectance;
import org.citygml4j.ade.energy.model.materialAndConstruction.ReflectanceProperty;
import org.citygml4j.ade.energy.model.materialAndConstruction.SolidMaterial;
import org.citygml4j.ade.energy.model.materialAndConstruction.SurfaceSide;
import org.citygml4j.ade.energy.model.occupantBehaviour.DHWFacilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.ElectricalAppliances;
import org.citygml4j.ade.energy.model.occupantBehaviour.Facilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.FacilitiesProperty;
import org.citygml4j.ade.energy.model.occupantBehaviour.LightingFacilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.Occupants;
import org.citygml4j.ade.energy.model.occupantBehaviour.OccupantsProperty;
import org.citygml4j.ade.energy.model.occupantBehaviour.UsageZone;
import org.citygml4j.ade.energy.model.supportingClasses.AbstractSchedule;
import org.citygml4j.ade.energy.model.supportingClasses.AbstractScheduleProperty;
import org.citygml4j.ade.energy.model.supportingClasses.AbstractTimeSeries;
import org.citygml4j.ade.energy.model.supportingClasses.AbstractTimeSeriesProperty;
import org.citygml4j.ade.energy.model.supportingClasses.AcquisitionMethodValue;
import org.citygml4j.ade.energy.model.supportingClasses.DailyPatternSchedule;
import org.citygml4j.ade.energy.model.supportingClasses.DailySchedule;
import org.citygml4j.ade.energy.model.supportingClasses.DailyScheduleProperty;
import org.citygml4j.ade.energy.model.supportingClasses.DayTypeValue;
import org.citygml4j.ade.energy.model.supportingClasses.InterpolationTypeValue;
import org.citygml4j.ade.energy.model.supportingClasses.PeriodOfYear;
import org.citygml4j.ade.energy.model.supportingClasses.PeriodOfYearProperty;
import org.citygml4j.ade.energy.model.supportingClasses.RegularTimeSeries;
import org.citygml4j.ade.energy.model.supportingClasses.RegularTimeSeriesFile;
import org.citygml4j.ade.energy.model.supportingClasses.TimeIntervalLength;
import org.citygml4j.ade.energy.model.supportingClasses.TimePeriod;
import org.citygml4j.ade.energy.model.supportingClasses.TimePeriodProperty;
import org.citygml4j.ade.energy.model.supportingClasses.TimeValuesProperties;
import org.citygml4j.ade.energy.model.supportingClasses.TimeValuesPropertiesProperty;
import org.citygml4j.ade.energy.model.supportingClasses.WeatherStation;
import org.citygml4j.ade.energy.model.supportingClasses.WeatherStationProperty;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.xlink.XLinkActuate;
import org.citygml4j.model.gml.xlink.XLinkShow;
import org.citygml4j.model.gml.xlink.XLinkType;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;
import org.sig3d.citygml._2.energy._1.AbstractConstructionPropertyType;
import org.sig3d.citygml._2.energy._1.AbstractConstructionType;
import org.sig3d.citygml._2.energy._1.AbstractMaterialPropertyType;
import org.sig3d.citygml._2.energy._1.AbstractMaterialType;
import org.sig3d.citygml._2.energy._1.AbstractSchedulePropertyType;
import org.sig3d.citygml._2.energy._1.AbstractScheduleType;
import org.sig3d.citygml._2.energy._1.AbstractThermalZonePropertyType;
import org.sig3d.citygml._2.energy._1.AbstractThermalZoneType;
import org.sig3d.citygml._2.energy._1.AbstractTimeSeriesPropertyType;
import org.sig3d.citygml._2.energy._1.AbstractTimeSeriesType;
import org.sig3d.citygml._2.energy._1.AbstractUsageZonePropertyType;
import org.sig3d.citygml._2.energy._1.AbstractUsageZoneType;
import org.sig3d.citygml._2.energy._1.ConstructionType;
import org.sig3d.citygml._2.energy._1.DHWFacilitiesType;
import org.sig3d.citygml._2.energy._1.DailyPatternScheduleType;
import org.sig3d.citygml._2.energy._1.DailySchedulePropertyType;
import org.sig3d.citygml._2.energy._1.DailyScheduleType;
import org.sig3d.citygml._2.energy._1.ElectricalAppliancesType;
import org.sig3d.citygml._2.energy._1.EnergyDemandPropertyType;
import org.sig3d.citygml._2.energy._1.EnergyDemandType;
import org.sig3d.citygml._2.energy._1.FacilitiesPropertyType;
import org.sig3d.citygml._2.energy._1.FacilitiesType;
import org.sig3d.citygml._2.energy._1.FloorAreaPropertyType;
import org.sig3d.citygml._2.energy._1.FloorAreaType;
import org.sig3d.citygml._2.energy._1.GasType;
import org.sig3d.citygml._2.energy._1.HeatExchangeTypePropertyType;
import org.sig3d.citygml._2.energy._1.HeatExchangeTypeType;
import org.sig3d.citygml._2.energy._1.HeightAboveGroundPropertyType;
import org.sig3d.citygml._2.energy._1.HeightAboveGroundType;
import org.sig3d.citygml._2.energy._1.LayerComponentPropertyType;
import org.sig3d.citygml._2.energy._1.LayerComponentType;
import org.sig3d.citygml._2.energy._1.LayerPropertyType;
import org.sig3d.citygml._2.energy._1.LayerType;
import org.sig3d.citygml._2.energy._1.LightingFacilitiesType;
import org.sig3d.citygml._2.energy._1.OccupantsPropertyType;
import org.sig3d.citygml._2.energy._1.OccupantsType;
import org.sig3d.citygml._2.energy._1.OpticalPropertiesPropertyType;
import org.sig3d.citygml._2.energy._1.OpticalPropertiesType;
import org.sig3d.citygml._2.energy._1.PeriodOfYearPropertyType;
import org.sig3d.citygml._2.energy._1.PeriodOfYearType;
import org.sig3d.citygml._2.energy._1.ReflectancePropertyType;
import org.sig3d.citygml._2.energy._1.ReflectanceType;
import org.sig3d.citygml._2.energy._1.RegularTimeSeriesFileType;
import org.sig3d.citygml._2.energy._1.RegularTimeSeriesType;
import org.sig3d.citygml._2.energy._1.SolidMaterialType;
import org.sig3d.citygml._2.energy._1.ThermalBoundaryPropertyType;
import org.sig3d.citygml._2.energy._1.ThermalBoundaryType;
import org.sig3d.citygml._2.energy._1.ThermalOpeningPropertyType;
import org.sig3d.citygml._2.energy._1.ThermalOpeningType;
import org.sig3d.citygml._2.energy._1.ThermalZonePropertyType;
import org.sig3d.citygml._2.energy._1.ThermalZoneType;
import org.sig3d.citygml._2.energy._1.TimeValuesPropertiesPropertyType;
import org.sig3d.citygml._2.energy._1.TimeValuesPropertiesType;
import org.sig3d.citygml._2.energy._1.TransmittancePropertyType;
import org.sig3d.citygml._2.energy._1.TransmittanceType;
import org.sig3d.citygml._2.energy._1.UsageZoneType;
import org.sig3d.citygml._2.energy._1.VolumeTypePropertyType;
import org.sig3d.citygml._2.energy._1.VolumeTypeType;
import org.sig3d.citygml._2.energy._1.WeatherDataPropertyType;
import org.sig3d.citygml._2.energy._1.WeatherDataType;
import org.sig3d.citygml._2.energy._1.WeatherStationPropertyType;
import org.sig3d.citygml._2.energy._1.WeatherStationType;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.concurrent.locks.ReentrantLock;

public class EnergyADEUnmarshaller implements ADEUnmarshaller {
    private final ReentrantLock lock = new ReentrantLock();
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    private CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            lock.lock();
            try {
                if (typeMapper == null) {
                    typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                            .with(AbstractConstructionPropertyType.class, this::unmarshalAbstractConstructionProperty)
                            .with(AbstractMaterialPropertyType.class, this::unmarshalAbstractMaterialProperty)
                            .with(AbstractSchedulePropertyType.class, this::unmarshalAbstractScheduleProperty)
                            .with(AbstractThermalZonePropertyType.class, this::unmarshalAbstractThermalZoneProperty)
                            .with(AbstractTimeSeriesPropertyType.class, this::unmarshalAbstractTimeSeriesProperty)
                            .with(AbstractUsageZonePropertyType.class, this::unmarshalAbstractUsageZoneProperty)
                            .with(ConstructionType.class, this::unmarshalConstruction)
                            .with(DailyPatternScheduleType.class, this::unmarshalDailyPatternSchedule)
                            .with(DailyScheduleType.class, this::unmarshalDailySchedule)
                            .with(DailySchedulePropertyType.class, this::unmarshalDailyScheduleProperty)
                            .with(DHWFacilitiesType.class, this::unmarshalDHWFacilities)
                            .with(ElectricalAppliancesType.class, this::unmarshalElectricalAppliances)
                            .with(EnergyDemandType.class, this::unmarshalEnergyDemand)
                            .with(EnergyDemandPropertyType.class, this::unmarshalEnergyDemandProperty)
                            .with(FacilitiesType.class, this::unmarshalFacilities)
                            .with(FacilitiesPropertyType.class, this::unmarshalFacilitiesProperty)
                            .with(FloorAreaType.class, this::unmarshalFloorArea)
                            .with(FloorAreaPropertyType.class, this::unmarshalFloorAreaProperty)
                            .with(GasType.class, this::unmarshalGas)
                            .with(HeatExchangeTypeType.class, this::unmarshalHeatExchangeType)
                            .with(HeatExchangeTypePropertyType.class, this::unmarshalHeatExchangeTypeProperty)
                            .with(HeightAboveGroundType.class, this::unmarshalHeightAboveGround)
                            .with(HeightAboveGroundPropertyType.class, this::unmarshalHeightAboveGroundProperty)
                            .with(LayerComponentType.class, this::unmarshalLayerComponent)
                            .with(LayerComponentPropertyType.class, this::unmarshalLayerComponentProperty)
                            .with(LayerType.class, this::unmarshalLayer)
                            .with(LayerPropertyType.class, this::unmarshalLayerProperty)
                            .with(LightingFacilitiesType.class, this::unmarshalLightingFacilities)
                            .with(OccupantsType.class, this::unmarshalOccupants)
                            .with(OccupantsPropertyType.class, this::unmarshalOccupantsProperty)
                            .with(OpticalPropertiesType.class, this::unmarshalOpticalProperties)
                            .with(OpticalPropertiesPropertyType.class, this::unmarshalOpticalPropertiesProperty)
                            .with(PeriodOfYearType.class, this::unmarshalPeriodOfYear)
                            .with(PeriodOfYearPropertyType.class, this::unmarshalPeriodOfYearProperty)
                            .with(ReflectanceType.class, this::unmarshalReflectance)
                            .with(ReflectancePropertyType.class, this::unmarshalReflectanceProperty)
                            .with(RegularTimeSeriesType.class, this::unmarshalRegularTimeSeries)
                            .with(RegularTimeSeriesFileType.class, this::unmarshalRegularTimeSeriesFile)
                            .with(SolidMaterialType.class, this::unmarshalSolidMaterial)
                            .with(ThermalBoundaryType.class, this::unmarshalThermalBoundary)
                            .with(ThermalBoundaryPropertyType.class, this::unmarshalThermalBoundaryProperty)
                            .with(ThermalOpeningType.class, this::unmarshalThermalOpening)
                            .with(ThermalOpeningPropertyType.class, this::unmarshalThermalOpeningProperty)
                            .with(ThermalZoneType.class, this::unmarshalThermalZone)
                            .with(ThermalZonePropertyType.class, this::unmarshalThermalZoneProperty)
                            .with(TimeValuesPropertiesType.class, this::unmarshalTimeValuesProperties)
                            .with(TimeValuesPropertiesPropertyType.class, this::unmarshalTimeValuesPropertiesProperty)
                            .with(TransmittanceType.class, this::unmarshalTransmittance)
                            .with(TransmittancePropertyType.class, this::unmarshalTransmittanceProperty)
                            .with(UsageZoneType.class, this::unmarshalUsageZone)
                            .with(VolumeTypeType.class, this::unmarshalVolumeType)
                            .with(VolumeTypePropertyType.class, this::unmarshalVolumeTypeProperty)
                            .with(WeatherDataType.class, this::unmarshalWeatherData)
                            .with(WeatherDataPropertyType.class, this::unmarshalWeatherDataProperty)
                            .with(WeatherStationType.class, this::unmarshalWeatherStation)
                            .with(WeatherStationPropertyType.class, this::unmarshalWeatherStationProperty)
                            .with(JAXBElement.class, this::unmarshal);
                }
            } finally {
                lock.unlock();
            }
        }

        return typeMapper;
    }

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        final Object value = src.getValue();

        // generic application properties
        switch (src.getName().getLocalPart()) {
            case "buildingType":
                return new BuildingTypeProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType)value));
            case "constructionWeight":
                return new ConstructionWeightProperty(ConstructionWeightValue.fromValue(((org.sig3d.citygml._2.energy._1.ConstructionWeightValue)value).value()));
            case "demands":
                return new DemandsProperty(unmarshalEnergyDemandProperty((EnergyDemandPropertyType)value));
            case "floorArea":
                return new FloorAreaPropertyElement(unmarshalFloorAreaProperty((FloorAreaPropertyType)value));
            case "heightAboveGround":
                return new HeightAboveGroundPropertyElement(unmarshalHeightAboveGroundProperty((HeightAboveGroundPropertyType)value));
            case "referencePoint":
                return new ReferencePointProperty(helper.getGMLUnmarshaller().unmarshalPointProperty((PointPropertyType)value));
            case "thermalZone":
                return new ThermalZonePropertyElement(unmarshalAbstractThermalZoneProperty((AbstractThermalZonePropertyType)value));
            case "usageZone":
                return new UsageZoneProperty(unmarshalAbstractUsageZoneProperty((AbstractUsageZonePropertyType)value));
            case "volume":
                return new VolumeTypePropertyElement(unmarshalVolumeTypeProperty((VolumeTypePropertyType)value));
            case "weatherData":
                return new WeatherDataPropertyElement(unmarshalWeatherDataProperty((WeatherDataPropertyType)value));
        }

        // all other types
        return unmarshal(value);
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        return getTypeMapper().apply(src);
    }

    private void unmarshalAbstractConstruction(AbstractConstructionType src, AbstractConstruction dest) throws MissingADESchemaException {
        helper.getGMLUnmarshaller().unmarshalAbstractFeature(src, dest);
    }

    private AbstractConstructionProperty unmarshalAbstractConstructionProperty(AbstractConstructionPropertyType src) throws MissingADESchemaException {
        AbstractConstructionProperty dest = new AbstractConstructionProperty();

        if (src.isSetAbstractConstruction()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getAbstractConstruction());
            if (object instanceof AbstractConstruction)
                dest.setAbstractConstruction((AbstractConstruction)object);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalAbstractMaterial(AbstractMaterialType src, AbstractMaterial dest) throws MissingADESchemaException {
        helper.getGMLUnmarshaller().unmarshalAbstractFeature(src, dest);
    }

    private AbstractMaterialProperty unmarshalAbstractMaterialProperty(AbstractMaterialPropertyType src) throws MissingADESchemaException {
        AbstractMaterialProperty dest = new AbstractMaterialProperty();

        if (src.isSetAbstractMaterial()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getAbstractMaterial());
            if (object instanceof AbstractMaterial)
                dest.setAbstractMaterial((AbstractMaterial)object);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalAbstractSchedule(AbstractScheduleType src, AbstractSchedule dest) {
        helper.getGMLUnmarshaller().unmarshalAbstractGML(src, dest);
    }

    private AbstractScheduleProperty unmarshalAbstractScheduleProperty(AbstractSchedulePropertyType src) throws MissingADESchemaException {
        AbstractScheduleProperty dest = new AbstractScheduleProperty();

        if (src.isSetAbstractSchedule()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getAbstractSchedule());
            if (object instanceof AbstractSchedule)
                dest.setAbstractSchedule((AbstractSchedule)object);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalAbstractThermalZone(AbstractThermalZoneType src, AbstractThermalZone dest) throws MissingADESchemaException {
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        if (src.isSetContains()) {
            for (AbstractUsageZonePropertyType property : src.getContains())
                dest.addContains(unmarshalAbstractUsageZoneProperty(property));
        }
    }

    private AbstractThermalZoneProperty unmarshalAbstractThermalZoneProperty(AbstractThermalZonePropertyType src) throws MissingADESchemaException {
        AbstractThermalZoneProperty dest = new AbstractThermalZoneProperty();

        if (src.isSetAbstractThermalZone()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getAbstractThermalZone());
            if (object instanceof AbstractThermalZone)
                dest.setAbstractThermalZone((AbstractThermalZone)object);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalAbstractTimeSeries(AbstractTimeSeriesType src, AbstractTimeSeries dest) {
        helper.getGMLUnmarshaller().unmarshalAbstractGML(src, dest);

        if (src.isSetVariableProperties())
            dest.setVariableProperties(unmarshalTimeValuesPropertiesProperty(src.getVariableProperties()));
    }

    private AbstractTimeSeriesProperty unmarshalAbstractTimeSeriesProperty(AbstractTimeSeriesPropertyType src) throws MissingADESchemaException {
        AbstractTimeSeriesProperty dest = new AbstractTimeSeriesProperty();

        if (src.isSetAbstractTimeSeries()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getAbstractTimeSeries());
            if (object instanceof AbstractTimeSeries)
                dest.setAbstractTimeSeries((AbstractTimeSeries)object);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalAbstractUsageZone(AbstractUsageZoneType src, AbstractUsageZone dest) throws MissingADESchemaException {
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);
    }

    private AbstractUsageZoneProperty unmarshalAbstractUsageZoneProperty(AbstractUsageZonePropertyType src) throws MissingADESchemaException {
        AbstractUsageZoneProperty dest = new AbstractUsageZoneProperty();

        if (src.isSetAbstractUsageZone()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getAbstractUsageZone());
            if (object instanceof AbstractUsageZone)
                dest.setAbstractUsageZone((AbstractUsageZone)object);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private Construction unmarshalConstruction(ConstructionType src) throws MissingADESchemaException {
        Construction dest = new Construction();
        unmarshalAbstractConstruction(src, dest);

        if (src.isSetUValue())
            dest.setUValue(helper.getGMLUnmarshaller().unmarshalMeasure(src.getUValue()));

        if (src.isSetOpticalProperties())
            dest.setOpticalProperties(unmarshalOpticalPropertiesProperty(src.getOpticalProperties()));

        if (src.isSetLayer()) {
            for (LayerPropertyType property : src.getLayer())
                dest.addLayer(unmarshalLayerProperty(property));
        }

        return dest;
    }

    private DailyPatternSchedule unmarshalDailyPatternSchedule(DailyPatternScheduleType src) throws MissingADESchemaException {
        DailyPatternSchedule dest = new DailyPatternSchedule();
        unmarshalAbstractSchedule(src, dest);

        if (src.isSetPeriodOfYear()) {
            for (PeriodOfYearPropertyType property : src.getPeriodOfYear())
                dest.addPeriodOfYear(unmarshalPeriodOfYearProperty(property));
        }

        return dest;
    }

    private DailySchedule unmarshalDailySchedule(DailyScheduleType src) throws MissingADESchemaException {
        DailySchedule dest = new DailySchedule();

        if (src.isSetDayType())
            dest.setDayType(DayTypeValue.fromValue(src.getDayType().value()));

        if (src.isSetSchedule())
            dest.setSchedule(unmarshalAbstractTimeSeriesProperty(src.getSchedule()));

        return dest;
    }

    private DailyScheduleProperty unmarshalDailyScheduleProperty(DailySchedulePropertyType src) throws MissingADESchemaException {
        DailyScheduleProperty dest = new DailyScheduleProperty();

        if (src.isSetDailySchedule())
            dest.setDaySchedule(unmarshalDailySchedule(src.getDailySchedule()));

        return dest;
    }

    private DHWFacilities unmarshalDHWFacilities(DHWFacilitiesType src) throws MissingADESchemaException {
        DHWFacilities dest = new DHWFacilities();
        unmarshalFacilities(src, dest);

        return dest;
    }

    private ElectricalAppliances unmarshalElectricalAppliances(ElectricalAppliancesType src) throws MissingADESchemaException {
        ElectricalAppliances dest = new ElectricalAppliances();
        unmarshalFacilities(src, dest);

        return dest;
    }

    private EnergyDemand unmarshalEnergyDemand(EnergyDemandType src) throws MissingADESchemaException {
        EnergyDemand dest = new EnergyDemand();
        helper.getGMLUnmarshaller().unmarshalAbstractFeature(src, dest);

        if (src.isSetEnergyAmount())
            dest.setEnergyAmount(unmarshalAbstractTimeSeriesProperty(src.getEnergyAmount()));

        if (src.isSetEndUse())
            dest.setEndUse(EndUseTypeValue.fromValue(src.getEndUse().value()));

        if (src.isSetMaximumLoad())
            dest.setMaximumLoad(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMaximumLoad()));

        if (src.isSetEnergyCarrierType())
            dest.setEnergyCarrierType(helper.getGMLUnmarshaller().unmarshalCode(src.getEnergyCarrierType()));

        if (src.isSetDemandedBy()) {
            for (ReferenceType reference : src.getDemandedBy())
                dest.addDemandedBy(helper.getGMLUnmarshaller().unmarshalReference(reference));
        }

        return dest;
    }

    private EnergyDemandProperty unmarshalEnergyDemandProperty(EnergyDemandPropertyType src) throws MissingADESchemaException {
        EnergyDemandProperty dest = new EnergyDemandProperty();

        if (src.isSetEnergyDemand())
            dest.setEnergyDemand(unmarshalEnergyDemand(src.getEnergyDemand()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalFacilities(FacilitiesType src, Facilities dest) throws MissingADESchemaException {
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        if (src.isSetOperationSchedule())
            dest.setOperationSchedule(unmarshalAbstractScheduleProperty(src.getOperationSchedule()));

        if (src.isSetHeatDissipation())
            dest.setHeatDissipation(unmarshalHeatExchangeTypeProperty(src.getHeatDissipation()));
    }

    private Facilities unmarshalFacilities(FacilitiesType src) throws MissingADESchemaException {
        Facilities dest = new Facilities();
        unmarshalFacilities(src, dest);

        return dest;
    }

    private FacilitiesProperty unmarshalFacilitiesProperty(FacilitiesPropertyType src) throws MissingADESchemaException {
        FacilitiesProperty dest = new FacilitiesProperty();

        if (src.isSetFacilities()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getFacilities());
            if (object instanceof Facilities)
                dest.setFacilities((Facilities)object);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private FloorArea unmarshalFloorArea(FloorAreaType src) {
        FloorArea dest = new FloorArea();

        if (src.isSetType())
            dest.setType(FloorAreaTypeValue.fromValue(src.getType().value()));

        if (src.isSetValue())
            dest.setValue(helper.getGMLUnmarshaller().unmarshalArea(src.getValue()));

        return dest;
    }

    private FloorAreaProperty unmarshalFloorAreaProperty(FloorAreaPropertyType src) {
        FloorAreaProperty dest = new FloorAreaProperty();

        if (src.isSetFloorArea())
            dest.setFloorArea(unmarshalFloorArea(src.getFloorArea()));

        return dest;
    }

    private Gas unmarshalGas(GasType src) throws MissingADESchemaException {
        Gas dest = new Gas();
        unmarshalAbstractMaterial(src, dest);

        if (src.isSetIsVentilated())
            dest.setIsVentilated(src.isIsVentilated());

        if (src.isSetRValue())
            dest.setRValue(helper.getGMLUnmarshaller().unmarshalMeasure(src.getRValue()));

        return dest;
    }

    private HeatExchangeType unmarshalHeatExchangeType(HeatExchangeTypeType src) {
        HeatExchangeType dest = new HeatExchangeType();

        if (src.isSetConvectiveFraction())
            dest.setConvectiveFraction(helper.getGMLUnmarshaller().unmarshalScale(src.getConvectiveFraction()));

        if (src.isSetLatentFraction())
            dest.setLatentFraction(helper.getGMLUnmarshaller().unmarshalScale(src.getLatentFraction()));

        if (src.isSetRadiantFraction())
            dest.setRadiantFraction(helper.getGMLUnmarshaller().unmarshalScale(src.getRadiantFraction()));

        if (src.isSetTotalValue())
            dest.setTotalValue(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalValue()));

        return dest;
    }

    private HeatExchangeTypeProperty unmarshalHeatExchangeTypeProperty(HeatExchangeTypePropertyType src) {
        HeatExchangeTypeProperty dest = new HeatExchangeTypeProperty();

        if (src.isSetHeatExchangeType())
            dest.setHeatExchangeType(unmarshalHeatExchangeType(src.getHeatExchangeType()));

        return dest;
    }

    private HeightAboveGround unmarshalHeightAboveGround(HeightAboveGroundType src) {
        HeightAboveGround dest = new HeightAboveGround();

        if (src.isSetHeightReference())
            dest.setHeightReference(ElevationReferenceValue.fromValue(src.getHeightReference().value()));

        if (src.isSetValue())
            dest.setValue(helper.getGMLUnmarshaller().unmarshalLength(src.getValue()));

        return dest;
    }

    private HeightAboveGroundProperty unmarshalHeightAboveGroundProperty(HeightAboveGroundPropertyType src) {
        HeightAboveGroundProperty dest = new HeightAboveGroundProperty();

        if (src.isSetHeightAboveGround())
            dest.setHeightAboveGround(unmarshalHeightAboveGround(src.getHeightAboveGround()));

        return dest;
    }

    private LayerComponent unmarshalLayerComponent(LayerComponentType src) throws MissingADESchemaException {
        LayerComponent dest = new LayerComponent();
        helper.getGMLUnmarshaller().unmarshalAbstractFeature(src, dest);

        if (src.isSetAreaFraction())
            dest.setAreaFraction(helper.getGMLUnmarshaller().unmarshalScale(src.getAreaFraction()));

        if (src.isSetThickness())
            dest.setThickness(helper.getGMLUnmarshaller().unmarshalLength(src.getThickness()));

        if (src.isSetMaterial())
            dest.setMaterial(unmarshalAbstractMaterialProperty(src.getMaterial()));

        return dest;
    }

    private LayerComponentProperty unmarshalLayerComponentProperty(LayerComponentPropertyType src) throws MissingADESchemaException {
        LayerComponentProperty dest = new LayerComponentProperty();

        if (src.isSetLayerComponent())
            dest.setLayerComponent(unmarshalLayerComponent(src.getLayerComponent()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private Layer unmarshalLayer(LayerType src) throws MissingADESchemaException {
        Layer dest = new Layer();
        helper.getGMLUnmarshaller().unmarshalAbstractFeature(src, dest);

        if (src.isSetLayerComponent()) {
            for (LayerComponentPropertyType property : src.getLayerComponent())
                dest.addLayerComponent(unmarshalLayerComponentProperty(property));
        }

        return dest;
    }

    private LayerProperty unmarshalLayerProperty(LayerPropertyType src) throws MissingADESchemaException {
        LayerProperty dest = new LayerProperty();

        if (src.isSetLayer())
            dest.setLayer(unmarshalLayer(src.getLayer()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private LightingFacilities unmarshalLightingFacilities(LightingFacilitiesType src) throws MissingADESchemaException {
        LightingFacilities dest = new LightingFacilities();
        unmarshalFacilities(src, dest);

        return dest;
    }

    private Occupants unmarshalOccupants(OccupantsType src) throws MissingADESchemaException {
        Occupants dest = new Occupants();
        helper.getGMLUnmarshaller().unmarshalAbstractFeature(src, dest);

        if (src.isSetHeatDissipation())
            dest.setHeatDissipation(unmarshalHeatExchangeTypeProperty(src.getHeatDissipation()));

        if (src.isSetNumberOfOccupants())
            dest.setNumberOfOccupants(src.getNumberOfOccupants());

        if (src.isSetOccupancyRate())
            dest.setOccupancyRate(unmarshalAbstractScheduleProperty(src.getOccupancyRate()));

        return dest;
    }

    private OccupantsProperty unmarshalOccupantsProperty(OccupantsPropertyType src) throws MissingADESchemaException {
        OccupantsProperty dest = new OccupantsProperty();

        if (src.isSetOccupants())
            dest.setOccupants(unmarshalOccupants(src.getOccupants()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private OpticalProperties unmarshalOpticalProperties(OpticalPropertiesType src) {
        OpticalProperties dest = new OpticalProperties();

        if (src.isSetReflectance()) {
            for (ReflectancePropertyType property : src.getReflectance())
                dest.addReflectance(unmarshalReflectanceProperty(property));
        }

        if (src.isSetTransmittance()) {
            for (TransmittancePropertyType property : src.getTransmittance())
                dest.addTransmittance(unmarshalTransmittanceProperty(property));
        }

        if (src.isSetGlazingRatio())
            dest.setGlazingRatio(helper.getGMLUnmarshaller().unmarshalScale(src.getGlazingRatio()));

        return dest;
    }

    private OpticalPropertiesProperty unmarshalOpticalPropertiesProperty(OpticalPropertiesPropertyType src) {
        OpticalPropertiesProperty dest = new OpticalPropertiesProperty();

        if (src.isSetOpticalProperties())
            dest.setOpticalProperties(unmarshalOpticalProperties(src.getOpticalProperties()));

        return dest;
    }

    private PeriodOfYear unmarshalPeriodOfYear(PeriodOfYearType src) throws MissingADESchemaException {
        PeriodOfYear dest = new PeriodOfYear();

        if (src.isSetPeriod())
            dest.setPeriod(unmarshalTimePeriodProperty(src.getPeriod()));

        if (src.isSetDailySchedule()) {
            for (DailySchedulePropertyType property : src.getDailySchedule())
                dest.addDailySchedule(unmarshalDailyScheduleProperty(property));
        }

        return dest;
    }

    private PeriodOfYearProperty unmarshalPeriodOfYearProperty(PeriodOfYearPropertyType src) throws MissingADESchemaException {
        PeriodOfYearProperty dest = new PeriodOfYearProperty();

        if (src.isSetPeriodOfYear())
            dest.setPeriodOfYear(unmarshalPeriodOfYear(src.getPeriodOfYear()));

        return dest;
    }

    private Reflectance unmarshalReflectance(ReflectanceType src) {
        Reflectance dest = new Reflectance();

        if (src.isSetFraction())
            dest.setFraction(helper.getGMLUnmarshaller().unmarshalScale(src.getFraction()));

        if (src.isSetSurface())
            dest.setSurface(SurfaceSide.fromValue(src.getSurface().value()));

        if (src.isSetWavelengthRange())
            dest.setWavelengthRangeType(WavelengthRangeType.fromValue(src.getWavelengthRange().value()));

        return dest;
    }

    private ReflectanceProperty unmarshalReflectanceProperty(ReflectancePropertyType src) {
        ReflectanceProperty dest = new ReflectanceProperty();

        if (src.isSetReflectance())
            dest.setReflectance(unmarshalReflectance(src.getReflectance()));

        return dest;
    }

    private RegularTimeSeries unmarshalRegularTimeSeries(RegularTimeSeriesType src) {
        RegularTimeSeries dest = new RegularTimeSeries();
        unmarshalAbstractTimeSeries(src, dest);

        if (src.isSetTemporalExtent())
            dest.setTemporalExtent(unmarshalTimePeriodProperty(src.getTemporalExtent()));

        if (src.isSetTimeInterval())
            dest.setTimeInterval(unmarshalTimeIntervalLength(src.getTimeInterval()));

        if (src.isSetValues())
            dest.setValues(helper.getGMLUnmarshaller().unmarshalMeasureList(src.getValues()));

        return dest;
    }

    private RegularTimeSeriesFile unmarshalRegularTimeSeriesFile(RegularTimeSeriesFileType src) {
        RegularTimeSeriesFile dest = new RegularTimeSeriesFile();
        unmarshalAbstractTimeSeries(src, dest);

        if (src.isSetUom() && src.getUom().isSetUom())
            dest.setUom(src.getUom().getUom());

        if (src.isSetFile())
            dest.setFile(src.getFile());

        if (src.isSetTemporalExtent())
            dest.setTemporalExtent(unmarshalTimePeriodProperty(src.getTemporalExtent()));

        if (src.isSetTimeInterval())
            dest.setTimeInterval(unmarshalTimeIntervalLength(src.getTimeInterval()));

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

    private SolidMaterial unmarshalSolidMaterial(SolidMaterialType src) throws MissingADESchemaException {
        SolidMaterial dest = new SolidMaterial();
        unmarshalAbstractMaterial(src, dest);

        if (src.isSetConductivity())
            dest.setConductivity(helper.getGMLUnmarshaller().unmarshalMeasure(src.getConductivity()));

        if (src.isSetDensity())
            dest.setDensity(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDensity()));

        if (src.isSetPermeance())
            dest.setPermeance(helper.getGMLUnmarshaller().unmarshalMeasure(src.getPermeance()));

        if (src.isSetSpecificHeat())
            dest.setSpecificHeat(helper.getGMLUnmarshaller().unmarshalMeasure(src.getSpecificHeat()));

        return dest;
    }

    private ThermalBoundary unmarshalThermalBoundary(ThermalBoundaryType src) throws MissingADESchemaException {
        ThermalBoundary dest = new ThermalBoundary();
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        if (src.isSetThermalBoundaryType())
            dest.setThermalBoundaryType(ThermalBoundaryTypeValue.fromValue(src.getThermalBoundaryType().value()));

        if (src.isSetAzimuth())
            dest.setAzimuth(helper.getGMLUnmarshaller().unmarshalAngle(src.getAzimuth()));

        if (src.isSetInclination())
            dest.setInclination(helper.getGMLUnmarshaller().unmarshalAngle(src.getInclination()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalArea(src.getArea()));

        if (src.isSetSurfaceGeometry())
            dest.setSurfaceGeometry(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getSurfaceGeometry()));

        if (src.isSetConstruction())
            dest.setConstruction(unmarshalAbstractConstructionProperty(src.getConstruction()));

        if (src.isSetContains()) {
            for (ThermalOpeningPropertyType property : src.getContains())
                dest.addContains(unmarshalThermalOpeningProperty(property));
        }

        if (src.isSetDelimits()) {
            for (ThermalZonePropertyType property : src.getDelimits())
                dest.addDelimits(unmarshalThermalZoneProperty(property));
        }

        return dest;
    }

    private ThermalBoundaryProperty unmarshalThermalBoundaryProperty(ThermalBoundaryPropertyType src) throws MissingADESchemaException {
        ThermalBoundaryProperty dest = new ThermalBoundaryProperty();

        if (src.isSetThermalBoundary())
            dest.setThermalBoundary(unmarshalThermalBoundary(src.getThermalBoundary()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private ThermalOpening unmarshalThermalOpening(ThermalOpeningType src) throws MissingADESchemaException {
        ThermalOpening dest = new ThermalOpening();
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalArea(src.getArea()));

        if (src.isSetConstruction())
            dest.setConstruction(unmarshalAbstractConstructionProperty(src.getConstruction()));

        if (src.isSetSurfaceGeometry())
            dest.setSurfaceGeometry(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getSurfaceGeometry()));

        return dest;
    }

    private ThermalOpeningProperty unmarshalThermalOpeningProperty(ThermalOpeningPropertyType src) throws MissingADESchemaException {
        ThermalOpeningProperty dest = new ThermalOpeningProperty();

        if (src.isSetThermalOpening())
            dest.setThermalOpening(unmarshalThermalOpening(src.getThermalOpening()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private ThermalZone unmarshalThermalZone(ThermalZoneType src) throws MissingADESchemaException {
        ThermalZone dest = new ThermalZone();
        unmarshalAbstractThermalZone(src, dest);

        if (src.isSetFloorArea()) {
            for (FloorAreaPropertyType property : src.getFloorArea())
                dest.addFloorArea(unmarshalFloorAreaProperty(property));
        }

        if (src.isSetVolume()) {
            for (VolumeTypePropertyType property : src.getVolume())
                dest.addVolume(unmarshalVolumeTypeProperty(property));
        }

        if (src.isSetInfiltrationRate())
            dest.setInfiltrationRate(helper.getGMLUnmarshaller().unmarshalMeasure(src.getInfiltrationRate()));

        if (src.isSetIsCooled())
            dest.setIsCooled(src.isIsCooled());

        if (src.isSetIsHeated())
            dest.setIsHeated(src.isIsHeated());

        if (src.isSetVolumeGeometry())
            dest.setVolumeGeometry(helper.getGMLUnmarshaller().unmarshalSolidProperty(src.getVolumeGeometry()));

        if (src.isSetThermalBoundary()) {
            for (ThermalBoundaryPropertyType property : src.getThermalBoundary())
                dest.addThermalBoundary(unmarshalThermalBoundaryProperty(property));
        }

        return dest;
    }

    private ThermalZoneProperty unmarshalThermalZoneProperty(ThermalZonePropertyType src) throws MissingADESchemaException {
        ThermalZoneProperty dest = new ThermalZoneProperty();

        if (src.isSetThermalZone())
            dest.setThermalZone(unmarshalThermalZone(src.getThermalZone()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private TimeIntervalLength unmarshalTimeIntervalLength(TimeIntervalLengthType src) {
        TimeIntervalLength dest = new TimeIntervalLength();

        if (src.isSetValue())
            dest.setValue(src.getValue().doubleValue());

        if (src.isSetUnit())
            dest.setUnit(src.getUnit());

        if (src.isSetRadix())
            dest.setRadix(src.getRadix().intValue());

        if (src.isSetFactor())
            dest.setFactor(src.getFactor().intValue());

        return dest;
    }

    private TimePeriod unmarshalTimePeriod(TimePeriodType src) {
        TimePeriod dest = new TimePeriod();

        if (src.isSetBeginPosition()) {
            TimePositionType timePosition = src.getBeginPosition();

            for (String value : timePosition.getValue()) {
                XMLGregorianCalendar calendar = helper.getJAXBUnmarshaller().getDataTypeFactory().newXMLGregorianCalendar(value);
                if (calendar != null) {
                    if (calendar.getTimezone() == DatatypeConstants.FIELD_UNDEFINED)
                        calendar.setTimezone(0);

                    dest.setBeginPosition(calendar.toGregorianCalendar().toZonedDateTime());
                    break;
                }
            }
        }

        if (src.isSetEndPosition()) {
            TimePositionType timePosition = src.getEndPosition();

            for (String value : timePosition.getValue()) {
                XMLGregorianCalendar calendar = helper.getJAXBUnmarshaller().getDataTypeFactory().newXMLGregorianCalendar(value);
                if (calendar != null) {
                    if (calendar.getTimezone() == DatatypeConstants.FIELD_UNDEFINED)
                        calendar.setTimezone(0);

                    dest.setEndPosition(calendar.toGregorianCalendar().toZonedDateTime());
                    break;
                }
            }
        }

        return dest;
    }

    private TimePeriodProperty unmarshalTimePeriodProperty(TimePeriodPropertyType src) {
        TimePeriodProperty dest = new TimePeriodProperty();

        if (src.isSetTimePeriod())
            dest.setTimePeriod(unmarshalTimePeriod(src.getTimePeriod()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private TimeValuesProperties unmarshalTimeValuesProperties(TimeValuesPropertiesType src) {
        TimeValuesProperties dest = new TimeValuesProperties();

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

    private TimeValuesPropertiesProperty unmarshalTimeValuesPropertiesProperty(TimeValuesPropertiesPropertyType src) {
        TimeValuesPropertiesProperty dest = new TimeValuesPropertiesProperty();

        if (src.isSetTimeValuesProperties())
            dest.setTimeValuesProperties(unmarshalTimeValuesProperties(src.getTimeValuesProperties()));

        return dest;
    }

    private Transmittance unmarshalTransmittance(TransmittanceType src) {
        Transmittance dest = new Transmittance();

        if (src.isSetFraction())
            dest.setFraction(helper.getGMLUnmarshaller().unmarshalScale(src.getFraction()));

        if (src.isSetWavelengthRange())
            dest.setWavelengthRangeType(WavelengthRangeType.fromValue(src.getWavelengthRange().value()));

        return dest;
    }

    private TransmittanceProperty unmarshalTransmittanceProperty(TransmittancePropertyType src) {
        TransmittanceProperty dest = new TransmittanceProperty();

        if (src.isSetTransmittance())
            dest.setTransmittance(unmarshalTransmittance(src.getTransmittance()));

        return dest;
    }

    private UsageZone unmarshalUsageZone(UsageZoneType src) throws MissingADESchemaException {
        UsageZone dest = new UsageZone();
        unmarshalAbstractUsageZone(src, dest);

        if (src.isSetCoolingSchedule())
            dest.setCoolingSchedule(unmarshalAbstractScheduleProperty(src.getCoolingSchedule()));

        if (src.isSetHeatingSchedule())
            dest.setHeatingSchedule(unmarshalAbstractScheduleProperty(src.getHeatingSchedule()));

        if (src.isSetUsageZoneType())
            dest.setUsageZoneType(helper.getGMLUnmarshaller().unmarshalCode(src.getUsageZoneType()));

        if (src.isSetVentilationSchedule())
            dest.setVentilationSchedule(unmarshalAbstractScheduleProperty(src.getVentilationSchedule()));

        if (src.isSetFloorArea()) {
            for (FloorAreaPropertyType property : src.getFloorArea())
                dest.addFloorArea(unmarshalFloorAreaProperty(property));
        }

        if (src.isSetOccupiedBy()) {
            for (OccupantsPropertyType property : src.getOccupiedBy())
                dest.addOccupiedBy(unmarshalOccupantsProperty(property));
        }

        if (src.isSetEquippedWith()) {
            for (FacilitiesPropertyType property : src.getEquippedWith())
                dest.addEquippedWith(unmarshalFacilitiesProperty(property));
        }

        return dest;
    }

    private VolumeType unmarshalVolumeType(VolumeTypeType src) {
        VolumeType dest = new VolumeType();

        if (src.isSetType())
            dest.setType(VolumeTypeValue.fromValue(src.getType().value()));

        if (src.isSetValue())
            dest.setValue(helper.getGMLUnmarshaller().unmarshalVolume(src.getValue()));

        return dest;
    }

    private VolumeTypeProperty unmarshalVolumeTypeProperty(VolumeTypePropertyType src) {
        VolumeTypeProperty dest = new VolumeTypeProperty();

        if (src.isSetVolumeType())
            dest.setVolumeType(unmarshalVolumeType(src.getVolumeType()));

        return dest;
    }

    private WeatherData unmarshalWeatherData(WeatherDataType src) throws MissingADESchemaException {
        WeatherData dest = new WeatherData();
        helper.getGMLUnmarshaller().unmarshalAbstractGML(src, dest);

        if (src.isSetWeatherDataType())
            dest.setWeatherDataType(WeatherDataTypeValue.fromValue(src.getWeatherDataType().value()));

        if (src.isSetValues())
            dest.setValues(unmarshalAbstractTimeSeriesProperty(src.getValues()));

        if (src.isSetPosition())
            dest.setPosition(helper.getGMLUnmarshaller().unmarshalPointProperty(src.getPosition()));

        return dest;
    }

    private WeatherDataProperty unmarshalWeatherDataProperty(WeatherDataPropertyType src) throws MissingADESchemaException {
        WeatherDataProperty dest = new WeatherDataProperty();

        if (src.isSetWeatherData())
            dest.setWeatherData(unmarshalWeatherData(src.getWeatherData()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private WeatherStation unmarshalWeatherStation(WeatherStationType src) throws MissingADESchemaException {
        WeatherStation dest = new WeatherStation();
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        if (src.isSetStationName())
            dest.setStationName(src.getStationName());

        if (src.isSetPosition())
            dest.setPosition(helper.getGMLUnmarshaller().unmarshalPointProperty(src.getPosition()));

        if (src.isSetParameter()) {
            for (WeatherDataPropertyType property : src.getParameter())
                dest.addParameter(unmarshalWeatherDataProperty(property));
        }

        return dest;
    }

    private WeatherStationProperty unmarshalWeatherStationProperty(WeatherStationPropertyType src) throws MissingADESchemaException {
        WeatherStationProperty dest = new WeatherStationProperty();

        if (src.isSetWeatherStation())
            dest.setWeatherStation(unmarshalWeatherStation(src.getWeatherStation()));

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }
}
