package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class AbstractMaterialProperty extends FeatureProperty<AbstractMaterial> implements ADEModelObject {

    public AbstractMaterialProperty() {
    }

    public AbstractMaterialProperty(AbstractMaterial abstractMaterial) {
        super(abstractMaterial);
    }

    public AbstractMaterialProperty(String href) {
        super(href);
    }

    public AbstractMaterial getAbstractMaterial() {
        return super.getObject();
    }

    public boolean isSetAbstractMaterial() {
        return super.isSetObject();
    }

    public void setAbstractMaterial(AbstractMaterial abstractMaterial) {
        super.setObject(abstractMaterial);
    }

    public void unsetAbstractMaterial() {
        super.unsetObject();
    }

    @Override
    public Class<AbstractMaterial> getAssociableClass() {
        return AbstractMaterial.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AbstractMaterialProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AbstractMaterialProperty copy = (target == null) ? new AbstractMaterialProperty() : (AbstractMaterialProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
