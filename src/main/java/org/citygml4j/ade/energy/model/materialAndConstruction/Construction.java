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

import org.citygml4j.ade.energy.model.core.AbstractConstruction;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.util.List;

public class Construction extends AbstractConstruction {
    private OpticalPropertiesProperty opticalProperties;
    private Measure uValue;
    private List<LayerProperty> layer;

    public OpticalPropertiesProperty getOpticalProperties() {
        return opticalProperties;
    }

    public boolean isSetOpticalProperties() {
        return opticalProperties != null;
    }

    public void setOpticalProperties(OpticalPropertiesProperty opticalProperties) {
        if (opticalProperties != null)
            opticalProperties.setParent(this);

        this.opticalProperties = opticalProperties;
    }

    public Measure getUValue() {
        return uValue;
    }

    public boolean isSetUValue() {
        return uValue != null;
    }

    public void setUValue(Measure uValue) {
        if (uValue != null)
            uValue.setParent(this);

        this.uValue = uValue;
    }

    public void addLayer(LayerProperty layer) {
        if (this.layer == null)
            this.layer = new ChildList<>(this);

        this.layer.add(layer);
    }

    public List<LayerProperty> getLayer() {
        if (layer == null)
            layer = new ChildList<>(this);

        return layer;
    }

    public boolean isSetLayer() {
        return layer != null && !layer.isEmpty();
    }

    public void setLayer(List<LayerProperty> layer) {
        this.layer = new ChildList<>(this, layer);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Construction(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Construction copy = (target == null) ? new Construction() : (Construction) target;
        super.copyTo(copy, copyBuilder);

        if (isSetOpticalProperties())
            copy.setOpticalProperties((OpticalPropertiesProperty) copyBuilder.copy(opticalProperties));

        if (isSetUValue())
            copy.setUValue((Measure) copyBuilder.copy(uValue));

        if (isSetLayer()) {
            for (LayerProperty part : layer) {
                LayerProperty copyPart = (LayerProperty) copyBuilder.copy(part);
                copy.addLayer(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        return copy;
    }
}
