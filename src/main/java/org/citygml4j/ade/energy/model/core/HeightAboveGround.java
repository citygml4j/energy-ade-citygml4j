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

package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.measures.Length;

public class HeightAboveGround implements Associable, ADEModelObject {
    private ElevationReferenceValue heightReference;
    private Length value;
    private ModelObject parent;

    public ElevationReferenceValue getHeightReference() {
        return heightReference;
    }

    public boolean isSetHeightReference() {
        return heightReference != null;
    }

    public void setHeightReference(ElevationReferenceValue heightReference) {
        this.heightReference = heightReference;
    }

    public Length getValue() {
        if (value != null)
            value.setParent(this);

        return value;
    }

    public boolean isSetValue() {
        return value != null;
    }

    public void setValue(Length value) {
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
        return copyTo(new HeightAboveGround(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        HeightAboveGround copy = (target == null) ? new HeightAboveGround() : (HeightAboveGround) target;

        if (isSetHeightReference())
            copy.setHeightReference(heightReference);

        if (isSetValue())
            copy.setValue((Length) copyBuilder.copy(value));

        copy.unsetParent();
        return copy;
    }
}
