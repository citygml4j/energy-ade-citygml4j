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
