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

package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;

public class TimeValuesProperties implements Associable, ADEModelObject {
    private AcquisitionMethodValue acquisitionMethod;
    private InterpolationTypeValue interpolationType;
    private String qualityDescription;
    private String source;
    private String thematicDescription;
    private ModelObject parent;

    public AcquisitionMethodValue getAcquisitionMethod() {
        return acquisitionMethod;
    }

    public boolean isSetAcquisitionMethod() {
        return acquisitionMethod != null;
    }

    public void setAcquisitionMethod(AcquisitionMethodValue acquisitionMethod) {
        this.acquisitionMethod = acquisitionMethod;
    }

    public InterpolationTypeValue getInterpolationType() {
        return interpolationType;
    }

    public boolean isSetInterpolationType() {
        return interpolationType != null;
    }

    public void setInterpolationType(InterpolationTypeValue interpolationType) {
        this.interpolationType = interpolationType;
    }

    public String getQualityDescription() {
        return qualityDescription;
    }

    public boolean isSetQualityDescription() {
        return qualityDescription != null;
    }

    public void setQualityDescription(String qualityDescription) {
        this.qualityDescription = qualityDescription;
    }

    public String getSource() {
        return source;
    }

    public boolean isSetSource() {
        return source != null;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getThematicDescription() {
        return thematicDescription;
    }

    public boolean isSetThematicDescription() {
        return thematicDescription != null;
    }

    public void setThematicDescription(String thematicDescription) {
        this.thematicDescription = thematicDescription;
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
        return copyTo(new TimeValuesProperties(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TimeValuesProperties copy = (target == null) ? new TimeValuesProperties() : (TimeValuesProperties) target;

        if (isSetAcquisitionMethod())
            copy.setAcquisitionMethod(acquisitionMethod);

        if (isSetInterpolationType())
            copy.setInterpolationType(interpolationType);

        if (isSetQualityDescription())
            copy.setQualityDescription(copyBuilder.copy(qualityDescription));

        if (isSetSource())
            copy.setSource(copyBuilder.copy(source));

        if (isSetThematicDescription())
            copy.setThematicDescription(copyBuilder.copy(thematicDescription));

        copy.unsetParent();
        return copy;
    }
}
