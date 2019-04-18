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
import org.citygml4j.ade.energy.model.core.WeatherData;
import org.citygml4j.ade.energy.model.core.WeatherDataPropertyElement;
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
import org.citygml4j.ade.energy.model.supportingClasses.AbstractSchedule;
import org.citygml4j.ade.energy.model.supportingClasses.AbstractTimeSeries;
import org.citygml4j.ade.energy.model.supportingClasses.DailyPatternSchedule;
import org.citygml4j.ade.energy.model.supportingClasses.RegularTimeSeries;
import org.citygml4j.ade.energy.model.supportingClasses.RegularTimeSeriesFile;
import org.citygml4j.ade.energy.model.supportingClasses.WeatherStation;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.base.AbstractGML;
import org.citygml4j.model.gml.base.AssociationByRepOrRef;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.gml.feature.FeatureProperty;
import org.citygml4j.util.walker.GMLWalker;

public class EnergyADEGMLWalker implements ADEWalker<GMLWalker> {
    private GMLWalker walker;

    @Override
    public void setParentWalker(GMLWalker walker) {
        this.walker = walker;
    }

    public void visit(AbstractConstruction abstractConstruction) {
        walker.visit((AbstractFeature)abstractConstruction);
    }

    public void visit(AbstractMaterial abstractMaterial) {
        walker.visit((AbstractFeature)abstractMaterial);
    }

    public void visit(AbstractSchedule abstractSchedule) {
        walker.visit((AbstractGML)abstractSchedule);
    }

    public void visit(AbstractThermalZone abstractThermalZone) {
        walker.visit((AbstractCityObject)abstractThermalZone);

        if (abstractThermalZone.isSetContains()) {
            for (AbstractUsageZoneProperty property : abstractThermalZone.getContains())
                walker.visit((FeatureProperty<?>)property);
        }
    }

    public void visit(AbstractTimeSeries abstractTimeSeries) {
        walker.visit((AbstractGML)abstractTimeSeries);
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

    public void visit(DailyPatternSchedule dailyPatternSchedule) {
        visit((AbstractSchedule)dailyPatternSchedule);
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

        if (energyDemand.isSetEnergyAmount())
            walker.visit((AssociationByRepOrRef<AbstractTimeSeries>)energyDemand.getEnergyAmount());
    }

    public void visit(Facilities facilities) {
        walker.visit((AbstractCityObject)facilities);

        if (facilities.isSetOperationSchedule())
            walker.visit((AssociationByRepOrRef<AbstractSchedule>)facilities.getOperationSchedule());
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

        if (occupants.isSetOccupancyRate())
            walker.visit((AssociationByRepOrRef<AbstractSchedule>)occupants.getOccupancyRate());
    }

    public void visit(RegularTimeSeries regularTimeSeries) {
        visit((AbstractTimeSeries)regularTimeSeries);
    }

    public void visit(RegularTimeSeriesFile regularTimeSeriesFile) {
        visit((AbstractTimeSeries)regularTimeSeriesFile);
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

        if (thermalBoundary.isSetSurfaceGeometry())
            walker.visit(thermalBoundary.getSurfaceGeometry());
    }

    public void visit(ThermalOpening thermalOpening) {
        walker.visit((AbstractCityObject)thermalOpening);

        if (thermalOpening.isSetConstruction())
            walker.visit((FeatureProperty<?>)thermalOpening.getConstruction());

        if (thermalOpening.isSetSurfaceGeometry())
            walker.visit(thermalOpening.getSurfaceGeometry());
    }

    public void visit(ThermalZone thermalZone) {
        visit((AbstractThermalZone)thermalZone);

        if (thermalZone.isSetThermalBoundary()) {
            for (ThermalBoundaryProperty property : thermalZone.getThermalBoundary())
                walker.visit((FeatureProperty<?>)property);
        }

        if (thermalZone.isSetVolumeGeometry())
            walker.visit(thermalZone.getVolumeGeometry());
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

        if (usageZone.isSetCoolingSchedule())
            walker.visit((AssociationByRepOrRef<AbstractSchedule>)usageZone.getCoolingSchedule());

        if (usageZone.isSetHeatingSchedule())
            walker.visit((AssociationByRepOrRef<AbstractSchedule>)usageZone.getHeatingSchedule());

        if (usageZone.isSetVentilationSchedule())
            walker.visit((AssociationByRepOrRef<AbstractSchedule>)usageZone.getVentilationSchedule());
    }

    public void visit(UsageZoneProperty usageZoneProperty) {
        walker.visit((FeatureProperty<?>)usageZoneProperty.getValue());
    }

    public void visit(WeatherData weatherData) {
        walker.visit((AbstractGML)weatherData);

        if (weatherData.isSetValues())
            walker.visit((AssociationByRepOrRef<AbstractTimeSeries>)weatherData.getValues());

        if (weatherData.isSetPosition())
            walker.visit(weatherData.getPosition());
    }

    public void visit(WeatherDataPropertyElement weatherDataPropertyElement) {
        walker.visit((AssociationByRepOrRef<WeatherData>)weatherDataPropertyElement.getValue());
    }

    public void visit(WeatherStation weatherStation) {
        walker.visit((AbstractCityObject)weatherStation);

        if (weatherStation.isSetPosition())
            walker.visit(weatherStation.getPosition());
    }
}
