package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class EnergyDemandProperty extends FeatureProperty<EnergyDemand> implements ADEModelObject {

    public EnergyDemandProperty() {
    }

    public EnergyDemandProperty(EnergyDemand energyDemand) {
        super(energyDemand);
    }

    public EnergyDemandProperty(String href) {
        super(href);
    }

    public EnergyDemand getEnergyDemand() {
        return super.getObject();
    }

    public boolean isSetEnergyDemand() {
        return super.isSetObject();
    }

    public void setEnergyDemand(EnergyDemand energyDemand) {
        super.setObject(energyDemand);
    }

    public void unsetEnergyDemand() {
        super.unsetObject();
    }

    @Override
    public Class<EnergyDemand> getAssociableClass() {
        return EnergyDemand.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new EnergyDemandProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        EnergyDemandProperty copy = (target == null) ? new EnergyDemandProperty() : (EnergyDemandProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}