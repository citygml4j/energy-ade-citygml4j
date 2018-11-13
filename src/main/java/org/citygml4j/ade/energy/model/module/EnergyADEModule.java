package org.citygml4j.ade.energy.model.module;

import org.citygml4j.ade.energy.model.core.AbstractConstruction;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;
import org.citygml4j.ade.energy.EnergyADEContext;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalBoundary;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalOpening;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalZone;
import org.citygml4j.ade.energy.model.core.AbstractThermalZone;
import org.citygml4j.ade.energy.model.core.AbstractUsageZone;
import org.citygml4j.ade.energy.model.core.EnergyDemand;
import org.citygml4j.ade.energy.model.materialAndConstruction.AbstractMaterial;
import org.citygml4j.ade.energy.model.materialAndConstruction.Construction;
import org.citygml4j.ade.energy.model.materialAndConstruction.Gas;
import org.citygml4j.ade.energy.model.materialAndConstruction.Layer;
import org.citygml4j.ade.energy.model.materialAndConstruction.LayerComponent;
import org.citygml4j.ade.energy.model.materialAndConstruction.SolidMaterial;
import org.citygml4j.ade.energy.model.occupantBehaviour.DHWFacilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.ElectricalAppliances;
import org.citygml4j.ade.energy.model.occupantBehaviour.Facilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.LightingFacilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.Occupants;
import org.citygml4j.ade.energy.model.occupantBehaviour.UsageZone;
import org.citygml4j.ade.energy.model.supportingClasses.WeatherStation;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EnergyADEModule extends ADEModule {
    public static final EnergyADEModule v1_0 = new EnergyADEModule();

    private HashMap<String, Class<? extends AbstractFeature>> features;
    private HashSet<String> featureProperties;

    public EnergyADEModule() {
        super("http://www.sig3d.org/citygml/2.0/energy/1.0",
                "energy",
                CityGMLVersion.v2_0_0);

        features = new HashMap<>();
        features.put("AbstractConstruction", AbstractConstruction.class);
        features.put("AbstractThermalZone", AbstractThermalZone.class);
        features.put("AbstractUsageZone", AbstractUsageZone.class);
        features.put("EnergyDemand", EnergyDemand.class);
        features.put("ThermalBoundary", ThermalBoundary.class);
        features.put("ThermalOpening", ThermalOpening.class);
        features.put("ThermalZone", ThermalZone.class);
        features.put("AbstractMaterial", AbstractMaterial.class);
        features.put("Construction", Construction.class);
        features.put("Gas", Gas.class);
        features.put("Layer", Layer.class);
        features.put("LayerComponent", LayerComponent.class);
        features.put("SolidMaterial", SolidMaterial.class);
        features.put("DHWFacilities", DHWFacilities.class);
        features.put("ElectricalAppliances", ElectricalAppliances.class);
        features.put("Facilities", Facilities.class);
        features.put("LightingFacilities", LightingFacilities.class);
        features.put("Occupants", Occupants.class);
        features.put("UsageZone", UsageZone.class);
        features.put("WeatherStation", WeatherStation.class);

        featureProperties = new HashSet<>();
        featureProperties.add("construction");
        featureProperties.add("thermalZone");
        featureProperties.add("usageZone");
        featureProperties.add("contains");
        featureProperties.add("demands");
        featureProperties.add("boundedBy");
        featureProperties.add("delimits");
        featureProperties.add("material");
        featureProperties.add("layer");
        featureProperties.add("layerComponent");
        featureProperties.add("equippedWith");
        featureProperties.add("occupiedBy");
    }

    @Override
    public URL getSchemaResource() {
        return EnergyADEContext.class.getResource("/org/citygml4j/ade/energy/schema/EnergyADE.xsd");
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return featureProperties.contains(name);
    }

    @Override
    public boolean hasFeature(String name) {
        return features.containsKey(name);
    }

    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return features.get(name);
    }

    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        for (Map.Entry<String, Class<? extends AbstractFeature>> entry : features.entrySet()) {
            if (entry.getValue() == featureClass)
                return new QName(getNamespaceURI(), entry.getKey());
        }

        return null;
    }

    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return new HashMap<>(features);
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return "WeatherStation".equals(name);
    }
}
