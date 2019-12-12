/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2013-2019 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
