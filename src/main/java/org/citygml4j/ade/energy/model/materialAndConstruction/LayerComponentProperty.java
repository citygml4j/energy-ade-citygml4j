package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class LayerComponentProperty extends FeatureProperty<LayerComponent> implements ADEModelObject {

    public LayerComponentProperty() {
    }

    public LayerComponentProperty(LayerComponent layerComponent) {
        super(layerComponent);
    }

    public LayerComponentProperty(String href) {
        super(href);
    }

    public LayerComponent getLayerComponent() {
        return super.getObject();
    }

    public boolean isSetLayerComponent() {
        return super.isSetObject();
    }

    public void setLayerComponent(LayerComponent layerComponent) {
        super.setObject(layerComponent);
    }

    public void unsetLayerComponent() {
        super.unsetObject();
    }

    @Override
    public Class<LayerComponent> getAssociableClass() {
        return LayerComponent.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LayerComponentProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LayerComponentProperty copy = (target == null) ? new LayerComponentProperty() : (LayerComponentProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
