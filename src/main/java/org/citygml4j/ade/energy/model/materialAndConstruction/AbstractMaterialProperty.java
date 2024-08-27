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

package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class AbstractMaterialProperty extends FeatureProperty<AbstractMaterial> implements ADEModelObject {

    public AbstractMaterialProperty() {
    }

    public AbstractMaterialProperty(AbstractMaterial abstractMaterial) {
        super(abstractMaterial);
    }

    public AbstractMaterialProperty(String href) {
        super(href);
    }

    public AbstractMaterial getAbstractMaterial() {
        return super.getObject();
    }

    public boolean isSetAbstractMaterial() {
        return super.isSetObject();
    }

    public void setAbstractMaterial(AbstractMaterial abstractMaterial) {
        super.setObject(abstractMaterial);
    }

    public void unsetAbstractMaterial() {
        super.unsetObject();
    }

    @Override
    public Class<AbstractMaterial> getAssociableClass() {
        return AbstractMaterial.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AbstractMaterialProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AbstractMaterialProperty copy = (target == null) ? new AbstractMaterialProperty() : (AbstractMaterialProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
