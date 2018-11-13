package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRepOrRef;

public class AbstractTimeSeriesProperty extends AssociationByRepOrRef<AbstractTimeSeries> implements ADEModelObject {

    public AbstractTimeSeriesProperty() {
    }

    public AbstractTimeSeriesProperty(AbstractTimeSeries abstractTimeSeries) {
        super(abstractTimeSeries);
    }

    public AbstractTimeSeriesProperty(String href) {
        super(href);
    }

    public AbstractTimeSeries getAbstractTimeSeries() {
        return super.getObject();
    }

    public boolean isSetAbstractTimeSeries() {
        return super.isSetObject();
    }

    public void setAbstractTimeSeries(AbstractTimeSeries abstractTimeSeries) {
        super.setObject(abstractTimeSeries);
    }

    public void unsetAbstractTimeSeries() {
        super.unsetObject();
    }

    @Override
    public Class<AbstractTimeSeries> getAssociableClass() {
        return AbstractTimeSeries.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AbstractTimeSeriesProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AbstractTimeSeriesProperty copy = (target == null) ? new AbstractTimeSeriesProperty() : (AbstractTimeSeriesProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
