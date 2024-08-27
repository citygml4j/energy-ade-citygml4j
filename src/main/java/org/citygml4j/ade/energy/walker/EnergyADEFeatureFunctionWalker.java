/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Claus Nagel <claus.nagel@gmail.com>
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

import org.citygml4j.ade.energy.model.buildingPhysics.*;
import org.citygml4j.ade.energy.model.core.*;
import org.citygml4j.ade.energy.model.materialAndConstruction.*;
import org.citygml4j.ade.energy.model.occupantBehaviour.*;
import org.citygml4j.ade.energy.model.supportingClasses.WeatherStation;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.gml.feature.FeatureProperty;
import org.citygml4j.util.walker.FeatureFunctionWalker;

public class EnergyADEFeatureFunctionWalker<T> implements ADEWalker<FeatureFunctionWalker<T>> {
    private FeatureFunctionWalker<T> walker;

    @Override
    public void setParentWalker(FeatureFunctionWalker<T> walker) {
        this.walker = walker;
    }

    public T visit(AbstractConstruction abstractConstruction) {
        return walker.apply((AbstractFeature) abstractConstruction);
    }

    public T visit(AbstractMaterial abstractMaterial) {
        return walker.apply((AbstractFeature) abstractMaterial);
    }

    public T visit(AbstractThermalZone abstractThermalZone) {
        T object = walker.apply((AbstractCityObject) abstractThermalZone);
        if (object != null)
            return object;

        if (abstractThermalZone.isSetContains()) {
            for (AbstractUsageZoneProperty property : abstractThermalZone.getContains()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        return null;
    }

    public T visit(AbstractUsageZone abstractUsageZone) {
        return walker.apply((AbstractCityObject) abstractUsageZone);
    }

    public T visit(Construction construction) {
        T object = visit((AbstractConstruction) construction);
        if (object != null)
            return object;

        if (construction.isSetLayer()) {
            for (LayerProperty property : construction.getLayer()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        return null;
    }

    public T visit(DemandsProperty demandsProperty) {
        return walker.apply((FeatureProperty<?>) demandsProperty.getValue());
    }

    public T visit(DHWFacilities dhwFacilities) {
        return visit((Facilities) dhwFacilities);
    }

    public T visit(ElectricalAppliances electricalAppliances) {
        return visit((Facilities) electricalAppliances);
    }

    public T visit(EnergyDemand energyDemand) {
        return walker.apply((AbstractFeature) energyDemand);
    }

    public T visit(Facilities facilities) {
        return walker.apply((AbstractCityObject) facilities);
    }

    public T visit(Gas gas) {
        return visit((AbstractMaterial) gas);
    }

    public T visit(Layer layer) {
        T object = walker.apply((AbstractFeature) layer);

        if (layer.isSetLayerComponent()) {
            for (LayerComponentProperty property : layer.getLayerComponent()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        return null;
    }

    public T visit(LayerComponent layerComponent) {
        T object = walker.apply((AbstractFeature) layerComponent);
        if (object != null)
            return object;

        if (layerComponent.isSetMaterial()) {
            object = walker.apply((FeatureProperty<?>) layerComponent.getMaterial());
            if (object != null)
                return object;
        }

        return null;
    }

    public T visit(LightingFacilities lightingFacilities) {
        return visit((Facilities) lightingFacilities);
    }

    public T visit(Occupants occupants) {
        return walker.apply((AbstractFeature) occupants);
    }

    public T visit(SolidMaterial solidMaterial) {
        return visit((AbstractMaterial) solidMaterial);
    }

    public T visit(ThermalBoundary thermalBoundary) {
        T object = walker.apply((AbstractCityObject) thermalBoundary);
        if (object != null)
            return object;

        if (thermalBoundary.isSetConstruction()) {
            object = walker.apply((FeatureProperty<?>) thermalBoundary.getConstruction());
            if (object != null)
                return object;
        }

        if (thermalBoundary.isSetContains()) {
            for (ThermalOpeningProperty property : thermalBoundary.getContains()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        if (thermalBoundary.isSetDelimits()) {
            for (ThermalZoneProperty property : thermalBoundary.getDelimits()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        return null;
    }

    public T visit(ThermalOpening thermalOpening) {
        T object = walker.apply((AbstractCityObject) thermalOpening);
        if (object != null)
            return object;

        if (thermalOpening.isSetConstruction()) {
            object = walker.apply((FeatureProperty<?>) thermalOpening.getConstruction());
            if (object != null)
                return object;
        }

        return null;
    }

    public T visit(ThermalZone thermalZone) {
        T object = visit((AbstractThermalZone) thermalZone);
        if (object != null)
            return object;

        if (thermalZone.isSetThermalBoundary()) {
            for (ThermalBoundaryProperty property : thermalZone.getThermalBoundary()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        return null;
    }

    public T visit(ThermalZonePropertyElement thermalZonePropertyElement) {
        return walker.apply((FeatureProperty<?>) thermalZonePropertyElement.getValue());
    }

    public T visit(UsageZone usageZone) {
        T object = visit((AbstractUsageZone) usageZone);
        if (object != null)
            return object;

        if (usageZone.isSetOccupiedBy()) {
            for (OccupantsProperty property : usageZone.getOccupiedBy()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        if (usageZone.isSetEquippedWith()) {
            for (FacilitiesProperty property : usageZone.getEquippedWith()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        return null;
    }

    public T visit(UsageZoneProperty usageZoneProperty) {
        return walker.apply((FeatureProperty<?>) usageZoneProperty.getValue());
    }

    public T visit(WeatherStation weatherStation) {
        return walker.apply((AbstractCityObject) weatherStation);
    }
}
