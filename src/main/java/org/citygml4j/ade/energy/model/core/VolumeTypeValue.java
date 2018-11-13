package org.citygml4j.ade.energy.model.core;

public enum VolumeTypeValue {
    NET_VOLUME("netVolume"),
    GROSS_VOLUME("grossVolume"),
    ENERGY_REFERENCE_VOLUME("energyReferenceVolume");

    private final String value;

    VolumeTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static VolumeTypeValue fromValue(String v) {
        for (VolumeTypeValue c: VolumeTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
