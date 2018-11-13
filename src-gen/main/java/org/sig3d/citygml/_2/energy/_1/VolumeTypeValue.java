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
 * <p>Java-Klasse für VolumeTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VolumeTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="netVolume"/&gt;
 *     &lt;enumeration value="grossVolume"/&gt;
 *     &lt;enumeration value="energyReferenceVolume"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VolumeTypeValue")
@XmlEnum
public enum VolumeTypeValue {


    /**
     * Volume without taking into account inner and outer walls.
     * 
     */
    @XmlEnumValue("netVolume")
    NET_VOLUME("netVolume"),

    /**
     * Volume including inner and outer walls.
     * 
     */
    @XmlEnumValue("grossVolume")
    GROSS_VOLUME("grossVolume"),

    /**
     * Volume determined by specific regulations.
     * 
     */
    @XmlEnumValue("energyReferenceVolume")
    ENERGY_REFERENCE_VOLUME("energyReferenceVolume");
    private final String value;

    VolumeTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumeTypeValue fromValue(String v) {
        for (VolumeTypeValue c: VolumeTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
