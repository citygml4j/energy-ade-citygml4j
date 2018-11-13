package org.citygml4j.ade.energy.model.supportingClasses;

public enum InterpolationTypeValue {
    MAVERAGE_IN_PRECEDING_INTERVAL("averageInPrecedingInterval"),
    AVERAGE_IN_SUCCEEDING_INTERVAL("averageInSucceedingInterval"),
    CONSTANT_IN_PRECEDING_INTERVAL("constantInPrecedingInterval"),
    CONSTANT_IN_SUCCEEDING_INTERVAL("constantInSucceedingInterval"),
    CONTINUOUS("continuous"),
    DISCONTINUOUS("discontinuous"),
    INSTANTANEOUS_TOTAL("instantaneousTotal"),
    MAXIMUM_IN_PRECEDING_INTERVAL("maximumInPrecedingInterval"),
    MAXIMUM_IN_SUCCEEDING_INTERVAL("maximumInSucceedingInterval"),
    MINIMUM_IN_PRECEDING_INTERVAL("minimumInPrecedingInterval"),
    MINIMUM_IN_SUCCEEDING_INTERVAL("minimumInSucceedingInterval"),
    PRECEDING_TOTAL("precedingTotal"),
    SUCCEEDING_TOTAL("succeedingTotal");

    private final String value;

    InterpolationTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static InterpolationTypeValue fromValue(String v) {
        for (InterpolationTypeValue c: InterpolationTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
