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
        WeatherData copy = (target == null) ? new WeatherData() : (WeatherData)target;
        super.copyTo(target, copyBuilder);

        if (isSetPosition())
            copy.setPosition((PointProperty)copyBuilder.copy(position));

        if (isSetValues())
            copy.setValues((AbstractTimeSeriesProperty)copyBuilder.copy(values));

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
