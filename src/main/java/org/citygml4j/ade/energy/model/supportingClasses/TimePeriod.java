/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Claus Nagel <claus.nagel@gmail.com>
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

import java.time.ZonedDateTime;

public class TimePeriod implements Associable, ADEModelObject {
    private ZonedDateTime beginPosition;
    private ZonedDateTime endPosition;
    private ModelObject parent;

    public ZonedDateTime getBeginPosition() {
        return beginPosition;
    }

    public boolean isSetBeginPosition() {
        return beginPosition != null;
    }

    public void setBeginPosition(ZonedDateTime beginPosition) {
        this.beginPosition = beginPosition;
    }

    public ZonedDateTime getEndPosition() {
        return endPosition;
    }

    public boolean isSetEndPosition() {
        return endPosition != null;
    }

    public void setEndPosition(ZonedDateTime endPosition) {
        this.endPosition = endPosition;
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
        return copyTo(new TimePeriod(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TimePeriod copy = (target == null) ? new TimePeriod() : (TimePeriod) target;

        if (isSetBeginPosition())
            copy.setBeginPosition((ZonedDateTime) copyBuilder.copy(beginPosition));

        if (isSetEndPosition())
            copy.setEndPosition((ZonedDateTime) copyBuilder.copy(endPosition));

        copy.unsetParent();
        return copy;
    }
}
