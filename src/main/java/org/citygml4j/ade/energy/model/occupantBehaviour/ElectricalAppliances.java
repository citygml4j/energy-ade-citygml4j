package org.citygml4j.ade.energy.model.occupantBehaviour;

import org.citygml4j.builder.copy.CopyBuilder;

public class ElectricalAppliances extends Facilities {

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ElectricalAppliances(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ElectricalAppliances copy = (target == null) ? new ElectricalAppliances() : (ElectricalAppliances)target;
        return super.copyTo(copy, copyBuilder);
    }
}
