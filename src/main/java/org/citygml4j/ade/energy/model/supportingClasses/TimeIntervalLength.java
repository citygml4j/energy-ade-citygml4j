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
import org.citygml4j.model.common.base.ModelObject;

public class TimeIntervalLength implements ADEModelObject {
    private Double value;
    private String unit;
    private Integer radix;
    private Integer factor;
    private ModelObject parent;

    public Double getValue() {
        return value;
    }

    public boolean isSetValue() {
        return value != null;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public boolean isSetUnit() {
        return unit != null;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getRadix() {
        return radix;
    }

    public boolean isSetRadix() {
        return radix != null;
    }

    public void setRadix(Integer radix) {
        this.radix = radix;
    }

    public Integer getFactor() {
        return factor;
    }

    public boolean isSetFactor() {
        return factor != null;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
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
        return copyTo(new TimeIntervalLength(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TimeIntervalLength copy = (target == null) ? new TimeIntervalLength() : (TimeIntervalLength)target;

        if (isSetValue())
            copy.setValue(value);

        if (isSetUnit())
            copy.setUnit(copyBuilder.copy(unit));

        if (isSetRadix())
            copy.setRadix(radix);

        if (isSetFactor())
            copy.setFactor(factor);

        copy.unsetParent();
        return copy;
    }
}
