package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRepOrRef;

public class AbstractScheduleProperty extends AssociationByRepOrRef<AbstractSchedule> implements ADEModelObject {

    public AbstractScheduleProperty() {
    }

    public AbstractScheduleProperty(AbstractSchedule abstractSchedule) {
        super(abstractSchedule);
    }

    public AbstractScheduleProperty(String href) {
        super(href);
    }

    public AbstractSchedule getAbstractSchedule() {
        return super.getObject();
    }

    public boolean isSetAbstractSchedule() {
        return super.isSetObject();
    }

    public void setAbstractSchedule(AbstractSchedule abstractSchedule) {
        super.setObject(abstractSchedule);
    }

    public void unsetAbstractSchedule() {
        super.unsetObject();
    }

    @Override
    public Class<AbstractSchedule> getAssociableClass() {
        return AbstractSchedule.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AbstractScheduleProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AbstractScheduleProperty copy = (target == null) ? new AbstractScheduleProperty() : (AbstractScheduleProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
