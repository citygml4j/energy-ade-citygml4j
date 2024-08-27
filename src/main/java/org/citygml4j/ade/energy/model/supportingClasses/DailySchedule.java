/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2021 Claus Nagel <claus.nagel@gmail.com>
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
        DailySchedule copy = (target == null) ? new DailySchedule() : (DailySchedule) target;

        if (isSetDayType())
            copy.setDayType(dayType);

        if (isSetSchedule())
            copy.setSchedule((AbstractTimeSeriesProperty) copyBuilder.copy(schedule));

        copy.unsetParent();
        return copy;
    }
}
