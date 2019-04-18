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
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class DailyPatternSchedule extends AbstractSchedule {
    private List<PeriodOfYearProperty> periodOfYear;

    public void addPeriodOfYear(PeriodOfYearProperty periodOfYear) {
        if (this.periodOfYear == null)
            this.periodOfYear = new ChildList<>(this);

        this.periodOfYear.add(periodOfYear);
    }

    public List<PeriodOfYearProperty> getPeriodOfYear() {
        if (periodOfYear == null)
            periodOfYear = new ChildList<>(this);

        return periodOfYear;
    }

    public boolean isSetPeriodOfYear() {
        return periodOfYear != null && !periodOfYear.isEmpty();
    }

    public void setPeriodOfYear(List<PeriodOfYearProperty> periodOfYear) {
        this.periodOfYear = new ChildList<>(this, periodOfYear);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DailyPatternSchedule(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DailyPatternSchedule copy = (target == null) ? new DailyPatternSchedule() : (DailyPatternSchedule)target;

        if (isSetPeriodOfYear()) {
            for (PeriodOfYearProperty part : periodOfYear) {
                PeriodOfYearProperty copyPart = (PeriodOfYearProperty)copyBuilder.copy(part);
                copy.addPeriodOfYear(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        return super.copyTo(copy, copyBuilder);
    }
}
