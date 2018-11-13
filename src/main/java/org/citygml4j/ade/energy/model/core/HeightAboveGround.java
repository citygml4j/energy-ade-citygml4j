package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.measures.Length;

public class HeightAboveGround implements Associable, ADEModelObject {
    private ElevationReferenceValue heightReference;
    private Length value;
    private ModelObject parent;

    public ElevationReferenceValue getHeightReference() {
        return heightReference;
    }

    public boolean isSetHeightReference() {
        return heightReference != null;
    }

    public void setHeightReference(ElevationReferenceValue heightReference) {
        this.heightReference = heightReference;
    }

    public Length getValue() {
        if (value != null)
            value.setParent(this);

        return value;
    }

    public boolean isSetValue() {
        return value != null;
    }

    public void setValue(Length value) {
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
        return copyTo(new HeightAboveGround(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        HeightAboveGround copy = (target == null) ? new HeightAboveGround() : (HeightAboveGround)target;

        if (isSetHeightReference())
            copy.setHeightReference(heightReference);

        if (isSetValue())
            copy.setValue((Length)copyBuilder.copy(value));

        copy.unsetParent();
        return copy;
    }
}
