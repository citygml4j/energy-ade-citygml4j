/*
 * energy-ade-citygml4j - Energy ADE module for citygml4j
 * https://github.com/citygml4j/energy-ade-citygml4j
 *
 * energy-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2021 Claus Nagel <claus.nagel@gmail.com>
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
