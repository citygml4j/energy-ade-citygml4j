package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class PeriodOfYear implements Associable, ADEModelObject {
    private TimePeriodProperty period;
    private List<DailyScheduleProperty> dailySchedule;
    private ModelObject parent;

    public TimePeriodProperty getPeriod() {
        return period;
    }

    public boolean isSetPeriod() {
        return period != null;
    }

    public void setPeriod(TimePeriodProperty period) {
        if (period != null)
            period.setParent(this);

        this.period = period;
    }

    public void addDailySchedule(DailyScheduleProperty dailySchedule) {
        if (this.dailySchedule == null)
            this.dailySchedule = new ChildList<>(this);

        this.dailySchedule.add(dailySchedule);
    }

    public List<DailyScheduleProperty> getDailySchedule() {
        if (dailySchedule == null)
            dailySchedule = new ChildList<>(this);

        return dailySchedule;
    }

    public boolean isSetDailySchedule() {
        return dailySchedule != null && !dailySchedule.isEmpty();
    }

    public void setDailySchedule(List<DailyScheduleProperty> dailySchedule) {
        this.dailySchedule = new ChildList<>(this, dailySchedule);
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
        return copyTo(new PeriodOfYear(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PeriodOfYear copy = (target == null) ? new PeriodOfYear() : (PeriodOfYear)target;

        if (isSetPeriod())
            copy.setPeriod((TimePeriodProperty)copyBuilder.copy(period));

        if (isSetDailySchedule()) {
            for (DailyScheduleProperty part : dailySchedule) {
                DailyScheduleProperty copyPart = (DailyScheduleProperty)copyBuilder.copy(part);
                copy.addDailySchedule(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        copy.unsetParent();
        return copy;
    }
}
