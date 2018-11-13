package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class ReflectanceProperty extends AssociationByRep<Reflectance> implements ADEModelObject {

    public ReflectanceProperty() {
    }

    public ReflectanceProperty(Reflectance reflectance) {
        super(reflectance);
    }

    public Reflectance getReflectance() {
        return super.getObject();
    }

    public boolean isSetReflectance() {
        return super.isSetObject();
    }

    public void setReflectance(Reflectance reflectance) {
        super.setObject(reflectance);
    }

    public void unsetReflectance() {
        super.unsetObject();
    }

    @Override
    public Class<Reflectance> getAssociableClass() {
        return Reflectance.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ReflectanceProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ReflectanceProperty copy = (target == null) ? new ReflectanceProperty() : (ReflectanceProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
