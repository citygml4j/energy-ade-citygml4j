package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.measures.Area;

public class FloorArea implements Associable, ADEModelObject {
    private FloorAreaTypeValue type;
    private Area value;
    private ModelObject parent;

    public FloorAreaTypeValue getType() {
        return type;
    }

    public boolean isSetType() {
        return type != null;
    }

    public void setType(FloorAreaTypeValue type) {
        this.type = type;
    }

    public Area getValue() {
        return value;
    }

    public boolean isSetValue() {
        return value != null;
    }

    public void setValue(Area value) {
        if (value != null)
            value.setParent(this);

        this.value = value;
    }

    @Override
    public ModelObject getParent() {
        return parent;
    }

    @Override
    public boolean isSetParent() {
        return parent != null;
    }

    @Override
    public void setParent(ModelObject parent) {
        this.parent = parent;
    }

    @Override
    public void unsetParent() {
        parent = null;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FloorArea(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FloorArea copy = (target == null) ? new FloorArea() : (FloorArea)target;

        if (isSetType())
            copy.setType(type);

        if (isSetValue())
            copy.setValue((Area)copyBuilder.copy(value));

        copy.unsetParent();
        return copy;
    }
}
