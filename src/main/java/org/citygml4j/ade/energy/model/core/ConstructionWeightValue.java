package org.citygml4j.ade.energy.model.core;

public enum ConstructionWeightValue {
    VERY_LIGHT("veryLight"),
    LIGHT("light"),
    MEDIUM("medium"),
    HEAVY("heavy");

    private final String value;

    ConstructionWeightValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static ConstructionWeightValue fromValue(String v) {
        for (ConstructionWeightValue c: ConstructionWeightValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
