package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class UsageZoneProperty extends ADEGenericApplicationProperty<AbstractUsageZoneProperty> {

    public UsageZoneProperty() {
    }

    public UsageZoneProperty(AbstractUsageZoneProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UsageZoneProperty(), copyBuilder);
    }
}
