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

import org.citygml4j.ade.energy.model.core.TransmittanceProperty;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.measures.Scale;

import java.util.List;

public class OpticalProperties implements Associable, ADEModelObject {
    private List<ReflectanceProperty> reflectance;
    private List<TransmittanceProperty> transmittance;
    private Scale glazingRatio;
    private ModelObject parent;

    public void addReflectance(ReflectanceProperty reflectance) {
        if (this.reflectance == null)
            this.reflectance = new ChildList<>(this);

        this.reflectance.add(reflectance);
    }

    public List<ReflectanceProperty> getReflectance() {
        if (reflectance == null)
            reflectance = new ChildList<>(this);

        return reflectance;
    }

    public boolean isSetReflectance() {
        return reflectance != null && !reflectance.isEmpty();
    }

    public void setReflectance(List<ReflectanceProperty> reflectance) {
        this.reflectance = new ChildList<>(this, reflectance);
    }

    public void addTransmittance(TransmittanceProperty transmittance) {
        if (this.transmittance == null)
            this.transmittance = new ChildList<>(this);

        this.transmittance.add(transmittance);
    }

    public List<TransmittanceProperty> getTransmittance() {
        if (transmittance == null)
            transmittance = new ChildList<>(this);

        return transmittance;
    }

    public boolean isSetTransmittance() {
        return transmittance != null && !transmittance.isEmpty();
    }

    public void setTransmittance(List<TransmittanceProperty> transmittance) {
        this.transmittance = new ChildList<>(this, transmittance);
    }

    public Scale getGlazingRatio() {
        return glazingRatio;
    }

    public boolean isSetGlazingRatio() {
        return glazingRatio != null;
    }

    public void setGlazingRatio(Scale glazingRatio) {
        if (glazingRatio != null)
            glazingRatio.setParent(this);

        this.glazingRatio = glazingRatio;
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
        return copyTo(new OpticalProperties(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        OpticalProperties copy = (target == null) ? new OpticalProperties() : (OpticalProperties)target;

        if (isSetReflectance()) {
            for (ReflectanceProperty part : reflectance) {
                ReflectanceProperty copyPart = (ReflectanceProperty)copyBuilder.copy(part);
                copy.addReflectance(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        if (isSetTransmittance()) {
            for (TransmittanceProperty part : transmittance) {
                TransmittanceProperty copyPart = (TransmittanceProperty)copyBuilder.copy(part);
                copy.addTransmittance(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        if (isSetGlazingRatio())
            copy.setGlazingRatio((Scale)copyBuilder.copy(glazingRatio));

        copy.unsetParent();
        return copy;
    }
}
