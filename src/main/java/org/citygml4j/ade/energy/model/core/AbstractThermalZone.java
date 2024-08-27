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
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;

import java.util.List;

public abstract class AbstractThermalZone extends AbstractCityObject implements ADEModelObject {
    private List<AbstractUsageZoneProperty> contains;

    public void addContains(AbstractUsageZoneProperty contains) {
        if (this.contains == null)
            this.contains = new ChildList<>(this);

        this.contains.add(contains);
    }

    public List<AbstractUsageZoneProperty> getContains() {
        if (contains == null)
            contains = new ChildList<>(this);

        return contains;
    }

    public boolean isSetContains() {
        return contains != null && !contains.isEmpty();
    }

    public void setContains(List<AbstractUsageZoneProperty> contains) {
        this.contains = new ChildList<>(this, contains);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        AbstractThermalZone copy = (AbstractThermalZone) target;
        super.copyTo(copy, copyBuilder);

        if (isSetContains()) {
            for (AbstractUsageZoneProperty part : contains) {
                AbstractUsageZoneProperty copyPart = (AbstractUsageZoneProperty) copyBuilder.copy(part);
                copy.addContains(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        return copy;
    }

    @Override
    public void accept(FeatureVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(FeatureFunctor<T> visitor) {
        return visitor.apply(this);
    }

    @Override
    public void accept(GMLVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(GMLFunctor<T> visitor) {
        return visitor.apply(this);
    }
}
