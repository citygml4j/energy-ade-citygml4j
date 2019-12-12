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

import org.citygml4j.ade.energy.model.core.AbstractConstructionProperty;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurfaceProperty;
import org.citygml4j.model.gml.measures.Angle;
import org.citygml4j.model.gml.measures.Area;
import org.citygml4j.util.bbox.BoundingBoxOptions;

import java.util.List;

public class ThermalBoundary extends AbstractCityObject implements ADEModelObject {
    private Area area;
    private Angle azimuth;
    private Angle inclination;
    private ThermalBoundaryTypeValue thermalBoundaryType;
    private AbstractConstructionProperty construction;
    private MultiSurfaceProperty surfaceGeometry;
    private List<ThermalOpeningProperty> contains;
    private List<ThermalZoneProperty> delimits;

    public Area getArea() {
        return area;
    }

    public boolean isSetArea() {
        return area != null;
    }

    public void setArea(Area area) {
        if (area != null)
            area.setParent(this);

        this.area = area;
    }

    public Angle getAzimuth() {
        return azimuth;
    }

    public boolean isSetAzimuth() {
        return azimuth != null;
    }

    public void setAzimuth(Angle azimuth) {
        if (area != null)
            area.setParent(this);

        this.azimuth = azimuth;
    }

    public Angle getInclination() {
        return inclination;
    }

    public boolean isSetInclination() {
        return inclination != null;
    }

    public void setInclination(Angle inclination) {
        if (inclination != null)
            inclination.setParent(this);

        this.inclination = inclination;
    }

    public boolean isSetThermalBoundaryType() {
        return thermalBoundaryType != null;
    }

    public ThermalBoundaryTypeValue getThermalBoundaryType() {
        return thermalBoundaryType;
    }

    public void setThermalBoundaryType(ThermalBoundaryTypeValue thermalBoundaryType) {
        this.thermalBoundaryType = thermalBoundaryType;
    }

    public AbstractConstructionProperty getConstruction() {
        return construction;
    }

    public boolean isSetConstruction() {
        return construction != null;
    }

    public void setConstruction(AbstractConstructionProperty construction) {
        if (construction != null)
            construction.setParent(this);

        this.construction = construction;
    }

    public MultiSurfaceProperty getSurfaceGeometry() {
        return surfaceGeometry;
    }

    public boolean isSetSurfaceGeometry() {
        return surfaceGeometry != null;
    }

    public void setSurfaceGeometry(MultiSurfaceProperty surfaceGeometry) {
        if (surfaceGeometry != null)
            surfaceGeometry.setParent(this);

        this.surfaceGeometry = surfaceGeometry;
    }

    public void addContains(ThermalOpeningProperty contains) {
        if (this.contains == null)
            this.contains = new ChildList<>(this);

        this.contains.add(contains);
    }

    public List<ThermalOpeningProperty> getContains() {
        if (contains == null)
            contains = new ChildList<>(this);

        return contains;
    }

    public boolean isSetContains() {
        return contains != null && !contains.isEmpty();
    }

    public void setContains(List<ThermalOpeningProperty> contains) {
        this.contains = new ChildList<>(this, contains);
    }

    public void addDelimits(ThermalZoneProperty delimits) {
        if (this.delimits == null)
            this.delimits = new ChildList<>(this);

        this.delimits.add(delimits);
    }

    public List<ThermalZoneProperty> getDelimits() {
        if (delimits == null)
            delimits = new ChildList<>(this);

        return delimits;
    }

    public boolean isSetDelimits() {
        return delimits != null && !delimits.isEmpty();
    }

    public void setDelimits(List<ThermalZoneProperty> delimits) {
        this.delimits = new ChildList<>(this, delimits);
    }

    @Override
    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        BoundingShape boundedBy = super.calcBoundedBy(options);
        if (options.isUseExistingEnvelopes() && !boundedBy.isEmpty())
            return boundedBy;

        if (surfaceGeometry != null && surfaceGeometry.isSetMultiSurface())
            boundedBy.updateEnvelope(surfaceGeometry.getMultiSurface().calcBoundingBox());

        if (options.isAssignResultToFeatures())
            setBoundedBy(boundedBy);

        return boundedBy;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ThermalBoundary(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ThermalBoundary copy = (target == null) ? new ThermalBoundary() : (ThermalBoundary)target;
        super.copyTo(copy, copyBuilder);

        if (isSetArea())
            copy.setArea((Area)copyBuilder.copy(area));

        if (isSetAzimuth())
            copy.setAzimuth((Angle)copyBuilder.copy(azimuth));

        if (isSetInclination())
            copy.setInclination((Angle)copyBuilder.copy(inclination));

        if (isSetThermalBoundaryType())
            copy.setThermalBoundaryType(thermalBoundaryType);

        if (isSetConstruction())
            copy.setConstruction((AbstractConstructionProperty)copyBuilder.copy(construction));

        if (isSetSurfaceGeometry())
            copy.setSurfaceGeometry((MultiSurfaceProperty)copyBuilder.copy(surfaceGeometry));

        if (isSetContains()) {
            for (ThermalOpeningProperty part : contains) {
                ThermalOpeningProperty copyPart = (ThermalOpeningProperty)copyBuilder.copy(part);
                copy.addContains(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        if (isSetDelimits()) {
            for (ThermalZoneProperty part : delimits) {
                ThermalZoneProperty copyPart = (ThermalZoneProperty)copyBuilder.copy(part);
                copy.addDelimits(copyPart);

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
