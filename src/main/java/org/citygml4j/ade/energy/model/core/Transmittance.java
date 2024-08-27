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

package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.measures.Scale;

public class Transmittance implements Associable, ADEModelObject {
    private Scale fraction;
    private WavelengthRangeType wavelengthRangeType;
    private ModelObject parent;

    public Scale getFraction() {
        return fraction;
    }

    public boolean isSetFraction() {
        return fraction != null;
    }

    public void setFraction(Scale fraction) {
        if (fraction != null)
            fraction.setParent(this);

        this.fraction = fraction;
    }

    public WavelengthRangeType getWavelengthRangeType() {
        return wavelengthRangeType;
    }

    public boolean isSetWavelengthRangeType() {
        return wavelengthRangeType != null;
    }

    public void setWavelengthRangeType(WavelengthRangeType wavelengthRangeType) {
        this.wavelengthRangeType = wavelengthRangeType;
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
        return copyTo(new Transmittance(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Transmittance copy = (target == null) ? new Transmittance() : (Transmittance) target;

        if (isSetFraction())
            copy.setFraction((Scale) copyBuilder.copy(fraction));

        if (isSetWavelengthRangeType())
            copy.setWavelengthRangeType(wavelengthRangeType);

        copy.unsetParent();
        return copy;
    }
}
