package org.citygml4j.ade.energy.model.core;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;
import org.citygml4j.model.gml.basicTypes.Code;

public class BuildingTypeProperty extends ADEGenericApplicationProperty<Code> {

    public BuildingTypeProperty() {
    }

    public BuildingTypeProperty(Code value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new BuildingTypeProperty(), copyBuilder);
    }
}
