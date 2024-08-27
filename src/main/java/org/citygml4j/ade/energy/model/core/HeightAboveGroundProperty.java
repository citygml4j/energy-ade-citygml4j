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
import org.citygml4j.model.gml.base.AssociationByRep;

public class HeightAboveGroundProperty extends AssociationByRep<HeightAboveGround> implements ADEModelObject {

    public HeightAboveGroundProperty() {
    }

    public HeightAboveGroundProperty(HeightAboveGround heightAboveGround) {
        super(heightAboveGround);
    }

    public HeightAboveGround getHeightAboveGround() {
        return super.getObject();
    }

    public boolean isSetHeightAboveGround() {
        return super.isSetObject();
    }

    public void setHeightAboveGround(HeightAboveGround heightAboveGround) {
        super.setObject(heightAboveGround);
    }

    public void unsetHeightAboveGround() {
        super.unsetObject();
    }

    @Override
    public Class<HeightAboveGround> getAssociableClass() {
        return HeightAboveGround.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new HeightAboveGroundProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        HeightAboveGroundProperty copy = (target == null) ? new HeightAboveGroundProperty() : (HeightAboveGroundProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
