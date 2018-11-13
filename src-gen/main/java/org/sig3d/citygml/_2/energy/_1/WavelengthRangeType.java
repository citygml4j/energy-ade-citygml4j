//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.8.1
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Nov 14 00:43:05 CET 2018
//


package org.sig3d.citygml._2.energy._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WavelengthRangeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="WavelengthRangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="solar"/&gt;
 *     &lt;enumeration value="infrared"/&gt;
 *     &lt;enumeration value="visible"/&gt;
 *     &lt;enumeration value="total"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WavelengthRangeType")
@XmlEnum
public enum WavelengthRangeType {


    /**
     * Solar radiation spectrum (Wavelength range: mainly 300 nm – 2500 nm), also called short-wave radiation.
     * 
     */
    @XmlEnumValue("solar")
    SOLAR("solar"),

    /**
     * Infrared spectrum (Wavelength range: 700 nm – 1000 mm), also called long-wave radiation. Range of thermal radiation exchanges close to ambient temperature.
     * 
     */
    @XmlEnumValue("infrared")
    INFRARED("infrared"),

    /**
     * Visible light spectrum (Wavelength range: 400 nm – 800 nm).
     * 
     */
    @XmlEnumValue("visible")
    VISIBLE("visible"),

    /**
     * Total electromagnetic spectrum.
     * 
     */
    @XmlEnumValue("total")
    TOTAL("total");
    private final String value;

    WavelengthRangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WavelengthRangeType fromValue(String v) {
        for (WavelengthRangeType c: WavelengthRangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
