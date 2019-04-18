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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class LayerProperty extends FeatureProperty<Layer> implements ADEModelObject {

    public LayerProperty() {
    }

    public LayerProperty(Layer layer) {
        super(layer);
    }

    public LayerProperty(String href) {
        super(href);
    }

    public Layer getLayer() {
        return super.getObject();
    }

    public boolean isSetLayer() {
        return super.isSetObject();
    }

    public void setLayer(Layer layer) {
        super.setObject(layer);
    }

    public void unsetLayer() {
        super.unsetObject();
    }

    @Override
    public Class<Layer> getAssociableClass() {
        return Layer.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LayerProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LayerProperty copy = (target == null) ? new LayerProperty() : (LayerProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
