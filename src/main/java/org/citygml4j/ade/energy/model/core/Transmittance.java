package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.measures.Scale;

public class Transmittance implements Associable, ADEModelObject {
    private Scale fraction;
    private WavelengthRangeType wavelengthRangeType;
    private ModelObject parent;

    public Scale getFraction() {
        return fraction;
    }

    public boolean isSetFraction() {
        return fraction != null;
    }

    public void setFraction(Scale fraction) {
        if (fraction != null)
            fraction.setParent(this);

        this.fraction = fraction;
    }

    public WavelengthRangeType getWavelengthRangeType() {
        return wavelengthRangeType;
    }

    public boolean isSetWavelengthRangeType() {
        return wavelengthRangeType != null;
    }

    public void setWavelengthRangeType(WavelengthRangeType wavelengthRangeType) {
        this.wavelengthRangeType = wavelengthRangeType;
    }

    @Override
    public ModelObject getParent() {
        return parent;
    }

    @Override
    public boolean isSetParent() {
        return parent != null;
    }

    @Override
    public void setParent(ModelObject parent) {
        this.parent = parent;
    }

    @Override
    public void unsetParent() {
        parent = null;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Transmittance(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Transmittance copy = (target == null) ? new Transmittance() : (Transmittance)target;

        if (isSetFraction())
            copy.setFraction((Scale)copyBuilder.copy(fraction));

        if (isSetWavelengthRangeType())
            copy.setWavelengthRangeType(wavelengthRangeType);

        copy.unsetParent();
        return copy;
    }
}
