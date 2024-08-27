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

package org.citygml4j.ade.energy.model.buildingPhysics;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class ThermalBoundaryProperty extends FeatureProperty<ThermalBoundary> implements ADEModelObject {

    public ThermalBoundaryProperty() {
    }

    public ThermalBoundaryProperty(ThermalBoundary thermalBoundary) {
        super(thermalBoundary);
    }

    public ThermalBoundaryProperty(String href) {
        super(href);
    }

    public ThermalBoundary getThermalBoundary() {
        return super.getObject();
    }

    public boolean isSetThermalBoundary() {
        return super.isSetObject();
    }

    public void setThermalBoundary(ThermalBoundary thermalBoundary) {
        super.setObject(thermalBoundary);
    }

    public void unsetThermalBoundary() {
        super.unsetObject();
    }

    @Override
    public Class<ThermalBoundary> getAssociableClass() {
        return ThermalBoundary.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ThermalBoundaryProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ThermalBoundaryProperty copy = (target == null) ? new ThermalBoundaryProperty() : (ThermalBoundaryProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
