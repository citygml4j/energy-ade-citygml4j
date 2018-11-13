package org.citygml4j.ade.energy.model.occupantBehaviour;

import org.citygml4j.builder.copy.CopyBuilder;

public class LightingFacilities extends Facilities {

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LightingFacilities(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LightingFacilities copy = (target == null) ? new LightingFacilities() : (LightingFacilities)target;
        return super.copyTo(copy, copyBuilder);
    }
}
