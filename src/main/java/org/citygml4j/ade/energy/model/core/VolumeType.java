package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.measures.Volume;

public class VolumeType implements Associable, ADEModelObject {
    private VolumeTypeValue type;
    private Volume value;
    private ModelObject parent;

    public VolumeTypeValue getType() {
        return type;
    }

    public boolean isSetType() {
        return type != null;
    }

    public void setType(VolumeTypeValue type) {
        this.type = type;
    }

    public Volume getValue() {
        return value;
    }

    public boolean isSetValue() {
        return value != null;
    }

    public void setValue(Volume value) {
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
        return copyTo(new VolumeType(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        VolumeType copy = (target == null) ? new VolumeType() : (VolumeType)target;

        if (isSetType())
            copy.setType(type);

        if (isSetValue())
            copy.setValue((Volume)copyBuilder.copy(value));

        copy.unsetParent();
        return copy;
    }
}
