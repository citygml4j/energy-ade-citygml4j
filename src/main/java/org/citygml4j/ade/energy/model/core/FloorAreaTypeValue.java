/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Claus Nagel <claus.nagel@gmail.com>
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

public enum FloorAreaTypeValue {
    NET_FLOOR_AREA("netFloorArea"),
    GROSS_FLOOR_AREA("grossFloorArea"),
    ENERGY_REFERENCE_AREA("energyReferenceArea");

    private final String value;

    FloorAreaTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static FloorAreaTypeValue fromValue(String v) {
        for (FloorAreaTypeValue c : FloorAreaTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
