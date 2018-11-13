package org.citygml4j.ade.energy.model.supportingClasses;

public enum TimeIndeterminateValue {
    AFTER("after"),
    BEFORE("before"),
    NOW("now"),
    UNKNOWN("unknown");

    private final String value;

    TimeIndeterminateValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static TimeIndeterminateValue fromValue(String v) {
        for (TimeIndeterminateValue c: TimeIndeterminateValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
