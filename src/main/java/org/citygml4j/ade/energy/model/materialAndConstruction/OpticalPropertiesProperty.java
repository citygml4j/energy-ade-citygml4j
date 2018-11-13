package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class OpticalPropertiesProperty extends AssociationByRep<OpticalProperties> implements ADEModelObject {

    public OpticalPropertiesProperty() {
    }

    public OpticalPropertiesProperty(OpticalProperties opticalProperties) {
        super(opticalProperties);
    }

    public OpticalProperties getOpticalProperties() {
        return super.getObject();
    }

    public boolean isSetOpticalProperties() {
        return super.isSetObject();
    }

    public void setOpticalProperties(OpticalProperties opticalProperties) {
        super.setObject(opticalProperties);
    }

    public void unsetOpticalProperties() {
        super.unsetObject();
    }

    @Override
    public Class<OpticalProperties> getAssociableClass() {
        return OpticalProperties.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new OpticalPropertiesProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        OpticalPropertiesProperty copy = (target == null) ? new OpticalPropertiesProperty() : (OpticalPropertiesProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
