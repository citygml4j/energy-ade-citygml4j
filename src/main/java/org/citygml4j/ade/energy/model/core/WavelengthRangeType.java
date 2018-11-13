package org.citygml4j.ade.energy.model.core;

public enum WavelengthRangeType {
    SOLAR("solar"),
    INFRARED("infrared"),
    VISIBLE("visible"),
    TOTAL("total");

    private final String value;

    WavelengthRangeType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static WavelengthRangeType fromValue(String v) {
        for (WavelengthRangeType c: WavelengthRangeType.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
