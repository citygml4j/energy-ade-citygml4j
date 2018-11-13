package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class ThermalZonePropertyElement extends ADEGenericApplicationProperty<AbstractThermalZoneProperty> {

    public ThermalZonePropertyElement() {
    }

    public ThermalZonePropertyElement(AbstractThermalZoneProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ThermalZonePropertyElement(), copyBuilder);
    }
}
