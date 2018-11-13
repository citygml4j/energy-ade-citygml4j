package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRepOrRef;

public class TimePeriodProperty extends AssociationByRepOrRef<TimePeriod> implements ADEModelObject {

    public TimePeriodProperty() {
    }

    public TimePeriodProperty(TimePeriod timePeriod) {
        super(timePeriod);
    }

    public TimePeriodProperty(String href) {
        super(href);
    }

    public TimePeriod getTimePeriod() {
        return super.getObject();
    }

    public boolean isSetTimePeriod() {
        return super.isSetObject();
    }

    public void setTimePeriod(TimePeriod timePeriod) {
        super.setObject(timePeriod);
    }

    public void unsetTimePeriod() {
        super.unsetObject();
    }

    @Override
    public Class<TimePeriod> getAssociableClass() {
        return TimePeriod.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TimePeriodProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TimePeriodProperty copy = (target == null) ? new TimePeriodProperty() : (TimePeriodProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
