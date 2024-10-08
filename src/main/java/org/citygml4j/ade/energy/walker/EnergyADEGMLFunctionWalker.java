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
import org.citygml4j.ade.energy.model.supportingClasses.*;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.base.AbstractGML;
import org.citygml4j.model.gml.base.AssociationByRepOrRef;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.gml.feature.FeatureProperty;
import org.citygml4j.util.walker.GMLFunctionWalker;

public class EnergyADEGMLFunctionWalker<T> implements ADEWalker<GMLFunctionWalker<T>> {
    private GMLFunctionWalker<T> walker;

    @Override
    public void setParentWalker(GMLFunctionWalker<T> walker) {
        this.walker = walker;
    }

    public T apply(AbstractConstruction abstractConstruction) {
        return walker.apply((AbstractFeature) abstractConstruction);
    }

    public T apply(AbstractMaterial abstractMaterial) {
        return walker.apply((AbstractFeature) abstractMaterial);
    }

    public T apply(AbstractSchedule abstractSchedule) {
        return walker.apply((AbstractGML) abstractSchedule);
    }

    public T apply(AbstractThermalZone abstractThermalZone) {
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

    public T apply(AbstractTimeSeries abstractTimeSeries) {
        return walker.apply((AbstractGML) abstractTimeSeries);
    }

    public T apply(AbstractUsageZone abstractUsageZone) {
        return walker.apply((AbstractCityObject) abstractUsageZone);
    }

    public T apply(Construction construction) {
        T object = apply((AbstractConstruction) construction);
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

    public T apply(DailyPatternSchedule dailyPatternSchedule) {
        T object = apply((AbstractSchedule) dailyPatternSchedule);
        if (object != null)
            return object;

        if (dailyPatternSchedule.isSetPeriodOfYear()) {
            for (PeriodOfYearProperty property : dailyPatternSchedule.getPeriodOfYear()) {
                if (property.isSetPeriodOfYear()) {
                    PeriodOfYear periodOfYear = property.getPeriodOfYear();
                    if (periodOfYear.isSetDailySchedule()) {
                        for (DailyScheduleProperty scheduleProperty : periodOfYear.getDailySchedule()) {
                            if (scheduleProperty.isSetDaySchedule()) {
                                DailySchedule dailySchedule = scheduleProperty.getDaySchedule();
                                if (dailySchedule.isSetSchedule()) {
                                    object = walker.apply((AssociationByRepOrRef<AbstractTimeSeries>) dailySchedule.getSchedule());
                                    if (object != null)
                                        return object;
                                }
                            }
                        }
                    }
                }
            }
        }

        return null;
    }

    public T apply(DemandsProperty demandsProperty) {
        return walker.apply((FeatureProperty<?>) demandsProperty.getValue());
    }

    public T apply(DHWFacilities dhwFacilities) {
        return apply((Facilities) dhwFacilities);
    }

    public T apply(ElectricalAppliances electricalAppliances) {
        return apply((Facilities) electricalAppliances);
    }

    public T apply(EnergyDemand energyDemand) {
        T object = walker.apply((AbstractFeature) energyDemand);
        if (object != null)
            return object;

        if (energyDemand.isSetEnergyAmount()) {
            object = walker.apply((AssociationByRepOrRef<AbstractTimeSeries>) energyDemand.getEnergyAmount());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Facilities facilities) {
        T object = walker.apply((AbstractCityObject) facilities);
        if (object != null)
            return object;

        if (facilities.isSetOperationSchedule()) {
            object = walker.apply((AssociationByRepOrRef<AbstractSchedule>) facilities.getOperationSchedule());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Gas gas) {
        return apply((AbstractMaterial) gas);
    }

    public T apply(Layer layer) {
        T object = walker.apply((AbstractFeature) layer);
        if (object != null)
            return object;

        if (layer.isSetLayerComponent()) {
            for (LayerComponentProperty property : layer.getLayerComponent()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        return null;
    }

    public T apply(LayerComponent layerComponent) {
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

    public T apply(LightingFacilities lightingFacilities) {
        return apply((Facilities) lightingFacilities);
    }

    public T apply(Occupants occupants) {
        T object = walker.apply((AbstractFeature) occupants);
        if (object != null)
            return object;

        if (occupants.isSetOccupancyRate()) {
            object = walker.apply((AssociationByRepOrRef<AbstractSchedule>) occupants.getOccupancyRate());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(RegularTimeSeries regularTimeSeries) {
        return apply((AbstractTimeSeries) regularTimeSeries);
    }

    public T apply(RegularTimeSeriesFile regularTimeSeriesFile) {
        return apply((AbstractTimeSeries) regularTimeSeriesFile);
    }

    public T apply(SolidMaterial solidMaterial) {
        return apply((AbstractMaterial) solidMaterial);
    }

    public T apply(ThermalBoundary thermalBoundary) {
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

        if (thermalBoundary.isSetSurfaceGeometry()) {
            object = walker.apply(thermalBoundary.getSurfaceGeometry());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(ThermalOpening thermalOpening) {
        T object = walker.apply((AbstractCityObject) thermalOpening);
        if (object != null)
            return object;

        if (thermalOpening.isSetConstruction()) {
            object = walker.apply((FeatureProperty<?>) thermalOpening.getConstruction());
            if (object != null)
                return object;
        }

        if (thermalOpening.isSetSurfaceGeometry()) {
            object = walker.apply(thermalOpening.getSurfaceGeometry());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(ThermalZone thermalZone) {
        T object = apply((AbstractThermalZone) thermalZone);
        if (object != null)
            return object;

        if (thermalZone.isSetThermalBoundary()) {
            for (ThermalBoundaryProperty property : thermalZone.getThermalBoundary()) {
                object = walker.apply((FeatureProperty<?>) property);
                if (object != null)
                    return object;
            }
        }

        if (thermalZone.isSetVolumeGeometry()) {
            object = walker.apply(thermalZone.getVolumeGeometry());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(ThermalZonePropertyElement thermalZonePropertyElement) {
        return walker.apply((FeatureProperty<?>) thermalZonePropertyElement.getValue());
    }

    public T apply(UsageZone usageZone) {
        T object = apply((AbstractUsageZone) usageZone);
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

        if (usageZone.isSetCoolingSchedule()) {
            object = walker.apply((AssociationByRepOrRef<AbstractSchedule>) usageZone.getCoolingSchedule());
            if (object != null)
                return object;
        }

        if (usageZone.isSetHeatingSchedule()) {
            object = walker.apply((AssociationByRepOrRef<AbstractSchedule>) usageZone.getHeatingSchedule());
            if (object != null)
                return object;
        }

        if (usageZone.isSetVentilationSchedule()) {
            object = walker.apply((AssociationByRepOrRef<AbstractSchedule>) usageZone.getVentilationSchedule());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(UsageZoneProperty usageZoneProperty) {
        return walker.apply((FeatureProperty<?>) usageZoneProperty.getValue());
    }

    public T apply(WeatherData weatherData) {
        T object = walker.apply((AbstractGML) weatherData);
        if (object != null)
            return object;

        if (weatherData.isSetValues()) {
            object = walker.apply((AssociationByRepOrRef<AbstractTimeSeries>) weatherData.getValues());
            if (object != null)
                return object;
        }

        if (weatherData.isSetPosition()) {
            object = walker.apply(weatherData.getPosition());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(WeatherDataPropertyElement weatherDataPropertyElement) {
        return walker.apply((AssociationByRepOrRef<WeatherData>) weatherDataPropertyElement.getValue());
    }

    public T apply(WeatherStation weatherStation) {
        T object = walker.apply((AbstractCityObject) weatherStation);
        if (object != null)
            return object;

        if (weatherStation.isSetPosition()) {
            object = walker.apply(weatherStation.getPosition());
            if (object != null)
                return object;
        }

        if (weatherStation.isSetParameter()) {
            for (WeatherDataProperty property : weatherStation.getParameter()) {
                object = walker.apply((AssociationByRepOrRef<WeatherData>) property);
                if (object != null)
                    return object;
            }
        }

        return null;
    }
}
