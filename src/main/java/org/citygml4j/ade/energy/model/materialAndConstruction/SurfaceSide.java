package org.citygml4j.ade.energy.model.materialAndConstruction;

public enum SurfaceSide {
    INSIDE("inside"),
    OUTSIDE("outside");

    private final String value;

    SurfaceSide(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static SurfaceSide fromValue(String v) {
        for (SurfaceSide c: SurfaceSide.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
