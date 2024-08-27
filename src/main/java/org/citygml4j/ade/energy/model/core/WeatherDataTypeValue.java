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

public enum WeatherDataTypeValue {
    AIR_TEMPERATURE("airTemperature"),
    HUMIDITY("humidity"),
    WIND_SPEED("windSpeed"),
    CLOUDINESS("cloudiness"),
    GLOBAL_SOLAR_IRRADIANCE("globalSolarIrradiance"),
    DIRECT_SOLAR_IRRADIANCE("directSolarIrradiance"),
    DIFFUSE_SOLAR_IRRADIANCE("diffuseSolarIrradiance"),
    TERRESTRIAL_EMISSION("terrestrialEmission"),
    DOWNWARD_TERRESTRIAL_RADIATION("downwardTerrestrialRadiation"),
    DAYLIGHT_ILLUMINANCE("daylightIlluminance");

    private final String value;

    WeatherDataTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static WeatherDataTypeValue fromValue(String v) {
        for (WeatherDataTypeValue c : WeatherDataTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
