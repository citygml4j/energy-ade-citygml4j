package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class AbstractThermalZoneProperty extends FeatureProperty<AbstractThermalZone> implements ADEModelObject {

    public AbstractThermalZoneProperty() {
    }

    public AbstractThermalZoneProperty(AbstractThermalZone abstractThermalZone) {
        super(abstractThermalZone);
    }

    public AbstractThermalZoneProperty(String href) {
        super(href);
    }

    public AbstractThermalZone getAbstractThermalZone() {
        return super.getObject();
    }

    public boolean isSetAbstractThermalZone() {
        return super.isSetObject();
    }

    public void setAbstractThermalZone(AbstractThermalZone abstractThermalZone) {
        super.setObject(abstractThermalZone);
    }

    public void unsetAbstractThermalZone() {
        super.unsetObject();
    }

    @Override
    public Class<AbstractThermalZone> getAssociableClass() {
        return AbstractThermalZone.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AbstractThermalZoneProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AbstractThermalZoneProperty copy = (target == null) ? new AbstractThermalZoneProperty() : (AbstractThermalZoneProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
