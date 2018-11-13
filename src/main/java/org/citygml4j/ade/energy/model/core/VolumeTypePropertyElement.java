package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class VolumeTypePropertyElement extends ADEGenericApplicationProperty<VolumeTypeProperty> {

    public VolumeTypePropertyElement() {
    }

    public VolumeTypePropertyElement(VolumeTypeProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new VolumeTypePropertyElement(), copyBuilder);
    }
}
