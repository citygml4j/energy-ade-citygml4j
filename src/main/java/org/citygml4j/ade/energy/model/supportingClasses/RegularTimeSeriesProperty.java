package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class RegularTimeSeriesProperty extends AssociationByRep<RegularTimeSeries> implements ADEModelObject {

    public RegularTimeSeriesProperty() {
    }

    public RegularTimeSeriesProperty(RegularTimeSeries regularTimeSeries) {
        super(regularTimeSeries);
    }

    public RegularTimeSeries getRegularTimeSeries() {
        return super.getObject();
    }

    public boolean isSetRegularTimeSeries() {
        return super.isSetObject();
    }

    public void setRegularTimeSeries(RegularTimeSeries regularTimeSeries) {
        super.setObject(regularTimeSeries);
    }

    public void unsetRegularTimeSeries() {
        super.unsetObject();
    }

    @Override
    public Class<RegularTimeSeries> getAssociableClass() {
        return RegularTimeSeries.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RegularTimeSeriesProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RegularTimeSeriesProperty copy = (target == null) ? new RegularTimeSeriesProperty() : (RegularTimeSeriesProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
