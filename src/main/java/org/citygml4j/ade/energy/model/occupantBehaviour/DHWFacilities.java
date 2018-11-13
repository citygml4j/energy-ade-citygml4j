package org.citygml4j.ade.energy.model.occupantBehaviour;

import org.citygml4j.builder.copy.CopyBuilder;

public class DHWFacilities extends Facilities {

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DHWFacilities(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DHWFacilities copy = (target == null) ? new DHWFacilities() : (DHWFacilities)target;
        return super.copyTo(copy, copyBuilder);
    }
}
