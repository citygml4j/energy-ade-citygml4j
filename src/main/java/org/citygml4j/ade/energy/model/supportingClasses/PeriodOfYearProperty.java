package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class PeriodOfYearProperty extends AssociationByRep<PeriodOfYear> implements ADEModelObject {

    public PeriodOfYearProperty() {
    }

    public PeriodOfYearProperty(PeriodOfYear periodOfYear) {
        super(periodOfYear);
    }

    public PeriodOfYear getPeriodOfYear() {
        return super.getObject();
    }

    public boolean isSetPeriodOfYear() {
        return super.isSetObject();
    }

    public void setPeriodOfYear(PeriodOfYear periodOfYear) {
        super.setObject(periodOfYear);
    }

    public void unsetPeriodOfYear() {
        super.unsetObject();
    }

    @Override
    public Class<PeriodOfYear> getAssociableClass() {
        return PeriodOfYear.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PeriodOfYearProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PeriodOfYearProperty copy = (target == null) ? new PeriodOfYearProperty() : (PeriodOfYearProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
