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

package org.citygml4j.ade.energy.model.occupantBehaviour;

import org.citygml4j.ade.energy.model.core.HeatExchangeTypeProperty;
import org.citygml4j.ade.energy.model.supportingClasses.AbstractScheduleProperty;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;

public class Facilities extends AbstractCityObject implements ADEModelObject {
    private HeatExchangeTypeProperty heatDissipation;
    private AbstractScheduleProperty operationSchedule;

    public HeatExchangeTypeProperty getHeatDissipation() {
        return heatDissipation;
    }

    public boolean isSetHeatDissipation() {
        return heatDissipation != null;
    }

    public void setHeatDissipation(HeatExchangeTypeProperty heatDissipation) {
        if (heatDissipation != null)
            heatDissipation.setParent(this);

        this.heatDissipation = heatDissipation;
    }

    public AbstractScheduleProperty getOperationSchedule() {
        return operationSchedule;
    }

    public boolean isSetOperationSchedule() {
        return operationSchedule != null;
    }

    public void setOperationSchedule(AbstractScheduleProperty operationSchedule) {
        if (operationSchedule != null)
            operationSchedule.setParent(this);

        this.operationSchedule = operationSchedule;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Facilities(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Facilities copy = (target == null) ? new Facilities() : (Facilities)target;
        super.copyTo(target, copyBuilder);

        if (isSetHeatDissipation())
            copy.setHeatDissipation((HeatExchangeTypeProperty)copyBuilder.copy(heatDissipation));

        if (isSetOperationSchedule())
            copy.setOperationSchedule((AbstractScheduleProperty)copyBuilder.copy(operationSchedule));

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
