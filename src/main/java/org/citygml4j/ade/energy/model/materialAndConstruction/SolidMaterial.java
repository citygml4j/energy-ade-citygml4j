package org.citygml4j.ade.energy.model.materialAndConstruction;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.gml.basicTypes.Measure;

public class SolidMaterial extends AbstractMaterial {
    private Measure conductivity;
    private Measure density;
    private Measure permeance;
    private Measure specificHeat;

    public Measure getConductivity() {
        return conductivity;
    }

    public boolean isSetConductivity() {
        return conductivity != null;
    }

    public void setConductivity(Measure conductivity) {
        if (conductivity != null)
            conductivity.setParent(this);

        this.conductivity = conductivity;
    }

    public Measure getDensity() {
        return density;
    }

    public boolean isSetDensity() {
        return density != null;
    }

    public void setDensity(Measure density) {
        if (density != null)
            density.setParent(this);

        this.density = density;
    }

    public Measure getPermeance() {
        return permeance;
    }

    public boolean isSetPermeance() {
        return permeance != null;
    }

    public void setPermeance(Measure permeance) {
        if (permeance != null)
            permeance.setParent(this);

        this.permeance = permeance;
    }

    public Measure getSpecificHeat() {
        return specificHeat;
    }

    public boolean isSetSpecificHeat() {
        return specificHeat != null;
    }

    public void setSpecificHeat(Measure specificHeat) {
        if (specificHeat != null)
            specificHeat.setParent(this);

        this.specificHeat = specificHeat;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SolidMaterial(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SolidMaterial copy = (target == null) ? new SolidMaterial() : (SolidMaterial)target;
        super.copyTo(copy, copyBuilder);

        if (isSetConductivity())
            copy.setConductivity((Measure)copyBuilder.copy(conductivity));

        if (isSetDensity())
            copy.setDensity((Measure)copyBuilder.copy(density));

        if (isSetPermeance())
            copy.setPermeance((Measure)copyBuilder.copy(permeance));

        if (isSetSpecificHeat())
            copy.setSpecificHeat((Measure)copyBuilder.copy(specificHeat));

        return copy;
    }
}
