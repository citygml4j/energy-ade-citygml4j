package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class DailyScheduleProperty extends AssociationByRep<DailySchedule> implements ADEModelObject {

    public DailyScheduleProperty() {
    }

    public DailyScheduleProperty(DailySchedule dailySchedule) {
        super(dailySchedule);
    }

    public DailySchedule getDaySchedule() {
        return super.getObject();
    }

    public boolean isSetDaySchedule() {
        return super.isSetObject();
    }

    public void setDaySchedule(DailySchedule dailySchedule) {
        super.setObject(dailySchedule);
    }

    public void unsetDaySchedule() {
        super.unsetObject();
    }

    @Override
    public Class<DailySchedule> getAssociableClass() {
        return DailySchedule.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DailyScheduleProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DailyScheduleProperty copy = (target == null) ? new DailyScheduleProperty() : (DailyScheduleProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
