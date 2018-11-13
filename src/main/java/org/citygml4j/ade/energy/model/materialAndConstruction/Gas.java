package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.gml.basicTypes.Measure;

public class Gas extends AbstractMaterial {
    private Boolean isVentilated;
    private Measure rValue;

    public Boolean isVentilated() {
        return isVentilated != null ? isVentilated : false;
    }

    public boolean isSetIsVentilated() {
        return isVentilated != null;
    }

    public void setIsVentilated(Boolean ventilated) {
        isVentilated = ventilated;
    }

    public Measure getRValue() {
        return rValue;
    }

    public boolean isSetRValue() {
        return rValue != null;
    }

    public void setRValue(Measure rValue) {
        if (rValue != null)
            rValue.setParent(this);

        this.rValue = rValue;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Gas(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Gas copy = (target == null) ? new Gas() : (Gas)target;
        super.copyTo(target, copyBuilder);

        if (isSetIsVentilated())
            copy.setIsVentilated(copyBuilder.copy(isVentilated));

        if (isSetRValue())
            copy.setRValue((Measure)copyBuilder.copy(rValue));

        return copy;
    }
}
