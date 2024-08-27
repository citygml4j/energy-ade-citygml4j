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

package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.gml.basicTypes.Measure;

public class SolidMaterial extends AbstractMaterial {
    private Measure conductivity;
    private Measure density;
    private Measure permeance;
    private Measure specificHeat;

    public Measure getConductivity() {
        return conductivity;
    }

    public boolean isSetConductivity() {
        return conductivity != null;
    }

    public void setConductivity(Measure conductivity) {
        if (conductivity != null)
            conductivity.setParent(this);

        this.conductivity = conductivity;
    }

    public Measure getDensity() {
        return density;
    }

    public boolean isSetDensity() {
        return density != null;
    }

    public void setDensity(Measure density) {
        if (density != null)
            density.setParent(this);

        this.density = density;
    }

    public Measure getPermeance() {
        return permeance;
    }

    public boolean isSetPermeance() {
        return permeance != null;
    }

    public void setPermeance(Measure permeance) {
        if (permeance != null)
            permeance.setParent(this);

        this.permeance = permeance;
    }

    public Measure getSpecificHeat() {
        return specificHeat;
    }

    public boolean isSetSpecificHeat() {
        return specificHeat != null;
    }

    public void setSpecificHeat(Measure specificHeat) {
        if (specificHeat != null)
            specificHeat.setParent(this);

        this.specificHeat = specificHeat;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SolidMaterial(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SolidMaterial copy = (target == null) ? new SolidMaterial() : (SolidMaterial) target;
        super.copyTo(copy, copyBuilder);

        if (isSetConductivity())
            copy.setConductivity((Measure) copyBuilder.copy(conductivity));

        if (isSetDensity())
            copy.setDensity((Measure) copyBuilder.copy(density));

        if (isSetPermeance())
            copy.setPermeance((Measure) copyBuilder.copy(permeance));

        if (isSetSpecificHeat())
            copy.setSpecificHeat((Measure) copyBuilder.copy(specificHeat));

        return copy;
    }
}
