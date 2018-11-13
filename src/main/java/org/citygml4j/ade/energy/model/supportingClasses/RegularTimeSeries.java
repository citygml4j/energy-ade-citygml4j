package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.gml.basicTypes.MeasureList;

public class RegularTimeSeries extends AbstractTimeSeries {
    private TimePeriodProperty temporalExtent;
    private TimeIntervalLength timeInterval;
    private MeasureList values;

    public TimePeriodProperty getTemporalExtent() {
        return temporalExtent;
    }

    public boolean isSetTemporalExtent() {
        return temporalExtent != null;
    }

    public void setTemporalExtent(TimePeriodProperty temporalExtent) {
        if (temporalExtent != null)
            temporalExtent.setParent(this);

        this.temporalExtent = temporalExtent;
    }

    public TimeIntervalLength getTimeInterval() {
        return timeInterval;
    }

    public boolean isSetTimeInterval() {
        return timeInterval != null;
    }

    public void setTimeInterval(TimeIntervalLength timeInterval) {
        if (timeInterval != null)
            timeInterval.setParent(this);

        this.timeInterval = timeInterval;
    }

    public MeasureList getValues() {
        return values;
    }

    public boolean isSetValues() {
        return values != null;
    }

    public void setValues(MeasureList values) {
        if (values != null)
            values.setParent(this);

        this.values = values;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RegularTimeSeries(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RegularTimeSeries copy = (target == null) ? new RegularTimeSeries() : (RegularTimeSeries)target;

        if (isSetTemporalExtent())
            copy.setTemporalExtent((TimePeriodProperty)copyBuilder.copy(temporalExtent));

        if (isSetTimeInterval())
            copy.setTimeInterval((TimeIntervalLength)copyBuilder.copy(timeInterval));

        if (isSetValues())
            copy.setValues((MeasureList)copyBuilder.copy(values));

        return super.copyTo(copy, copyBuilder);
    }
}
