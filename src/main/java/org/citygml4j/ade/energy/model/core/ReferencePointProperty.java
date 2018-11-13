package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;
import org.citygml4j.model.gml.geometry.primitives.PointProperty;

public class ReferencePointProperty extends ADEGenericApplicationProperty<PointProperty> {

    public ReferencePointProperty() {
    }

    public ReferencePointProperty(PointProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ReferencePointProperty(), copyBuilder);
    }
}
