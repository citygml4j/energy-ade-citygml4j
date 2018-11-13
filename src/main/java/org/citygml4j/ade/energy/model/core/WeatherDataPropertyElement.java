package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class WeatherDataPropertyElement extends ADEGenericApplicationProperty<WeatherDataProperty> {

    public WeatherDataPropertyElement() {
    }

    public WeatherDataPropertyElement(WeatherDataProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WeatherDataPropertyElement(), copyBuilder);
    }
}
