package org.citygml4j.ade.energy.model.buildingPhysics;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class ThermalOpeningProperty extends FeatureProperty<ThermalOpening> implements ADEModelObject {

    public ThermalOpeningProperty() {
    }

    public ThermalOpeningProperty(ThermalOpening thermalOpening) {
        super(thermalOpening);
    }

    public ThermalOpeningProperty(String href) {
        super(href);
    }

    public ThermalOpening getThermalOpening() {
        return super.getObject();
    }

    public boolean isSetThermalOpening() {
        return super.isSetObject();
    }

    public void setThermalOpening(ThermalOpening thermalOpening) {
        super.setObject(thermalOpening);
    }

    public void unsetThermalOpening() {
        super.unsetObject();
    }

    @Override
    public Class<ThermalOpening> getAssociableClass() {
        return ThermalOpening.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ThermalOpeningProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ThermalOpeningProperty copy = (target == null) ? new ThermalOpeningProperty() : (ThermalOpeningProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
