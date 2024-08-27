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
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.AbstractFeature;

import java.util.List;

public class Layer extends AbstractFeature implements ADEModelObject {
    private List<LayerComponentProperty> layerComponent;

    public void addLayerComponent(LayerComponentProperty layerComponent) {
        if (this.layerComponent == null)
            this.layerComponent = new ChildList<>(this);

        this.layerComponent.add(layerComponent);
    }

    public List<LayerComponentProperty> getLayerComponent() {
        if (layerComponent == null)
            layerComponent = new ChildList<>(this);

        return layerComponent;
    }

    public boolean isSetLayerComponent() {
        return layerComponent != null && !layerComponent.isEmpty();
    }

    public void setLayerComponent(List<LayerComponentProperty> layerComponent) {
        this.layerComponent = new ChildList<>(this, layerComponent);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Layer(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Layer copy = (target == null) ? new Layer() : (Layer) target;
        super.copyTo(copy, copyBuilder);

        if (isSetLayerComponent()) {
            for (LayerComponentProperty part : layerComponent) {
                LayerComponentProperty copyPart = (LayerComponentProperty) copyBuilder.copy(part);
                copy.addLayerComponent(copyPart);

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
