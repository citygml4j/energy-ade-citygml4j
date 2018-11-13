package org.citygml4j.ade.energy.model.supportingClasses;

public enum AcquisitionMethodValue {
    MEASUREMENT("measurement"),
    SIMULATION("simulation"),
    CALIBRATED_SIMULATION("calibratedSimulation"),
    ESTIMATION("estimation"),
    UNKNOWN("unknown");

    private final String value;

    AcquisitionMethodValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static AcquisitionMethodValue fromValue(String v) {
        for (AcquisitionMethodValue c: AcquisitionMethodValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
