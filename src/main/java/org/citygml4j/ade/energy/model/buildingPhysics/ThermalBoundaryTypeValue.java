package org.citygml4j.ade.energy.model.buildingPhysics;

public enum ThermalBoundaryTypeValue {
    INTERIOR_WALL("interiorWall"),
    INTERMEDIARY_FLOOR("intermediaryFloor"),
    SHARED_WALL("sharedWall"),
    OUTER_WALL("outerWall"),
    GROUND_SLAB("groundSlab"),
    BASEMENT_CEILING("basementCeiling"),
    ATTIC_FLOOR("atticFloor"),
    ROOF("roof");

    private final String value;

    ThermalBoundaryTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static ThermalBoundaryTypeValue fromValue(String v) {
        for (ThermalBoundaryTypeValue c: ThermalBoundaryTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
