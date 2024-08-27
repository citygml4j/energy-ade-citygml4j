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

package org.citygml4j.ade.energy.model.core;

import org.citygml4j.ade.energy.model.supportingClasses.AbstractTimeSeriesProperty;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.base.AbstractGML;
import org.citygml4j.model.gml.geometry.primitives.PointProperty;

public class WeatherData extends AbstractGML implements ADEModelObject {
    private PointProperty position;
    private AbstractTimeSeriesProperty values;
    private WeatherDataTypeValue weatherDataType;

    public PointProperty getPosition() {
        return position;
    }

    public boolean isSetPosition() {
        return position != null;
    }

    public void setPosition(PointProperty position) {
        if (position != null)
            position.setParent(this);

        this.position = position;
    }

    public AbstractTimeSeriesProperty getValues() {
        return values;
    }

    public boolean isSetValues() {
        return values != null;
    }

    public void setValues(AbstractTimeSeriesProperty values) {
        if (values != null)
            values.setParent(this);

        this.values = values;
    }

    public WeatherDataTypeValue getWeatherDataType() {
        return weatherDataType;
    }

    public boolean isSetWeatherDataType() {
        return weatherDataType != null;
    }

    public void setWeatherDataType(WeatherDataTypeValue weatherDataType) {
        this.weatherDataType = weatherDataType;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WeatherData(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        WeatherData copy = (target == null) ? new WeatherData() : (WeatherData) target;
        super.copyTo(copy, copyBuilder);

        if (isSetPosition())
            copy.setPosition((PointProperty) copyBuilder.copy(position));

        if (isSetValues())
            copy.setValues((AbstractTimeSeriesProperty) copyBuilder.copy(values));

        if (isSetWeatherDataType())
            copy.setWeatherDataType(weatherDataType);

        return copy;
    }

    @Override
    public void accept(GMLVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(GMLFunctor<T> visitor) {
        return visitor.apply(this);
    }
}
