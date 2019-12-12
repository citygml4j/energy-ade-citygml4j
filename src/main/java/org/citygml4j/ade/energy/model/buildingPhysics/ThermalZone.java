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

package org.citygml4j.ade.energy.model.buildingPhysics;

import org.citygml4j.ade.energy.model.core.AbstractThermalZone;
import org.citygml4j.ade.energy.model.core.FloorAreaProperty;
import org.citygml4j.ade.energy.model.core.VolumeTypeProperty;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.primitives.SolidProperty;
import org.citygml4j.util.bbox.BoundingBoxOptions;

import java.util.List;

public class ThermalZone extends AbstractThermalZone {
    private List<FloorAreaProperty> floorArea;
    private Measure infiltrationRate;
    private Boolean isCooled;
    private Boolean isHeated;
    private List<VolumeTypeProperty> volume;
    private SolidProperty volumeGeometry;
    private List<ThermalBoundaryProperty> thermalBoundary;

    public void addFloorArea(FloorAreaProperty floorArea) {
        if (this.floorArea == null)
            this.floorArea = new ChildList<>(this);

        this.floorArea.add(floorArea);
    }

    public List<FloorAreaProperty> getFloorArea() {
        if (floorArea == null)
            floorArea = new ChildList<>(this);

        return floorArea;
    }

    public boolean isSetFloorArea() {
        return floorArea != null && !floorArea.isEmpty();
    }

    public void setFloorArea(List<FloorAreaProperty> floorArea) {
        this.floorArea = new ChildList<>(this, floorArea);
    }

    public Measure getInfiltrationRate() {
        return infiltrationRate;
    }

    public boolean isSetInfiltrationRate() {
        return infiltrationRate != null;
    }

    public void setInfiltrationRate(Measure infiltrationRate) {
        if (infiltrationRate != null)
            infiltrationRate.setParent(this);

        this.infiltrationRate = infiltrationRate;
    }

    public Boolean isCooled() {
        return isCooled != null ? isCooled : true;
    }

    public boolean isSetIsCooled() {
        return isCooled != null;
    }

    public void setIsCooled(Boolean cooled) {
        isCooled = cooled;
    }

    public Boolean isHeated() {
        return isHeated != null ? isHeated : true;
    }

    public Boolean isSetIsHeated() {
        return isHeated != null;
    }

    public void setIsHeated(Boolean heated) {
        isHeated = heated;
    }

    public void addVolume(VolumeTypeProperty volume) {
        if (this.volume == null)
            this.volume = new ChildList<>(this);

        this.volume.add(volume);
    }

    public List<VolumeTypeProperty> getVolume() {
        if (volume == null)
            volume = new ChildList<>(this);

        return volume;
    }

    public boolean isSetVolume() {
        return volume != null && !volume.isEmpty();
    }

    public void setVolume(List<VolumeTypeProperty> volume) {
        this.volume = new ChildList<>(this, volume);
    }

    public SolidProperty getVolumeGeometry() {
        return volumeGeometry;
    }

    public boolean isSetVolumeGeometry() {
        return volumeGeometry != null;
    }

    public void setVolumeGeometry(SolidProperty volumeGeometry) {
        if (volumeGeometry != null)
            volumeGeometry.setParent(this);

        this.volumeGeometry = volumeGeometry;
    }

    public void addThermalBoundary(ThermalBoundaryProperty thermalBoundary) {
        if (this.thermalBoundary == null)
            this.thermalBoundary = new ChildList<>(this);

        this.thermalBoundary.add(thermalBoundary);
    }

    public List<ThermalBoundaryProperty> getThermalBoundary() {
        if (thermalBoundary == null)
            thermalBoundary = new ChildList<>(this);

        return thermalBoundary;
    }

    public boolean isSetThermalBoundary() {
        return thermalBoundary != null && !thermalBoundary.isEmpty();
    }

    public void setThermalBoundary(List<ThermalBoundaryProperty> thermalBoundary) {
        this.thermalBoundary = new ChildList<>(this, thermalBoundary);
    }

    @Override
    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        BoundingShape boundedBy = super.calcBoundedBy(options);
        if (options.isUseExistingEnvelopes() && !boundedBy.isEmpty())
            return boundedBy;

        if (volumeGeometry != null && volumeGeometry.isSetSolid())
            boundedBy.updateEnvelope(volumeGeometry.getSolid().calcBoundingBox());

        if (isSetBoundedBy()) {
            for (ThermalBoundaryProperty thermalBoundary : getThermalBoundary()) {
                if (thermalBoundary.isSetObject())
                    boundedBy.updateEnvelope(thermalBoundary.getObject().calcBoundedBy(options).getEnvelope());
            }
        }

        if (options.isAssignResultToFeatures())
            setBoundedBy(boundedBy);

        return boundedBy;
    }


    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ThermalZone(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ThermalZone copy = (target == null) ? new ThermalZone() : (ThermalZone)target;
        super.copyTo(copy, copyBuilder);

        if (isSetFloorArea()) {
            for (FloorAreaProperty part : floorArea) {
                FloorAreaProperty copyPart = (FloorAreaProperty)copyBuilder.copy(part);
                copy.addFloorArea(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        if (isSetInfiltrationRate())
            copy.setInfiltrationRate((Measure)copyBuilder.copy(infiltrationRate));

        if (isSetIsCooled())
            copy.setIsCooled(isCooled);

        if (isSetIsHeated())
            copy.setIsHeated(isHeated);

        if (isSetVolume()) {
            for (VolumeTypeProperty part : volume) {
                VolumeTypeProperty copyPart = (VolumeTypeProperty)copyBuilder.copy(part);
                copy.addVolume(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        if (isSetVolumeGeometry())
            copy.setVolumeGeometry((SolidProperty)copyBuilder.copy(volumeGeometry));

        if (isSetThermalBoundary()) {
            for (ThermalBoundaryProperty part : thermalBoundary) {
                ThermalBoundaryProperty copyPart = (ThermalBoundaryProperty)copyBuilder.copy(part);
                copy.addThermalBoundary(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        return copy;
    }
}
