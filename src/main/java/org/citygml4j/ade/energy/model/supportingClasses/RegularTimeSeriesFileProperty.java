package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class RegularTimeSeriesFileProperty extends AssociationByRep<RegularTimeSeriesFile> implements ADEModelObject {

    public RegularTimeSeriesFileProperty() {
    }

    public RegularTimeSeriesFileProperty(RegularTimeSeriesFile regularTimeSeriesFile) {
        super(regularTimeSeriesFile);
    }

    public RegularTimeSeriesFile getRegularTimeSeriesFile() {
        return super.getObject();
    }

    public boolean isSetRegularTimeSeriesFile() {
        return super.isSetObject();
    }

    public void setRegularTimeSeriesFile(RegularTimeSeriesFile regularTimeSeriesFile) {
        super.setObject(regularTimeSeriesFile);
    }

    public void unsetRegularTimeSeriesFile() {
        super.unsetObject();
    }

    @Override
    public Class<RegularTimeSeriesFile> getAssociableClass() {
        return RegularTimeSeriesFile.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RegularTimeSeriesFileProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RegularTimeSeriesFileProperty copy = (target == null) ? new RegularTimeSeriesFileProperty() : (RegularTimeSeriesFileProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
