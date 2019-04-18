/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2013-2019 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
