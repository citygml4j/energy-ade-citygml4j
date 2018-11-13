package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class DemandsProperty extends ADEGenericApplicationProperty<EnergyDemandProperty> {

    public DemandsProperty() {
    }

    public DemandsProperty(EnergyDemandProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DemandsProperty(), copyBuilder);
    }
}
