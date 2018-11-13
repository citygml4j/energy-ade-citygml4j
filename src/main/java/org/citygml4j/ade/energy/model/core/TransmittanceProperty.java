package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class TransmittanceProperty extends AssociationByRep<Transmittance> implements ADEModelObject {

    public TransmittanceProperty() {
    }

    public TransmittanceProperty(Transmittance transmittance) {
        super(transmittance);
    }

    public Transmittance getTransmittance() {
        return super.getObject();
    }

    public boolean isSetTransmittance() {
        return super.isSetObject();
    }

    public void setTransmittance(Transmittance transmittance) {
        super.setObject(transmittance);
    }

    public void unsetTransmittance() {
        super.unsetObject();
    }

    @Override
    public Class<Transmittance> getAssociableClass() {
        return Transmittance.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TransmittanceProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TransmittanceProperty copy = (target == null) ? new TransmittanceProperty() : (TransmittanceProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
