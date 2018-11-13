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
 * <p>Java-Klasse für ConstructionWeightValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionWeightValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="veryLight"/&gt;
 *     &lt;enumeration value="light"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="heavy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConstructionWeightValue")
@XmlEnum
public enum ConstructionWeightValue {


    /**
     * Very light construction
     * 
     */
    @XmlEnumValue("veryLight")
    VERY_LIGHT("veryLight"),

    /**
     * Light construction
     * 
     */
    @XmlEnumValue("light")
    LIGHT("light"),

    /**
     * Medium construction
     * 
     */
    @XmlEnumValue("medium")
    MEDIUM("medium"),

    /**
     * Heavy construction
     * 
     */
    @XmlEnumValue("heavy")
    HEAVY("heavy");
    private final String value;

    ConstructionWeightValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionWeightValue fromValue(String v) {
        for (ConstructionWeightValue c: ConstructionWeightValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
