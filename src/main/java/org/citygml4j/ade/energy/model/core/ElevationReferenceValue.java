package org.citygml4j.ade.energy.model.core;

public enum ElevationReferenceValue {
    BOTTOM_OF_CONSTRUCTION("bottomOfConstruction"),
    ENTRANCE_POINT("entrancePoint"),
    GENERAL_EAVE("generalEave"),
    GENERAL_ROOF("generalRoof"),
    GENERAL_ROOF_EDGE("generalRoofEdge"),
    HIGHEST_EAVE("highestEave"),
    HIGHEST_POINT("highestPoint"),
    HIGHEST_ROOF_EDGE("highestRoofEdge"),
    LOWEST_EAVE("lowestEave"),
    LOWEST_FLOOR_ABOVE_GROUND("lowestFloorAboveGround"),
    LOWEST_ROOF_EDGE("lowestRoofEdge"),
    TOP_OF_CONSTRUCTION("topOfConstruction"),
    TOP_THERMAL_BOUNDARY("topThermalBoundary"),
    BOTTOM_THERMAL_BOUNDARY("bottomThermalBoundary");

    private final String value;

    ElevationReferenceValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static ElevationReferenceValue fromValue(String v) {
        for (ElevationReferenceValue c: ElevationReferenceValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
