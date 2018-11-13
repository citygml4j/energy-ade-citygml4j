package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;

import java.time.ZonedDateTime;

public class TimePeriod implements Associable, ADEModelObject {
    private ZonedDateTime beginPosition;
    private ZonedDateTime endPosition;
    private ModelObject parent;

    public ZonedDateTime getBeginPosition() {
        return beginPosition;
    }

    public boolean isSetBeginPosition() {
        return beginPosition != null;
    }

    public void setBeginPosition(ZonedDateTime beginPosition) {
        this.beginPosition = beginPosition;
    }

    public ZonedDateTime getEndPosition() {
        return endPosition;
    }

    public boolean isSetEndPosition() {
        return endPosition != null;
    }

    public void setEndPosition(ZonedDateTime endPosition) {
        this.endPosition = endPosition;
    }

    @Override
    public ModelObject getParent() {
        return parent;
    }

    @Override
    public boolean isSetParent() {
        return parent != null;
    }

    @Override
    public void setParent(ModelObject parent) {
        this.parent = parent;
    }

    @Override
    public void unsetParent() {
        parent = null;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TimePeriod(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TimePeriod copy = (target == null) ? new TimePeriod() : (TimePeriod)target;

        if (isSetBeginPosition())
            copy.setBeginPosition((ZonedDateTime)copyBuilder.copy(beginPosition));

        if (isSetEndPosition())
            copy.setEndPosition((ZonedDateTime)copyBuilder.copy(endPosition));

        copy.unsetParent();
        return copy;
    }
}
