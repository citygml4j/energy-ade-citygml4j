package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class HeatExchangeTypeProperty extends AssociationByRep<HeatExchangeType> implements ADEModelObject {

    public HeatExchangeTypeProperty() {
    }

    public HeatExchangeTypeProperty(HeatExchangeType heatExchangeType) {
        super(heatExchangeType);
    }

    public HeatExchangeType getHeatExchangeType() {
        return super.getObject();
    }

    public boolean isSetHeatExchangeType() {
        return super.isSetObject();
    }

    public void setHeatExchangeType(HeatExchangeType heatExchangeType) {
        super.setObject(heatExchangeType);
    }

    public void unsetHeatExchangeType() {
        super.unsetObject();
    }

    @Override
    public Class<HeatExchangeType> getAssociableClass() {
        return HeatExchangeType.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new HeatExchangeTypeProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        HeatExchangeTypeProperty copy = (target == null) ? new HeatExchangeTypeProperty() : (HeatExchangeTypeProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
