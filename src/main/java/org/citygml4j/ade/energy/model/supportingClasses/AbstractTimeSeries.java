package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.base.AbstractGML;

public abstract class AbstractTimeSeries extends AbstractGML implements ADEModelObject {
    private TimeValuesPropertiesProperty variableProperties;

    public TimeValuesPropertiesProperty getVariableProperties() {
        return variableProperties;
    }

    public boolean isSetVariableProperties() {
        return variableProperties != null;
    }

    public void setVariableProperties(TimeValuesPropertiesProperty variableProperties) {
        if (variableProperties != null)
            variableProperties.setParent(this);

        this.variableProperties = variableProperties;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        AbstractTimeSeries copy = (AbstractTimeSeries)target;
        super.copyTo(copy, copyBuilder);

        if (isSetVariableProperties())
            copy.setVariableProperties((TimeValuesPropertiesProperty)copyBuilder.copy(variableProperties));

        return copy;
    }

    @Override
    public void accept(GMLVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(GMLFunctor<T> visitor) {
        return visitor.apply(this);
    }
}
