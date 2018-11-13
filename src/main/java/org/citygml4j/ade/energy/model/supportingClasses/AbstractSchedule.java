package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.base.AbstractGML;

public abstract class AbstractSchedule extends AbstractGML implements ADEModelObject {

    @Override
    public void accept(GMLVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(GMLFunctor<T> visitor) {
        return visitor.apply(this);
    }
}
