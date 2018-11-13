package org.citygml4j.ade.energy.model.occupantBehaviour;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class OccupantsProperty extends FeatureProperty<Occupants> implements ADEModelObject {

    public OccupantsProperty() {
    }

    public OccupantsProperty(Occupants occupants) {
        super(occupants);
    }

    public OccupantsProperty(String href) {
        super(href);
    }

    public Occupants getOccupants() {
        return super.getObject();
    }

    public boolean isSetOccupants() {
        return super.isSetObject();
    }

    public void setOccupants(Occupants occupants) {
        super.setObject(occupants);
    }

    public void unsetOccupants() {
        super.unsetObject();
    }

    @Override
    public Class<Occupants> getAssociableClass() {
        return Occupants.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new OccupantsProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        OccupantsProperty copy = (target == null) ? new OccupantsProperty() : (OccupantsProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
