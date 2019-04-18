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

package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.measures.Scale;

public class HeatExchangeType implements Associable, ADEModelObject {
    private Scale convectiveFraction;
    private Scale latentFraction;
    private Scale radiantFraction;
    private Measure totalValue;
    private ModelObject parent;

    public Scale getConvectiveFraction() {
        return convectiveFraction;
    }

    public boolean isSetConvectiveFraction() {
        return convectiveFraction != null;
    }

    public void setConvectiveFraction(Scale convectiveFraction) {
        if (convectiveFraction != null)
            convectiveFraction.setParent(this);

        this.convectiveFraction = convectiveFraction;
    }

    public Scale getLatentFraction() {
        return latentFraction;
    }

    public boolean isSetLatentFraction() {
        return latentFraction != null;
    }

    public void setLatentFraction(Scale latentFraction) {
        if (latentFraction != null)
            latentFraction.setParent(this);

        this.latentFraction = latentFraction;
    }

    public Scale getRadiantFraction() {
        return radiantFraction;
    }

    public boolean isSetRadiantFraction() {
        return radiantFraction != null;
    }

    public void setRadiantFraction(Scale radiantFraction) {
        if (radiantFraction != null)
            radiantFraction.setParent(this);

        this.radiantFraction = radiantFraction;
    }

    public Measure getTotalValue() {
        return totalValue;
    }

    public boolean isSetTotalValue() {
        return totalValue != null;
    }

    public void setTotalValue(Measure totalValue) {
        if (totalValue != null)
            totalValue.setParent(this);

        this.totalValue = totalValue;
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
        return copyTo(new HeatExchangeType(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        HeatExchangeType copy = (target == null) ? new HeatExchangeType() : (HeatExchangeType)target;

        if (isSetConvectiveFraction())
            copy.setConvectiveFraction((Scale)copyBuilder.copy(convectiveFraction));

        if (isSetLatentFraction())
            copy.setLatentFraction((Scale)copyBuilder.copy(latentFraction));

        if (isSetRadiantFraction())
            copy.setRadiantFraction((Scale)copyBuilder.copy(radiantFraction));

        if (isSetTotalValue())
            copy.setTotalValue((Measure)copyBuilder.copy(totalValue));

        copy.unsetParent();
        return copy;
    }
}
