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
        Layer copy = (target == null) ? new Layer() : (Layer)target;
        super.copyTo(target, copyBuilder);

        if (isSetLayerComponent()) {
            for (LayerComponentProperty part : layerComponent) {
                LayerComponentProperty copyPart = (LayerComponentProperty)copyBuilder.copy(part);
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
