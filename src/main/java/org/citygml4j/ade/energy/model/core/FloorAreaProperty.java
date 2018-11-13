package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class FloorAreaProperty extends AssociationByRep<FloorArea> implements ADEModelObject {

    public FloorAreaProperty() {
    }

    public FloorAreaProperty(FloorArea floorArea) {
        super(floorArea);
    }

    public FloorArea getFloorArea() {
        return super.getObject();
    }

    public boolean isSetFloorArea() {
        return super.isSetObject();
    }

    public void setFloorArea(FloorArea floorArea) {
        super.setObject(floorArea);
    }

    public void unsetFloorArea() {
        super.unsetObject();
    }

    @Override
    public Class<FloorArea> getAssociableClass() {
        return FloorArea.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FloorAreaProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FloorAreaProperty copy = (target == null) ? new FloorAreaProperty() : (FloorAreaProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
