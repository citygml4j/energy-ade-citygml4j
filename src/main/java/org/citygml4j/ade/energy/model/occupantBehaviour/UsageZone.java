package org.citygml4j.ade.energy.model.occupantBehaviour;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.ade.energy.model.core.AbstractUsageZone;
import org.citygml4j.ade.energy.model.core.FloorAreaProperty;
import org.citygml4j.ade.energy.model.supportingClasses.AbstractScheduleProperty;

import java.util.List;

public class UsageZone extends AbstractUsageZone {
    private AbstractScheduleProperty coolingSchedule;
    private List<FloorAreaProperty> floorArea;
    private AbstractScheduleProperty heatingSchedule;
    private Code usageZoneType;
    private AbstractScheduleProperty ventilationSchedule;
    private List<OccupantsProperty> occupiedBy;
    private List<FacilitiesProperty> equippedWith;

    public AbstractScheduleProperty getCoolingSchedule() {
        return coolingSchedule;
    }

    public boolean isSetCoolingSchedule() {
        return coolingSchedule != null;
    }

    public void setCoolingSchedule(AbstractScheduleProperty coolingSchedule) {
        if (coolingSchedule != null)
            coolingSchedule.setParent(this);

        this.coolingSchedule = coolingSchedule;
    }

    public void addFloorArea(FloorAreaProperty floorArea) {
        if (this.floorArea == null)
            this.floorArea = new ChildList<>(this);

        this.floorArea.add(floorArea);
    }

    public List<FloorAreaProperty> getFloorArea() {
        if (floorArea == null)
            floorArea = new ChildList<>(this);

        return floorArea;
    }

    public boolean isSetFloorArea() {
        return floorArea != null && !floorArea.isEmpty();
    }

    public void setFloorArea(List<FloorAreaProperty> floorArea) {
        this.floorArea = new ChildList<>(this, floorArea);
    }

    public AbstractScheduleProperty getHeatingSchedule() {
        return heatingSchedule;
    }

    public boolean isSetHeatingSchedule() {
        return heatingSchedule != null;
    }

    public void setHeatingSchedule(AbstractScheduleProperty heatingSchedule) {
        if (heatingSchedule != null)
            heatingSchedule.setParent(this);

        this.heatingSchedule = heatingSchedule;
    }

    public Code getUsageZoneType() {
        return usageZoneType;
    }

    public boolean isSetUsageZoneType() {
        return usageZoneType != null;
    }

    public void setUsageZoneType(Code usageZoneType) {
        if (usageZoneType != null)
            usageZoneType.setParent(this);

        this.usageZoneType = usageZoneType;
    }

    public AbstractScheduleProperty getVentilationSchedule() {
        return ventilationSchedule;
    }

    public boolean isSetVentilationSchedule() {
        return ventilationSchedule != null;
    }

    public void setVentilationSchedule(AbstractScheduleProperty ventilationSchedule) {
        if (usageZoneType != null)
            usageZoneType.setParent(this);

        this.ventilationSchedule = ventilationSchedule;
    }

    public void addOccupiedBy(OccupantsProperty occupiedBy) {
        if (this.occupiedBy == null)
            this.occupiedBy = new ChildList<>(this);

        this.occupiedBy.add(occupiedBy);
    }

    public List<OccupantsProperty> getOccupiedBy() {
        if (occupiedBy == null)
            occupiedBy = new ChildList<>(this);

        return occupiedBy;
    }

    public boolean isSetOccupiedBy() {
        return occupiedBy != null && !occupiedBy.isEmpty();
    }

    public void setOccupiedBy(List<OccupantsProperty> occupiedBy) {
        this.occupiedBy = new ChildList<>(this, occupiedBy);
    }

    public void addEquippedWith(FacilitiesProperty equippedWith) {
        if (this.equippedWith == null)
            this.equippedWith = new ChildList<>(this);

        this.equippedWith.add(equippedWith);
    }

    public List<FacilitiesProperty> getEquippedWith() {
        if (equippedWith == null)
            equippedWith = new ChildList<>(this);

        return equippedWith;
    }

    public boolean isSetEquippedWith() {
        return equippedWith != null && !equippedWith.isEmpty();
    }

    public void setEquippedWith(List<FacilitiesProperty> equippedWith) {
        this.equippedWith = new ChildList<>(this, equippedWith);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UsageZone(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        UsageZone copy = (target == null) ? new UsageZone() : (UsageZone)target;
        super.copyTo(target, copyBuilder);

        if (isSetCoolingSchedule())
            copy.setCoolingSchedule((AbstractScheduleProperty)copyBuilder.copy(coolingSchedule));

        if (isSetFloorArea()) {
            for (FloorAreaProperty part : floorArea) {
                FloorAreaProperty copyPart = (FloorAreaProperty)copyBuilder.copy(part);
                copy.addFloorArea(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        if (isSetHeatingSchedule())
            copy.setHeatingSchedule((AbstractScheduleProperty)copyBuilder.copy(heatingSchedule));

        if (isSetUsageZoneType())
            copy.setUsageZoneType((Code)copyBuilder.copy(usageZoneType));

        if (isSetVentilationSchedule())
            copy.setVentilationSchedule((AbstractScheduleProperty)copyBuilder.copy(ventilationSchedule));

        if (isSetOccupiedBy()) {
            for (OccupantsProperty part : occupiedBy) {
                OccupantsProperty copyPart = (OccupantsProperty)copyBuilder.copy(part);
                copy.addOccupiedBy(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        if (isSetEquippedWith()) {
            for (FacilitiesProperty part : equippedWith) {
                FacilitiesProperty copyPart = (FacilitiesProperty)copyBuilder.copy(part);
                copy.addEquippedWith(copyPart);

                if (part != null && copyPart == part)
                    part.setParent(this);
            }
        }

        return copy;
    }
}
