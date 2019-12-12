/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2013-2019 Claus Nagel <claus.nagel@gmail.com>
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

package org.citygml4j.ade.energy.walker;

import org.citygml4j.ade.energy.model.buildingPhysics.ThermalBoundary;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalBoundaryProperty;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalOpening;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalOpeningProperty;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalZone;
import org.citygml4j.ade.energy.model.buildingPhysics.ThermalZoneProperty;
import org.citygml4j.ade.energy.model.core.AbstractConstruction;
import org.citygml4j.ade.energy.model.core.AbstractThermalZone;
import org.citygml4j.ade.energy.model.core.AbstractUsageZone;
import org.citygml4j.ade.energy.model.core.AbstractUsageZoneProperty;
import org.citygml4j.ade.energy.model.core.DemandsProperty;
import org.citygml4j.ade.energy.model.core.EnergyDemand;
import org.citygml4j.ade.energy.model.core.ThermalZonePropertyElement;
import org.citygml4j.ade.energy.model.core.UsageZoneProperty;
import org.citygml4j.ade.energy.model.materialAndConstruction.AbstractMaterial;
import org.citygml4j.ade.energy.model.materialAndConstruction.Construction;
import org.citygml4j.ade.energy.model.materialAndConstruction.Gas;
import org.citygml4j.ade.energy.model.materialAndConstruction.Layer;
import org.citygml4j.ade.energy.model.materialAndConstruction.LayerComponent;
import org.citygml4j.ade.energy.model.materialAndConstruction.LayerComponentProperty;
import org.citygml4j.ade.energy.model.materialAndConstruction.LayerProperty;
import org.citygml4j.ade.energy.model.materialAndConstruction.SolidMaterial;
import org.citygml4j.ade.energy.model.occupantBehaviour.DHWFacilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.ElectricalAppliances;
import org.citygml4j.ade.energy.model.occupantBehaviour.Facilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.FacilitiesProperty;
import org.citygml4j.ade.energy.model.occupantBehaviour.LightingFacilities;
import org.citygml4j.ade.energy.model.occupantBehaviour.Occupants;
import org.citygml4j.ade.energy.model.occupantBehaviour.OccupantsProperty;
import org.citygml4j.ade.energy.model.occupantBehaviour.UsageZone;
import org.citygml4j.ade.energy.model.supportingClasses.WeatherStation;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.gml.feature.FeatureProperty;
import org.citygml4j.util.walker.FeatureWalker;

public class EnergyADEFeatureWalker implements ADEWalker<FeatureWalker> {
    private FeatureWalker walker;

    @Override
    public void setParentWalker(FeatureWalker walker) {
        this.walker = walker;
    }

    public void visit(AbstractConstruction abstractConstruction) {
        walker.visit((AbstractFeature)abstractConstruction);
    }

    public void visit(AbstractMaterial abstractMaterial) {
        walker.visit((AbstractFeature)abstractMaterial);
    }

    public void visit(AbstractThermalZone abstractThermalZone) {
        walker.visit((AbstractCityObject)abstractThermalZone);

        if (abstractThermalZone.isSetContains()) {
            for (AbstractUsageZoneProperty property : abstractThermalZone.getContains())
                walker.visit((FeatureProperty<?>)property);
        }
    }

    public void visit(AbstractUsageZone abstractUsageZone) {
        walker.visit((AbstractCityObject)abstractUsageZone);
    }

    public void visit(Construction construction) {
        visit((AbstractConstruction)construction);

        if (construction.isSetLayer()) {
            for (LayerProperty property : construction.getLayer())
                walker.visit((FeatureProperty<?>)property);
        }
    }

    public void visit(DemandsProperty demandsProperty) {
        walker.visit((FeatureProperty<?>)demandsProperty.getValue());
    }

    public void visit(DHWFacilities dhwFacilities) {
        visit((Facilities)dhwFacilities);
    }

    public void visit(ElectricalAppliances electricalAppliances) {
        visit((Facilities)electricalAppliances);
    }

    public void visit(EnergyDemand energyDemand) {
        walker.visit((AbstractFeature)energyDemand);
    }

    public void visit(Facilities facilities) {
        walker.visit((AbstractCityObject)facilities);
    }

    public void visit(Gas gas) {
        visit((AbstractMaterial)gas);
    }

    public void visit(Layer layer) {
        walker.visit((AbstractFeature)layer);

        if (layer.isSetLayerComponent()) {
            for (LayerComponentProperty property : layer.getLayerComponent())
                walker.visit((FeatureProperty<?>)property);
        }
    }

    public void visit(LayerComponent layerComponent) {
        walker.visit((AbstractFeature)layerComponent);

        if (layerComponent.isSetMaterial())
            walker.visit((FeatureProperty<?>)layerComponent.getMaterial());
    }

    public void visit(LightingFacilities lightingFacilities) {
        visit((Facilities)lightingFacilities);
    }

    public void visit(Occupants occupants) {
        walker.visit((AbstractFeature)occupants);
    }

    public void visit(SolidMaterial solidMaterial) {
        visit((AbstractMaterial)solidMaterial);
    }

    public void visit(ThermalBoundary thermalBoundary) {
        walker.visit((AbstractCityObject)thermalBoundary);

        if (thermalBoundary.isSetConstruction())
            walker.visit((FeatureProperty<?>)thermalBoundary.getConstruction());

        if (thermalBoundary.isSetContains()) {
            for (ThermalOpeningProperty property : thermalBoundary.getContains())
                walker.visit((FeatureProperty<?>)property);
        }

        if (thermalBoundary.isSetDelimits()) {
            for (ThermalZoneProperty property : thermalBoundary.getDelimits())
                walker.visit((FeatureProperty<?>)property);
        }
    }

    public void visit(ThermalOpening thermalOpening) {
        walker.visit((AbstractCityObject)thermalOpening);

        if (thermalOpening.isSetConstruction())
            walker.visit((FeatureProperty<?>)thermalOpening.getConstruction());
    }

    public void visit(ThermalZone thermalZone) {
        visit((AbstractThermalZone)thermalZone);

        if (thermalZone.isSetThermalBoundary()) {
            for (ThermalBoundaryProperty property : thermalZone.getThermalBoundary())
                walker.visit((FeatureProperty<?>)property);
        }
    }

    public void visit(ThermalZonePropertyElement thermalZonePropertyElement) {
        walker.visit((FeatureProperty<?>)thermalZonePropertyElement.getValue());
    }

    public void visit(UsageZone usageZone) {
        visit((AbstractUsageZone)usageZone);

        if (usageZone.isSetOccupiedBy()) {
            for (OccupantsProperty property : usageZone.getOccupiedBy())
                walker.visit((FeatureProperty<?>)property);
        }

        if (usageZone.isSetEquippedWith()) {
            for (FacilitiesProperty property : usageZone.getEquippedWith())
                walker.visit((FeatureProperty<?>)property);
        }
    }

    public void visit(UsageZoneProperty usageZoneProperty) {
        walker.visit((FeatureProperty<?>)usageZoneProperty.getValue());
    }

    public void visit(WeatherStation weatherStation) {
        walker.visit((AbstractCityObject)weatherStation);
    }
}
