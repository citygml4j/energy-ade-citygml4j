package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class AbstractConstructionProperty extends FeatureProperty<AbstractConstruction> implements ADEModelObject {

    public AbstractConstructionProperty() {
    }

    public AbstractConstructionProperty(AbstractConstruction abstractConstruction) {
        super(abstractConstruction);
    }

    public AbstractConstructionProperty(String href) {
        super(href);
    }

    public AbstractConstruction getAbstractConstruction() {
        return super.getObject();
    }

    public boolean isSetAbstractConstruction() {
        return super.isSetObject();
    }

    public void setAbstractConstruction(AbstractConstruction abstractConstruction) {
        super.setObject(abstractConstruction);
    }

    public void unsetAbstractConstruction() {
        super.unsetObject();
    }

    @Override
    public Class<AbstractConstruction> getAssociableClass() {
        return AbstractConstruction.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AbstractConstructionProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AbstractConstructionProperty copy = (target == null) ? new AbstractConstructionProperty() : (AbstractConstructionProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
