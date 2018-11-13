package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class HeightAboveGroundProperty extends AssociationByRep<HeightAboveGround> implements ADEModelObject {

    public HeightAboveGroundProperty() {
    }

    public HeightAboveGroundProperty(HeightAboveGround heightAboveGround) {
        super(heightAboveGround);
    }

    public HeightAboveGround getHeightAboveGround() {
        return super.getObject();
    }

    public boolean isSetHeightAboveGround() {
        return super.isSetObject();
    }

    public void setHeightAboveGround(HeightAboveGround heightAboveGround) {
        super.setObject(heightAboveGround);
    }

    public void unsetHeightAboveGround() {
        super.unsetObject();
    }

    @Override
    public Class<HeightAboveGround> getAssociableClass() {
        return HeightAboveGround.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new HeightAboveGroundProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        HeightAboveGroundProperty copy = (target == null) ? new HeightAboveGroundProperty() : (HeightAboveGroundProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
