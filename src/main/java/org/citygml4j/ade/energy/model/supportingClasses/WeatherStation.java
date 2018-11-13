package org.citygml4j.ade.energy.model.supportingClasses;

import org.citygml4j.ade.energy.model.core.WeatherDataProperty;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.primitives.PointProperty;
import org.citygml4j.util.bbox.BoundingBoxOptions;

import java.util.List;

public class WeatherStation extends AbstractCityObject implements ADEModelObject {
    private String stationName;
    private PointProperty position;
    private List<WeatherDataProperty> parameter;

    public String getStationName() {
        return stationName;
    }

    public boolean isSetStationName() {
        return stationName != null;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public PointProperty getPosition() {
        return position;
    }

    public boolean isSetPosition() {
        return position != null;
    }

    public void setPosition(PointProperty position) {
        if (position != null)
            position.setParent(this);

        this.position = position;
    }

    public void addParameter(WeatherDataProperty parameter) {
        if (this.parameter == null)
            this.parameter = new ChildList<>(this);

        this.parameter.add(parameter);
    }

    public List<WeatherDataProperty> getParameter() {
        if (parameter == null)
            parameter = new ChildList<>(this);

        return parameter;
    }

    public boolean isSetParameter() {
        return parameter != null && !parameter.isEmpty();
    }

    public void setParameter(List<WeatherDataProperty> parameter) {
        this.parameter = new ChildList<>(this, parameter);
    }

    @Override
    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        BoundingShape boundedBy = super.calcBoundedBy(options);
        if (options.isUseExistingEnvelopes() && !boundedBy.isEmpty())
            return boundedBy;

        if (position != null && position.isSetPoint())
            boundedBy.updateEnvelope(position.getPoint().calcBoundingBox());

        if (options.isAssignResultToFeatures())
            setBoundedBy(boundedBy);

        return boundedBy;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WeatherStation(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        WeatherStation copy = (target == null) ? new WeatherStation() : (WeatherStation)target;

        if (isSetStationName())
            copy.setStationName(copyBuilder.copy(stationName));

        if (isSetPosition())
            copy.setPosition((PointProperty)copyBuilder.copy(position));

        if (isSetParameter()) {
            for (WeatherDataProperty part : parameter) {
                WeatherDataProperty copyPart = (WeatherDataProperty)copyBuilder.copy(part);
                copy.addParameter(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        return super.copyTo(copy, copyBuilder);
    }

    @Override
    public void accept(FeatureVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(FeatureFunctor<T> visitor) {
        return visitor.apply(this);
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
