//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Feb 13 16:55:57 CET 2019
//


package org.sig3d.citygml._2.energy._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WeatherDataTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="WeatherDataTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airTemperature"/&gt;
 *     &lt;enumeration value="humidity"/&gt;
 *     &lt;enumeration value="windSpeed"/&gt;
 *     &lt;enumeration value="cloudiness"/&gt;
 *     &lt;enumeration value="globalSolarIrradiance"/&gt;
 *     &lt;enumeration value="directSolarIrradiance"/&gt;
 *     &lt;enumeration value="diffuseSolarIrradiance"/&gt;
 *     &lt;enumeration value="terrestrialEmission"/&gt;
 *     &lt;enumeration value="downwardTerrestrialRadiation"/&gt;
 *     &lt;enumeration value="daylightIlluminance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeatherDataTypeValue")
@XmlEnum
public enum WeatherDataTypeValue {


    /**
     * Temperature of air
     * 
     */
    @XmlEnumValue("airTemperature")
    AIR_TEMPERATURE("airTemperature"),

    /**
     * Relative air humidity
     * 
     */
    @XmlEnumValue("humidity")
    HUMIDITY("humidity"),

    /**
     * Speed of wind
     * 
     */
    @XmlEnumValue("windSpeed")
    WIND_SPEED("windSpeed"),

    /**
     * Cloud amount in eights.
     * 
     */
    @XmlEnumValue("cloudiness")
    CLOUDINESS("cloudiness"),

    /**
     * Total solar irradiance (Energy per area) on a horizontal area.
     * 
     */
    @XmlEnumValue("globalSolarIrradiance")
    GLOBAL_SOLAR_IRRADIANCE("globalSolarIrradiance"),

    /**
     * Direct solar irradiance (energy per area) on a horizontal surface.
     * 
     */
    @XmlEnumValue("directSolarIrradiance")
    DIRECT_SOLAR_IRRADIANCE("directSolarIrradiance"),

    /**
     * Diffuse solar irradiance (energy per area) on a horizontal surface.
     * 
     */
    @XmlEnumValue("diffuseSolarIrradiance")
    DIFFUSE_SOLAR_IRRADIANCE("diffuseSolarIrradiance"),

    /**
     * Long wave emission of the earth*s surface (energy per area).
     * 
     */
    @XmlEnumValue("terrestrialEmission")
    TERRESTRIAL_EMISSION("terrestrialEmission"),

    /**
     * Downwards directed, long wave atmospheric re-emission.
     * 
     */
    @XmlEnumValue("downwardTerrestrialRadiation")
    DOWNWARD_TERRESTRIAL_RADIATION("downwardTerrestrialRadiation"),

    /**
     * Daylight illuminance
     * 
     */
    @XmlEnumValue("daylightIlluminance")
    DAYLIGHT_ILLUMINANCE("daylightIlluminance");
    private final String value;

    WeatherDataTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeatherDataTypeValue fromValue(String v) {
        for (WeatherDataTypeValue c: WeatherDataTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
