package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRepOrRef;

public class WeatherDataProperty extends AssociationByRepOrRef<WeatherData> implements ADEModelObject {

    public WeatherDataProperty() {
    }

    public WeatherDataProperty(WeatherData weatherData) {
        super(weatherData);
    }

    public WeatherDataProperty(String href) {
        super(href);
    }

    public WeatherData getWeatherData() {
        return super.getObject();
    }

    public boolean isSetWeatherData() {
        return super.isSetObject();
    }

    public void setWeatherData(WeatherData weatherData) {
        super.setObject(weatherData);
    }

    public void unsetWeatherData() {
        super.unsetObject();
    }

    @Override
    public Class<WeatherData> getAssociableClass() {
        return WeatherData.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WeatherDataProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        WeatherDataProperty copy = (target == null) ? new WeatherDataProperty() : (WeatherDataProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
