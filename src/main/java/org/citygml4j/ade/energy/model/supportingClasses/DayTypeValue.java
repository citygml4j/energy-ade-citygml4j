package org.citygml4j.ade.energy.model.supportingClasses;

public enum DayTypeValue {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday"),
    DESIGN_DAY("designDay"),
    WEEK_DAY("weekDay"),
    WEEK_END("weekEnd"),
    TYPICAL_DAY("typicalDay");

    private final String value;

    DayTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static DayTypeValue fromValue(String v) {
        for (DayTypeValue c: DayTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
