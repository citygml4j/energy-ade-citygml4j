package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.gml.measures.Length;
import org.citygml4j.model.gml.measures.Scale;

public class LayerComponent extends AbstractFeature implements ADEModelObject {
    private Scale areaFraction;
    private Length thickness;
    private AbstractMaterialProperty material;

    public Scale getAreaFraction() {
        if (areaFraction == null)
            setAreaFraction(new Scale(1.0));

        return areaFraction;
    }

    public boolean isSetAreaFraction() {
        return areaFraction != null;
    }

    public void setAreaFraction(Scale areaFraction) {
        if (areaFraction != null)
            areaFraction.setParent(this);

        this.areaFraction = areaFraction;
    }

    public Length getThickness() {
        return thickness;
    }

    public boolean isSetThickness() {
        return thickness != null;
    }

    public void setThickness(Length thickness) {
        if (thickness != null)
            thickness.setParent(this);

        this.thickness = thickness;
    }

    public AbstractMaterialProperty getMaterial() {
        return material;
    }

    public boolean isSetMaterial() {
        return material != null;
    }

    public void setMaterial(AbstractMaterialProperty material) {
        if (material != null)
            material.setParent(this);

        this.material = material;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LayerComponent(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LayerComponent copy = (target == null) ? new LayerComponent() : (LayerComponent)target;
        super.copyTo(target, copyBuilder);

        if (isSetAreaFraction())
            copy.setAreaFraction((Scale)copyBuilder.copy(areaFraction));

        if (isSetThickness())
            copy.setThickness((Length)copyBuilder.copy(thickness));

        if (isSetMaterial())
            copy.setMaterial((AbstractMaterialProperty)copyBuilder.copy(material));

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
