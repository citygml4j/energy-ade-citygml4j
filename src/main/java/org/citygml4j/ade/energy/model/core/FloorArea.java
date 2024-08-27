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
import org.citygml4j.model.gml.measures.Area;

public class FloorArea implements Associable, ADEModelObject {
    private FloorAreaTypeValue type;
    private Area value;
    private ModelObject parent;

    public FloorAreaTypeValue getType() {
        return type;
    }

    public boolean isSetType() {
        return type != null;
    }

    public void setType(FloorAreaTypeValue type) {
        this.type = type;
    }

    public Area getValue() {
        return value;
    }

    public boolean isSetValue() {
        return value != null;
    }

    public void setValue(Area value) {
        if (value != null)
            value.setParent(this);

        this.value = value;
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
        return copyTo(new FloorArea(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FloorArea copy = (target == null) ? new FloorArea() : (FloorArea) target;

        if (isSetType())
            copy.setType(type);

        if (isSetValue())
            copy.setValue((Area) copyBuilder.copy(value));

        copy.unsetParent();
        return copy;
    }
}
