package org.citygml4j.ade.energy.model.buildingPhysics;

import org.citygml4j.ade.energy.model.core.AbstractConstructionProperty;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurfaceProperty;
import org.citygml4j.model.gml.measures.Area;
import org.citygml4j.util.bbox.BoundingBoxOptions;

public class ThermalOpening extends AbstractCityObject implements ADEModelObject {
    private Area area;
    private AbstractConstructionProperty construction;
    private MultiSurfaceProperty surfaceGeometry;

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
        return copyTo(new ThermalOpening(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ThermalOpening copy = (target == null) ? new ThermalOpening() : (ThermalOpening)target;
        super.copyTo(target, copyBuilder);

        if (isSetArea())
            copy.setArea((Area)copyBuilder.copy(area));

        if (isSetConstruction())
            copy.setConstruction((AbstractConstructionProperty)copyBuilder.copy(construction));

        if (isSetSurfaceGeometry())
            copy.setSurfaceGeometry((MultiSurfaceProperty)copyBuilder.copy(surfaceGeometry));

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
