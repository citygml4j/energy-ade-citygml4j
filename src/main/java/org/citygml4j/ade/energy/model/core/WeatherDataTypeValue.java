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
        for (WeatherDataTypeValue c: WeatherDataTypeValue.values()) {
            if (c.value.equals(v))
                return c;
        }

        return null;
    }
}
