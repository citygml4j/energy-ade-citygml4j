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

import org.citygml4j.ade.energy.model.supportingClasses.AbstractTimeSeriesProperty;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.base.Reference;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.feature.AbstractFeature;

import java.util.List;

public class EnergyDemand extends AbstractFeature implements ADEModelObject {
    private EndUseTypeValue endUse;
    private AbstractTimeSeriesProperty energyAmount;
    private Code energyCarrierType;
    private Measure maximumLoad;
    private List<Reference> demandedBy;

    public EndUseTypeValue getEndUse() {
        return endUse;
    }

    public boolean isSetEndUse() {
        return endUse != null;
    }

    public void setEndUse(EndUseTypeValue endUse) {
        this.endUse = endUse;
    }

    public AbstractTimeSeriesProperty getEnergyAmount() {
        return energyAmount;
    }

    public boolean isSetEnergyAmount() {
        return energyAmount != null;
    }

    public void setEnergyAmount(AbstractTimeSeriesProperty energyAmount) {
        if (energyAmount != null)
            energyAmount.setParent(this);

        this.energyAmount = energyAmount;
    }

    public Code getEnergyCarrierType() {
        return energyCarrierType;
    }

    public boolean isSetEnergyCarrierType() {
        return energyCarrierType != null;
    }

    public void setEnergyCarrierType(Code energyCarrierType) {
        if (energyCarrierType != null)
            energyCarrierType.setParent(this);

        this.energyCarrierType = energyCarrierType;
    }

    public Measure getMaximumLoad() {
        return maximumLoad;
    }

    public boolean isSetMaximumLoad() {
        return maximumLoad != null;
    }

    public void setMaximumLoad(Measure maximumLoad) {
        if (maximumLoad != null)
            maximumLoad.setParent(this);

        this.maximumLoad = maximumLoad;
    }

    public void addDemandedBy(Reference demandedBy) {
        if (this.demandedBy == null)
            this.demandedBy = new ChildList<>(this);

        this.demandedBy.add(demandedBy);
    }

    public List<Reference> getDemandedBy() {
        if (this.demandedBy == null)
            this.demandedBy = new ChildList<>(this);

        return demandedBy;
    }

    public boolean isSetDemandedBy() {
        return demandedBy != null && !demandedBy.isEmpty();
    }

    public void setDemandedBy(List<Reference> demandedBy) {
        this.demandedBy = new ChildList<>(this, demandedBy);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new EnergyDemand(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        EnergyDemand copy = (target == null) ? new EnergyDemand() : (EnergyDemand)target;
        super.copyTo(target, copyBuilder);

        if (isSetEndUse())
            copy.setEndUse(endUse);

        if (isSetEnergyAmount())
            copy.setEnergyAmount((AbstractTimeSeriesProperty)copyBuilder.copy(energyAmount));

        if (isSetEnergyCarrierType())
            copy.setEnergyCarrierType((Code)copyBuilder.copy(energyCarrierType));

        if (isSetMaximumLoad())
            copy.setMaximumLoad((Measure)copyBuilder.copy(maximumLoad));

        if (isSetDemandedBy()) {
            for (Reference part : demandedBy) {
                Reference copyPart = (Reference)copyBuilder.copy(part);
                copy.addDemandedBy(copyPart);

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
