package org.citygml4j.ade.energy.model.core;

public enum EndUseTypeValue {
    COOKING("cooking"),
    DOMESTIC_HOT_WATER("domesticHotWater"),
    ELECTRICAL_APPLIANCES("electricalAppliances"),
    LIGHTING("lighting"),
    OTHER_OR_COMBINATION("otherOrCombination"),
    SPACE_COOLING("spaceCooling"),
    SPACE_HEATING("spaceHeating"),
    VENTILATION("ventilation"),
    PROCESS("process");

    private final String value;

    EndUseTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static EndUseTypeValue fromValue(String v) {
        for (EndUseTypeValue c: EndUseTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
