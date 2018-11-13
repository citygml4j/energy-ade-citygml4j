package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;

public class DailySchedule implements Associable, ADEModelObject {
    private DayTypeValue dayType;
    private AbstractTimeSeriesProperty schedule;
    private ModelObject parent;

    public DayTypeValue getDayType() {
        return dayType;
    }

    public boolean isSetDayType() {
        return dayType != null;
    }

    public void setDayType(DayTypeValue dayType) {
        this.dayType = dayType;
    }

    public AbstractTimeSeriesProperty getSchedule() {
        return schedule;
    }

    public boolean isSetSchedule() {
        return schedule != null;
    }

    public void setSchedule(AbstractTimeSeriesProperty schedule) {
        if (schedule != null)
            schedule.setParent(this);

        this.schedule = schedule;
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
        return copyTo(new DailySchedule(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DailySchedule copy = (target == null) ? new DailySchedule() : (DailySchedule)target;

        if (isSetDayType())
            copy.setDayType(dayType);

        if (isSetSchedule())
            copy.setSchedule((AbstractTimeSeriesProperty)copyBuilder.copy(schedule));

        copy.unsetParent();
        return copy;
    }
}
