package org.citygml4j.ade.energy.model.buildingPhysics;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class ThermalZoneProperty extends FeatureProperty<ThermalZone> implements ADEModelObject {

    public ThermalZoneProperty() {
    }

    public ThermalZoneProperty(ThermalZone thermalZone) {
        super(thermalZone);
    }

    public ThermalZoneProperty(String href) {
        super(href);
    }

    public ThermalZone getThermalZone() {
        return super.getObject();
    }

    public boolean isSetThermalZone() {
        return super.isSetObject();
    }

    public void setThermalZone(ThermalZone thermalZone) {
        super.setObject(thermalZone);
    }

    public void unsetThermalZone() {
        super.unsetObject();
    }

    @Override
    public Class<ThermalZone> getAssociableClass() {
        return ThermalZone.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ThermalZoneProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ThermalZoneProperty copy = (target == null) ? new ThermalZoneProperty() : (ThermalZoneProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
