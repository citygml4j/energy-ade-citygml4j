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

package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.gml.basicTypes.Measure;

public class Gas extends AbstractMaterial {
    private Boolean isVentilated;
    private Measure rValue;

    public Boolean isVentilated() {
        return isVentilated != null ? isVentilated : false;
    }

    public boolean isSetIsVentilated() {
        return isVentilated != null;
    }

    public void setIsVentilated(Boolean ventilated) {
        isVentilated = ventilated;
    }

    public Measure getRValue() {
        return rValue;
    }

    public boolean isSetRValue() {
        return rValue != null;
    }

    public void setRValue(Measure rValue) {
        if (rValue != null)
            rValue.setParent(this);

        this.rValue = rValue;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Gas(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Gas copy = (target == null) ? new Gas() : (Gas)target;
        super.copyTo(target, copyBuilder);

        if (isSetIsVentilated())
            copy.setIsVentilated(copyBuilder.copy(isVentilated));

        if (isSetRValue())
            copy.setRValue((Measure)copyBuilder.copy(rValue));

        return copy;
    }
}
