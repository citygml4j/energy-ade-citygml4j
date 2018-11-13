package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class TimeValuesPropertiesProperty extends AssociationByRep<TimeValuesProperties> implements ADEModelObject {

    public TimeValuesPropertiesProperty() {
    }

    public TimeValuesPropertiesProperty(TimeValuesProperties timeValuesProperties) {
        super(timeValuesProperties);
    }

    public TimeValuesProperties getTimeValuesProperties() {
        return super.getObject();
    }

    public boolean isSetTimeValuesProperties() {
        return super.isSetObject();
    }

    public void setTimeValuesProperties(TimeValuesProperties timeValuesProperties) {
        super.setObject(timeValuesProperties);
    }

    public void unsetTimeValuesProperties() {
        super.unsetObject();
    }

    @Override
    public Class<TimeValuesProperties> getAssociableClass() {
        return TimeValuesProperties.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TimeValuesPropertiesProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TimeValuesPropertiesProperty copy = (target == null) ? new TimeValuesPropertiesProperty() : (TimeValuesPropertiesProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
