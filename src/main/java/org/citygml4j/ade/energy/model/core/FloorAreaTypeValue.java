package org.citygml4j.ade.energy.model.core;

public enum FloorAreaTypeValue {
    NET_FLOOR_AREA("netFloorArea"),
    GROSS_FLOOR_AREA("grossFloorArea"),
    ENERGY_REFERENCE_AREA("energyReferenceArea");

    private final String value;

    FloorAreaTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static FloorAreaTypeValue fromValue(String v) {
        for (FloorAreaTypeValue c: FloorAreaTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
