package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class VolumeTypeProperty extends AssociationByRep<VolumeType> implements ADEModelObject {

    public VolumeTypeProperty() {
    }

    public VolumeTypeProperty(VolumeType volumeType) {
        super(volumeType);
    }

    public VolumeType getVolumeType() {
        return super.getObject();
    }

    public boolean isSetVolumeType() {
        return super.isSetObject();
    }

    public void setVolumeType(VolumeType volumeType) {
        super.setObject(volumeType);
    }

    public void unsetVolumeType() {
        super.unsetObject();
    }

    @Override
    public Class<VolumeType> getAssociableClass() {
        return VolumeType.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new VolumeTypeProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        VolumeTypeProperty copy = (target == null) ? new VolumeTypeProperty() : (VolumeTypeProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
