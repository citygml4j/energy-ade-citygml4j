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
 * <p>Java-Klasse für SurfaceSide.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SurfaceSide"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="inside"/&gt;
 *     &lt;enumeration value="outside"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurfaceSide")
@XmlEnum
public enum SurfaceSide {


    /**
     * Indoor surface.
     * 
     */
    @XmlEnumValue("inside")
    INSIDE("inside"),

    /**
     * Outdoor surface.
     * 
     */
    @XmlEnumValue("outside")
    OUTSIDE("outside");
    private final String value;

    SurfaceSide(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurfaceSide fromValue(String v) {
        for (SurfaceSide c: SurfaceSide.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
