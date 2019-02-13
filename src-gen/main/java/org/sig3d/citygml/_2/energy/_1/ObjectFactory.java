//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Feb 13 16:55:57 CET 2019
//


package org.sig3d.citygml._2.energy._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.opengis.gml.CodeType;
import net.opengis.gml.PointPropertyType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sig3d.citygml._2.energy._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuildingType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "buildingType");
    private final static QName _ConstructionWeight_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "constructionWeight");
    private final static QName _Volume_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "volume");
    private final static QName _ReferencePoint_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "referencePoint");
    private final static QName _ThermalZoneProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "thermalZone");
    private final static QName _UsageZoneProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "usageZone");
    private final static QName _FloorAreaProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "floorArea");
    private final static QName _HeightAboveGroundProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "heightAboveGround");
    private final static QName _WeatherDataProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "weatherData");
    private final static QName _Demands_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "demands");
    private final static QName _AbstractConstruction_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "AbstractConstruction");
    private final static QName _AbstractThermalZone_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "AbstractThermalZone");
    private final static QName _AbstractUsageZone_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "AbstractUsageZone");
    private final static QName _EnergyDemand_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "EnergyDemand");
    private final static QName _FloorArea_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "FloorArea");
    private final static QName _HeatExchangeType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "HeatExchangeType");
    private final static QName _HeightAboveGround_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "HeightAboveGround");
    private final static QName _Transmittance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "Transmittance");
    private final static QName _VolumeType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "VolumeType");
    private final static QName _WeatherData_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "WeatherData");
    private final static QName _ThermalBoundary_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "ThermalBoundary");
    private final static QName _ThermalOpening_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "ThermalOpening");
    private final static QName _ThermalZone_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "ThermalZone");
    private final static QName _AbstractMaterial_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "AbstractMaterial");
    private final static QName _Construction_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "Construction");
    private final static QName _Gas_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "Gas");
    private final static QName _Layer_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "Layer");
    private final static QName _LayerComponent_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "LayerComponent");
    private final static QName _OpticalProperties_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "OpticalProperties");
    private final static QName _Reflectance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "Reflectance");
    private final static QName _SolidMaterial_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "SolidMaterial");
    private final static QName _DHWFacilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "DHWFacilities");
    private final static QName _Facilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "Facilities");
    private final static QName _ElectricalAppliances_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "ElectricalAppliances");
    private final static QName _LightingFacilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "LightingFacilities");
    private final static QName _Occupants_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "Occupants");
    private final static QName _UsageZone_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "UsageZone");
    private final static QName _AbstractSchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "AbstractSchedule");
    private final static QName _AbstractTimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "AbstractTimeSeries");
    private final static QName _DailyPatternSchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "DailyPatternSchedule");
    private final static QName _DailySchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "DailySchedule");
    private final static QName _PeriodOfYear_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "PeriodOfYear");
    private final static QName _RegularTimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "RegularTimeSeries");
    private final static QName _RegularTimeSeriesFile_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "RegularTimeSeriesFile");
    private final static QName _TimeValuesProperties_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "TimeValuesProperties");
    private final static QName _WeatherStation_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "WeatherStation");
    private final static QName __GenericApplicationPropertyOfWeatherStation_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/1.0", "_GenericApplicationPropertyOfWeatherStation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sig3d.citygml._2.energy._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VolumeTypePropertyType }
     * 
     */
    public VolumeTypePropertyType createVolumeTypePropertyType() {
        return new VolumeTypePropertyType();
    }

    /**
     * Create an instance of {@link AbstractThermalZonePropertyType }
     * 
     */
    public AbstractThermalZonePropertyType createAbstractThermalZonePropertyType() {
        return new AbstractThermalZonePropertyType();
    }

    /**
     * Create an instance of {@link AbstractUsageZonePropertyType }
     * 
     */
    public AbstractUsageZonePropertyType createAbstractUsageZonePropertyType() {
        return new AbstractUsageZonePropertyType();
    }

    /**
     * Create an instance of {@link FloorAreaPropertyType }
     * 
     */
    public FloorAreaPropertyType createFloorAreaPropertyType() {
        return new FloorAreaPropertyType();
    }

    /**
     * Create an instance of {@link HeightAboveGroundPropertyType }
     * 
     */
    public HeightAboveGroundPropertyType createHeightAboveGroundPropertyType() {
        return new HeightAboveGroundPropertyType();
    }

    /**
     * Create an instance of {@link WeatherDataPropertyType }
     * 
     */
    public WeatherDataPropertyType createWeatherDataPropertyType() {
        return new WeatherDataPropertyType();
    }

    /**
     * Create an instance of {@link EnergyDemandPropertyType }
     * 
     */
    public EnergyDemandPropertyType createEnergyDemandPropertyType() {
        return new EnergyDemandPropertyType();
    }

    /**
     * Create an instance of {@link EnergyDemandType }
     * 
     */
    public EnergyDemandType createEnergyDemandType() {
        return new EnergyDemandType();
    }

    /**
     * Create an instance of {@link FloorAreaType }
     * 
     */
    public FloorAreaType createFloorAreaType() {
        return new FloorAreaType();
    }

    /**
     * Create an instance of {@link HeatExchangeTypeType }
     * 
     */
    public HeatExchangeTypeType createHeatExchangeTypeType() {
        return new HeatExchangeTypeType();
    }

    /**
     * Create an instance of {@link HeightAboveGroundType }
     * 
     */
    public HeightAboveGroundType createHeightAboveGroundType() {
        return new HeightAboveGroundType();
    }

    /**
     * Create an instance of {@link TransmittanceType }
     * 
     */
    public TransmittanceType createTransmittanceType() {
        return new TransmittanceType();
    }

    /**
     * Create an instance of {@link VolumeTypeType }
     * 
     */
    public VolumeTypeType createVolumeTypeType() {
        return new VolumeTypeType();
    }

    /**
     * Create an instance of {@link WeatherDataType }
     * 
     */
    public WeatherDataType createWeatherDataType() {
        return new WeatherDataType();
    }

    /**
     * Create an instance of {@link ThermalBoundaryType }
     * 
     */
    public ThermalBoundaryType createThermalBoundaryType() {
        return new ThermalBoundaryType();
    }

    /**
     * Create an instance of {@link ThermalOpeningType }
     * 
     */
    public ThermalOpeningType createThermalOpeningType() {
        return new ThermalOpeningType();
    }

    /**
     * Create an instance of {@link ThermalZoneType }
     * 
     */
    public ThermalZoneType createThermalZoneType() {
        return new ThermalZoneType();
    }

    /**
     * Create an instance of {@link ConstructionType }
     * 
     */
    public ConstructionType createConstructionType() {
        return new ConstructionType();
    }

    /**
     * Create an instance of {@link GasType }
     * 
     */
    public GasType createGasType() {
        return new GasType();
    }

    /**
     * Create an instance of {@link LayerType }
     * 
     */
    public LayerType createLayerType() {
        return new LayerType();
    }

    /**
     * Create an instance of {@link LayerComponentType }
     * 
     */
    public LayerComponentType createLayerComponentType() {
        return new LayerComponentType();
    }

    /**
     * Create an instance of {@link OpticalPropertiesType }
     * 
     */
    public OpticalPropertiesType createOpticalPropertiesType() {
        return new OpticalPropertiesType();
    }

    /**
     * Create an instance of {@link ReflectanceType }
     * 
     */
    public ReflectanceType createReflectanceType() {
        return new ReflectanceType();
    }

    /**
     * Create an instance of {@link SolidMaterialType }
     * 
     */
    public SolidMaterialType createSolidMaterialType() {
        return new SolidMaterialType();
    }

    /**
     * Create an instance of {@link DHWFacilitiesType }
     * 
     */
    public DHWFacilitiesType createDHWFacilitiesType() {
        return new DHWFacilitiesType();
    }

    /**
     * Create an instance of {@link FacilitiesType }
     * 
     */
    public FacilitiesType createFacilitiesType() {
        return new FacilitiesType();
    }

    /**
     * Create an instance of {@link ElectricalAppliancesType }
     * 
     */
    public ElectricalAppliancesType createElectricalAppliancesType() {
        return new ElectricalAppliancesType();
    }

    /**
     * Create an instance of {@link LightingFacilitiesType }
     * 
     */
    public LightingFacilitiesType createLightingFacilitiesType() {
        return new LightingFacilitiesType();
    }

    /**
     * Create an instance of {@link OccupantsType }
     * 
     */
    public OccupantsType createOccupantsType() {
        return new OccupantsType();
    }

    /**
     * Create an instance of {@link UsageZoneType }
     * 
     */
    public UsageZoneType createUsageZoneType() {
        return new UsageZoneType();
    }

    /**
     * Create an instance of {@link DailyPatternScheduleType }
     * 
     */
    public DailyPatternScheduleType createDailyPatternScheduleType() {
        return new DailyPatternScheduleType();
    }

    /**
     * Create an instance of {@link DailyScheduleType }
     * 
     */
    public DailyScheduleType createDailyScheduleType() {
        return new DailyScheduleType();
    }

    /**
     * Create an instance of {@link PeriodOfYearType }
     * 
     */
    public PeriodOfYearType createPeriodOfYearType() {
        return new PeriodOfYearType();
    }

    /**
     * Create an instance of {@link RegularTimeSeriesType }
     * 
     */
    public RegularTimeSeriesType createRegularTimeSeriesType() {
        return new RegularTimeSeriesType();
    }

    /**
     * Create an instance of {@link RegularTimeSeriesFileType }
     * 
     */
    public RegularTimeSeriesFileType createRegularTimeSeriesFileType() {
        return new RegularTimeSeriesFileType();
    }

    /**
     * Create an instance of {@link TimeValuesPropertiesType }
     * 
     */
    public TimeValuesPropertiesType createTimeValuesPropertiesType() {
        return new TimeValuesPropertiesType();
    }

    /**
     * Create an instance of {@link WeatherStationType }
     * 
     */
    public WeatherStationType createWeatherStationType() {
        return new WeatherStationType();
    }

    /**
     * Create an instance of {@link AbstractConstructionPropertyType }
     * 
     */
    public AbstractConstructionPropertyType createAbstractConstructionPropertyType() {
        return new AbstractConstructionPropertyType();
    }

    /**
     * Create an instance of {@link HeatExchangeTypePropertyType }
     * 
     */
    public HeatExchangeTypePropertyType createHeatExchangeTypePropertyType() {
        return new HeatExchangeTypePropertyType();
    }

    /**
     * Create an instance of {@link TransmittancePropertyType }
     * 
     */
    public TransmittancePropertyType createTransmittancePropertyType() {
        return new TransmittancePropertyType();
    }

    /**
     * Create an instance of {@link ThermalBoundaryPropertyType }
     * 
     */
    public ThermalBoundaryPropertyType createThermalBoundaryPropertyType() {
        return new ThermalBoundaryPropertyType();
    }

    /**
     * Create an instance of {@link ThermalOpeningPropertyType }
     * 
     */
    public ThermalOpeningPropertyType createThermalOpeningPropertyType() {
        return new ThermalOpeningPropertyType();
    }

    /**
     * Create an instance of {@link ThermalZonePropertyType }
     * 
     */
    public ThermalZonePropertyType createThermalZonePropertyType() {
        return new ThermalZonePropertyType();
    }

    /**
     * Create an instance of {@link AbstractMaterialPropertyType }
     * 
     */
    public AbstractMaterialPropertyType createAbstractMaterialPropertyType() {
        return new AbstractMaterialPropertyType();
    }

    /**
     * Create an instance of {@link ConstructionPropertyType }
     * 
     */
    public ConstructionPropertyType createConstructionPropertyType() {
        return new ConstructionPropertyType();
    }

    /**
     * Create an instance of {@link GasPropertyType }
     * 
     */
    public GasPropertyType createGasPropertyType() {
        return new GasPropertyType();
    }

    /**
     * Create an instance of {@link LayerPropertyType }
     * 
     */
    public LayerPropertyType createLayerPropertyType() {
        return new LayerPropertyType();
    }

    /**
     * Create an instance of {@link LayerComponentPropertyType }
     * 
     */
    public LayerComponentPropertyType createLayerComponentPropertyType() {
        return new LayerComponentPropertyType();
    }

    /**
     * Create an instance of {@link OpticalPropertiesPropertyType }
     * 
     */
    public OpticalPropertiesPropertyType createOpticalPropertiesPropertyType() {
        return new OpticalPropertiesPropertyType();
    }

    /**
     * Create an instance of {@link ReflectancePropertyType }
     * 
     */
    public ReflectancePropertyType createReflectancePropertyType() {
        return new ReflectancePropertyType();
    }

    /**
     * Create an instance of {@link SolidMaterialPropertyType }
     * 
     */
    public SolidMaterialPropertyType createSolidMaterialPropertyType() {
        return new SolidMaterialPropertyType();
    }

    /**
     * Create an instance of {@link DHWFacilitiesPropertyType }
     * 
     */
    public DHWFacilitiesPropertyType createDHWFacilitiesPropertyType() {
        return new DHWFacilitiesPropertyType();
    }

    /**
     * Create an instance of {@link ElectricalAppliancesPropertyType }
     * 
     */
    public ElectricalAppliancesPropertyType createElectricalAppliancesPropertyType() {
        return new ElectricalAppliancesPropertyType();
    }

    /**
     * Create an instance of {@link FacilitiesPropertyType }
     * 
     */
    public FacilitiesPropertyType createFacilitiesPropertyType() {
        return new FacilitiesPropertyType();
    }

    /**
     * Create an instance of {@link LightingFacilitiesPropertyType }
     * 
     */
    public LightingFacilitiesPropertyType createLightingFacilitiesPropertyType() {
        return new LightingFacilitiesPropertyType();
    }

    /**
     * Create an instance of {@link OccupantsPropertyType }
     * 
     */
    public OccupantsPropertyType createOccupantsPropertyType() {
        return new OccupantsPropertyType();
    }

    /**
     * Create an instance of {@link UsageZonePropertyType }
     * 
     */
    public UsageZonePropertyType createUsageZonePropertyType() {
        return new UsageZonePropertyType();
    }

    /**
     * Create an instance of {@link AbstractSchedulePropertyType }
     * 
     */
    public AbstractSchedulePropertyType createAbstractSchedulePropertyType() {
        return new AbstractSchedulePropertyType();
    }

    /**
     * Create an instance of {@link AbstractTimeSeriesPropertyType }
     * 
     */
    public AbstractTimeSeriesPropertyType createAbstractTimeSeriesPropertyType() {
        return new AbstractTimeSeriesPropertyType();
    }

    /**
     * Create an instance of {@link DailyPatternSchedulePropertyType }
     * 
     */
    public DailyPatternSchedulePropertyType createDailyPatternSchedulePropertyType() {
        return new DailyPatternSchedulePropertyType();
    }

    /**
     * Create an instance of {@link DailySchedulePropertyType }
     * 
     */
    public DailySchedulePropertyType createDailySchedulePropertyType() {
        return new DailySchedulePropertyType();
    }

    /**
     * Create an instance of {@link PeriodOfYearPropertyType }
     * 
     */
    public PeriodOfYearPropertyType createPeriodOfYearPropertyType() {
        return new PeriodOfYearPropertyType();
    }

    /**
     * Create an instance of {@link RegularTimeSeriesPropertyType }
     * 
     */
    public RegularTimeSeriesPropertyType createRegularTimeSeriesPropertyType() {
        return new RegularTimeSeriesPropertyType();
    }

    /**
     * Create an instance of {@link RegularTimeSeriesFilePropertyType }
     * 
     */
    public RegularTimeSeriesFilePropertyType createRegularTimeSeriesFilePropertyType() {
        return new RegularTimeSeriesFilePropertyType();
    }

    /**
     * Create an instance of {@link TimeValuesPropertiesPropertyType }
     * 
     */
    public TimeValuesPropertiesPropertyType createTimeValuesPropertiesPropertyType() {
        return new TimeValuesPropertiesPropertyType();
    }

    /**
     * Create an instance of {@link WeatherStationPropertyType }
     * 
     */
    public WeatherStationPropertyType createWeatherStationPropertyType() {
        return new WeatherStationPropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "buildingType", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<CodeType> createBuildingType(CodeType value) {
        return new JAXBElement<CodeType>(_BuildingType_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionWeightValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionWeightValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "constructionWeight", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<ConstructionWeightValue> createConstructionWeight(ConstructionWeightValue value) {
        return new JAXBElement<ConstructionWeightValue>(_ConstructionWeight_QNAME, ConstructionWeightValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumeTypePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolumeTypePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "volume", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<VolumeTypePropertyType> createVolume(VolumeTypePropertyType value) {
        return new JAXBElement<VolumeTypePropertyType>(_Volume_QNAME, VolumeTypePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "referencePoint", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<PointPropertyType> createReferencePoint(PointPropertyType value) {
        return new JAXBElement<PointPropertyType>(_ReferencePoint_QNAME, PointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractThermalZonePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractThermalZonePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "thermalZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<AbstractThermalZonePropertyType> createThermalZoneProperty(AbstractThermalZonePropertyType value) {
        return new JAXBElement<AbstractThermalZonePropertyType>(_ThermalZoneProperty_QNAME, AbstractThermalZonePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractUsageZonePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractUsageZonePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "usageZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<AbstractUsageZonePropertyType> createUsageZoneProperty(AbstractUsageZonePropertyType value) {
        return new JAXBElement<AbstractUsageZonePropertyType>(_UsageZoneProperty_QNAME, AbstractUsageZonePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloorAreaPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FloorAreaPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "floorArea", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<FloorAreaPropertyType> createFloorAreaProperty(FloorAreaPropertyType value) {
        return new JAXBElement<FloorAreaPropertyType>(_FloorAreaProperty_QNAME, FloorAreaPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeightAboveGroundPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeightAboveGroundPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "heightAboveGround", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<HeightAboveGroundPropertyType> createHeightAboveGroundProperty(HeightAboveGroundPropertyType value) {
        return new JAXBElement<HeightAboveGroundPropertyType>(_HeightAboveGroundProperty_QNAME, HeightAboveGroundPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherDataPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeatherDataPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "weatherData", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<WeatherDataPropertyType> createWeatherDataProperty(WeatherDataPropertyType value) {
        return new JAXBElement<WeatherDataPropertyType>(_WeatherDataProperty_QNAME, WeatherDataPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyDemandPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergyDemandPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "demands", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<EnergyDemandPropertyType> createDemands(EnergyDemandPropertyType value) {
        return new JAXBElement<EnergyDemandPropertyType>(_Demands_QNAME, EnergyDemandPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractConstructionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractConstructionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "AbstractConstruction", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<AbstractConstructionType> createAbstractConstruction(AbstractConstructionType value) {
        return new JAXBElement<AbstractConstructionType>(_AbstractConstruction_QNAME, AbstractConstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractThermalZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractThermalZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "AbstractThermalZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<AbstractThermalZoneType> createAbstractThermalZone(AbstractThermalZoneType value) {
        return new JAXBElement<AbstractThermalZoneType>(_AbstractThermalZone_QNAME, AbstractThermalZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractUsageZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractUsageZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "AbstractUsageZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<AbstractUsageZoneType> createAbstractUsageZone(AbstractUsageZoneType value) {
        return new JAXBElement<AbstractUsageZoneType>(_AbstractUsageZone_QNAME, AbstractUsageZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyDemandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergyDemandType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "EnergyDemand", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<EnergyDemandType> createEnergyDemand(EnergyDemandType value) {
        return new JAXBElement<EnergyDemandType>(_EnergyDemand_QNAME, EnergyDemandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloorAreaType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FloorAreaType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "FloorArea")
    public JAXBElement<FloorAreaType> createFloorArea(FloorAreaType value) {
        return new JAXBElement<FloorAreaType>(_FloorArea_QNAME, FloorAreaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeatExchangeTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeatExchangeTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "HeatExchangeType")
    public JAXBElement<HeatExchangeTypeType> createHeatExchangeType(HeatExchangeTypeType value) {
        return new JAXBElement<HeatExchangeTypeType>(_HeatExchangeType_QNAME, HeatExchangeTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeightAboveGroundType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeightAboveGroundType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "HeightAboveGround")
    public JAXBElement<HeightAboveGroundType> createHeightAboveGround(HeightAboveGroundType value) {
        return new JAXBElement<HeightAboveGroundType>(_HeightAboveGround_QNAME, HeightAboveGroundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmittanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransmittanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "Transmittance")
    public JAXBElement<TransmittanceType> createTransmittance(TransmittanceType value) {
        return new JAXBElement<TransmittanceType>(_Transmittance_QNAME, TransmittanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumeTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolumeTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "VolumeType")
    public JAXBElement<VolumeTypeType> createVolumeType(VolumeTypeType value) {
        return new JAXBElement<VolumeTypeType>(_VolumeType_QNAME, VolumeTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeatherDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "WeatherData", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML")
    public JAXBElement<WeatherDataType> createWeatherData(WeatherDataType value) {
        return new JAXBElement<WeatherDataType>(_WeatherData_QNAME, WeatherDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalBoundaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalBoundaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "ThermalBoundary", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<ThermalBoundaryType> createThermalBoundary(ThermalBoundaryType value) {
        return new JAXBElement<ThermalBoundaryType>(_ThermalBoundary_QNAME, ThermalBoundaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalOpeningType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalOpeningType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "ThermalOpening", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<ThermalOpeningType> createThermalOpening(ThermalOpeningType value) {
        return new JAXBElement<ThermalOpeningType>(_ThermalOpening_QNAME, ThermalOpeningType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "ThermalZone", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "AbstractThermalZone")
    public JAXBElement<ThermalZoneType> createThermalZone(ThermalZoneType value) {
        return new JAXBElement<ThermalZoneType>(_ThermalZone_QNAME, ThermalZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractMaterialType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractMaterialType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "AbstractMaterial", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<AbstractMaterialType> createAbstractMaterial(AbstractMaterialType value) {
        return new JAXBElement<AbstractMaterialType>(_AbstractMaterial_QNAME, AbstractMaterialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "Construction", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "AbstractConstruction")
    public JAXBElement<ConstructionType> createConstruction(ConstructionType value) {
        return new JAXBElement<ConstructionType>(_Construction_QNAME, ConstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GasType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GasType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "Gas", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "AbstractMaterial")
    public JAXBElement<GasType> createGas(GasType value) {
        return new JAXBElement<GasType>(_Gas_QNAME, GasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LayerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "Layer", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<LayerType> createLayer(LayerType value) {
        return new JAXBElement<LayerType>(_Layer_QNAME, LayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayerComponentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LayerComponentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "LayerComponent", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<LayerComponentType> createLayerComponent(LayerComponentType value) {
        return new JAXBElement<LayerComponentType>(_LayerComponent_QNAME, LayerComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpticalPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpticalPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "OpticalProperties")
    public JAXBElement<OpticalPropertiesType> createOpticalProperties(OpticalPropertiesType value) {
        return new JAXBElement<OpticalPropertiesType>(_OpticalProperties_QNAME, OpticalPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReflectanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReflectanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "Reflectance")
    public JAXBElement<ReflectanceType> createReflectance(ReflectanceType value) {
        return new JAXBElement<ReflectanceType>(_Reflectance_QNAME, ReflectanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidMaterialType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidMaterialType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "SolidMaterial", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "AbstractMaterial")
    public JAXBElement<SolidMaterialType> createSolidMaterial(SolidMaterialType value) {
        return new JAXBElement<SolidMaterialType>(_SolidMaterial_QNAME, SolidMaterialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DHWFacilitiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DHWFacilitiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "DHWFacilities", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "Facilities")
    public JAXBElement<DHWFacilitiesType> createDHWFacilities(DHWFacilitiesType value) {
        return new JAXBElement<DHWFacilitiesType>(_DHWFacilities_QNAME, DHWFacilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilitiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilitiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "Facilities", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<FacilitiesType> createFacilities(FacilitiesType value) {
        return new JAXBElement<FacilitiesType>(_Facilities_QNAME, FacilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalAppliancesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalAppliancesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "ElectricalAppliances", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "Facilities")
    public JAXBElement<ElectricalAppliancesType> createElectricalAppliances(ElectricalAppliancesType value) {
        return new JAXBElement<ElectricalAppliancesType>(_ElectricalAppliances_QNAME, ElectricalAppliancesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LightingFacilitiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LightingFacilitiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "LightingFacilities", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "Facilities")
    public JAXBElement<LightingFacilitiesType> createLightingFacilities(LightingFacilitiesType value) {
        return new JAXBElement<LightingFacilitiesType>(_LightingFacilities_QNAME, LightingFacilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccupantsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OccupantsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "Occupants", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<OccupantsType> createOccupants(OccupantsType value) {
        return new JAXBElement<OccupantsType>(_Occupants_QNAME, OccupantsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsageZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "UsageZone", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "AbstractUsageZone")
    public JAXBElement<UsageZoneType> createUsageZone(UsageZoneType value) {
        return new JAXBElement<UsageZoneType>(_UsageZone_QNAME, UsageZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "AbstractSchedule", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML")
    public JAXBElement<AbstractScheduleType> createAbstractSchedule(AbstractScheduleType value) {
        return new JAXBElement<AbstractScheduleType>(_AbstractSchedule_QNAME, AbstractScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeSeriesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractTimeSeriesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "AbstractTimeSeries", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML")
    public JAXBElement<AbstractTimeSeriesType> createAbstractTimeSeries(AbstractTimeSeriesType value) {
        return new JAXBElement<AbstractTimeSeriesType>(_AbstractTimeSeries_QNAME, AbstractTimeSeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyPatternScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DailyPatternScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "DailyPatternSchedule", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "AbstractSchedule")
    public JAXBElement<DailyPatternScheduleType> createDailyPatternSchedule(DailyPatternScheduleType value) {
        return new JAXBElement<DailyPatternScheduleType>(_DailyPatternSchedule_QNAME, DailyPatternScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DailyScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "DailySchedule")
    public JAXBElement<DailyScheduleType> createDailySchedule(DailyScheduleType value) {
        return new JAXBElement<DailyScheduleType>(_DailySchedule_QNAME, DailyScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodOfYearType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PeriodOfYearType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "PeriodOfYear")
    public JAXBElement<PeriodOfYearType> createPeriodOfYear(PeriodOfYearType value) {
        return new JAXBElement<PeriodOfYearType>(_PeriodOfYear_QNAME, PeriodOfYearType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "RegularTimeSeries", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "AbstractTimeSeries")
    public JAXBElement<RegularTimeSeriesType> createRegularTimeSeries(RegularTimeSeriesType value) {
        return new JAXBElement<RegularTimeSeriesType>(_RegularTimeSeries_QNAME, RegularTimeSeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesFileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesFileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "RegularTimeSeriesFile", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", substitutionHeadName = "AbstractTimeSeries")
    public JAXBElement<RegularTimeSeriesFileType> createRegularTimeSeriesFile(RegularTimeSeriesFileType value) {
        return new JAXBElement<RegularTimeSeriesFileType>(_RegularTimeSeriesFile_QNAME, RegularTimeSeriesFileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeValuesPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeValuesPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "TimeValuesProperties")
    public JAXBElement<TimeValuesPropertiesType> createTimeValuesProperties(TimeValuesPropertiesType value) {
        return new JAXBElement<TimeValuesPropertiesType>(_TimeValuesProperties_QNAME, TimeValuesPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherStationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeatherStationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "WeatherStation", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<WeatherStationType> createWeatherStation(WeatherStationType value) {
        return new JAXBElement<WeatherStationType>(_WeatherStation_QNAME, WeatherStationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/1.0", name = "_GenericApplicationPropertyOfWeatherStation")
    public JAXBElement<Object> create_GenericApplicationPropertyOfWeatherStation(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfWeatherStation_QNAME, Object.class, null, value);
    }

}
