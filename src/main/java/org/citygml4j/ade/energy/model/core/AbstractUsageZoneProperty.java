package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class AbstractUsageZoneProperty extends FeatureProperty<AbstractUsageZone> implements ADEModelObject {

    public AbstractUsageZoneProperty() {
    }

    public AbstractUsageZoneProperty(AbstractUsageZone abstractUsageZone) {
        super(abstractUsageZone);
    }

    public AbstractUsageZoneProperty(String href) {
        super(href);
    }

    public AbstractUsageZone getAbstractUsageZone() {
        return super.getObject();
    }

    public boolean isSetAbstractUsageZone() {
        return super.isSetObject();
    }

    public void setAbstractUsageZone(AbstractUsageZone abstractUsageZone) {
        super.setObject(abstractUsageZone);
    }

    public void unsetAbstractUsageZone() {
        super.unsetObject();
    }

    @Override
    public Class<AbstractUsageZone> getAssociableClass() {
        return AbstractUsageZone.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AbstractUsageZoneProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AbstractUsageZoneProperty copy = (target == null) ? new AbstractUsageZoneProperty() : (AbstractUsageZoneProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
