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
