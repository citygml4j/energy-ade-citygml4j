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
 * <p>Java-Klasse für FloorAreaTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FloorAreaTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="netFloorArea"/&gt;
 *     &lt;enumeration value="grossFloorArea"/&gt;
 *     &lt;enumeration value="energyReferenceArea"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FloorAreaTypeValue")
@XmlEnum
public enum FloorAreaTypeValue {


    /**
     * Floor area without taking into account inner and outer walls
     * 
     */
    @XmlEnumValue("netFloorArea")
    NET_FLOOR_AREA("netFloorArea"),

    /**
     * Floor area including inner and outer walls
     * 
     */
    @XmlEnumValue("grossFloorArea")
    GROSS_FLOOR_AREA("grossFloorArea"),

    /**
     * Floor area determined by specific regulations.
     * 
     */
    @XmlEnumValue("energyReferenceArea")
    ENERGY_REFERENCE_AREA("energyReferenceArea");
    private final String value;

    FloorAreaTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FloorAreaTypeValue fromValue(String v) {
        for (FloorAreaTypeValue c: FloorAreaTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
