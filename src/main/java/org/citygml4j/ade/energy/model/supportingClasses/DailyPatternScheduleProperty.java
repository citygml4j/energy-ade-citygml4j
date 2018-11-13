package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRepOrRef;

public class DailyPatternScheduleProperty extends AssociationByRepOrRef<DailyPatternSchedule> implements ADEModelObject {

    public DailyPatternScheduleProperty() {
    }

    public DailyPatternScheduleProperty(DailyPatternSchedule dailyPatternSchedule) {
        super(dailyPatternSchedule);
    }

    public DailyPatternScheduleProperty(String href) {
        super(href);
    }

    public DailyPatternSchedule getDailyPatternSchedule() {
        return super.getObject();
    }

    public boolean isSetDailyPatternSchedule() {
        return super.isSetObject();
    }

    public void setDailyPatternSchedule(DailyPatternSchedule dailyPatternSchedule) {
        super.setObject(dailyPatternSchedule);
    }

    public void unsetDailyPatternSchedule() {
        super.unsetObject();
    }

    @Override
    public Class<DailyPatternSchedule> getAssociableClass() {
        return DailyPatternSchedule.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DailyPatternScheduleProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DailyPatternScheduleProperty copy = (target == null) ? new DailyPatternScheduleProperty() : (DailyPatternScheduleProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
