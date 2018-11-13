package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.base.ModelObject;

public class TimeIntervalLength implements ADEModelObject {
    private Double value;
    private String unit;
    private Integer radix;
    private Integer factor;
    private ModelObject parent;

    public Double getValue() {
        return value;
    }

    public boolean isSetValue() {
        return value != null;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public boolean isSetUnit() {
        return unit != null;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getRadix() {
        return radix;
    }

    public boolean isSetRadix() {
        return radix != null;
    }

    public void setRadix(Integer radix) {
        this.radix = radix;
    }

    public Integer getFactor() {
        return factor;
    }

    public boolean isSetFactor() {
        return factor != null;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
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
        return copyTo(new TimeIntervalLength(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TimeIntervalLength copy = (target == null) ? new TimeIntervalLength() : (TimeIntervalLength)target;

        if (isSetValue())
            copy.setValue(value);

        if (isSetUnit())
            copy.setUnit(copyBuilder.copy(unit));

        if (isSetRadix())
            copy.setRadix(radix);

        if (isSetFactor())
            copy.setFactor(factor);

        copy.unsetParent();
        return copy;
    }
}
