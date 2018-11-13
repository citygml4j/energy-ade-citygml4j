package org.citygml4j.ade.energy.model.occupantBehaviour;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class FacilitiesProperty extends FeatureProperty<Facilities> implements ADEModelObject {

    public FacilitiesProperty() {
    }

    public FacilitiesProperty(Facilities facilities) {
        super(facilities);
    }

    public FacilitiesProperty(String href) {
        super(href);
    }

    public Facilities getFacilities() {
        return super.getObject();
    }

    public boolean isSetFacilities() {
        return super.isSetObject();
    }

    public void setFacilities(Facilities facilities) {
        super.setObject(facilities);
    }

    public void unsetFacilities() {
        super.unsetObject();
    }

    @Override
    public Class<Facilities> getAssociableClass() {
        return Facilities.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FacilitiesProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FacilitiesProperty copy = (target == null) ? new FacilitiesProperty() : (FacilitiesProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
