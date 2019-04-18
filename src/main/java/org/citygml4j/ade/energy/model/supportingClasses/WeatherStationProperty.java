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

package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class WeatherStationProperty extends FeatureProperty<WeatherStation> implements ADEModelObject {

    public WeatherStationProperty() {
    }

    public WeatherStationProperty(WeatherStation weatherStation) {
        super(weatherStation);
    }

    public WeatherStationProperty(String href) {
        super(href);
    }

    public WeatherStation getWeatherStation() {
        return super.getObject();
    }

    public boolean isSetWeatherStation() {
        return super.isSetObject();
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        super.setObject(weatherStation);
    }

    public void unsetWeatherStation() {
        super.unsetObject();
    }

    @Override
    public Class<WeatherStation> getAssociableClass() {
        return WeatherStation.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WeatherStationProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        WeatherStationProperty copy = (target == null) ? new WeatherStationProperty() : (WeatherStationProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
