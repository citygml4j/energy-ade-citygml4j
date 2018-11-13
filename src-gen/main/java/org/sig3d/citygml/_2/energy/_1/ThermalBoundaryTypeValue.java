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
 * <p>Java-Klasse für ThermalBoundaryTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ThermalBoundaryTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="interiorWall"/&gt;
 *     &lt;enumeration value="intermediaryFloor"/&gt;
 *     &lt;enumeration value="sharedWall"/&gt;
 *     &lt;enumeration value="outerWall"/&gt;
 *     &lt;enumeration value="groundSlab"/&gt;
 *     &lt;enumeration value="basementCeiling"/&gt;
 *     &lt;enumeration value="atticFloor"/&gt;
 *     &lt;enumeration value="roof"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThermalBoundaryTypeValue")
@XmlEnum
public enum ThermalBoundaryTypeValue {


    /**
     * Vertical partition separating two Thermal Zones of the same building.
     * 
     */
    @XmlEnumValue("interiorWall")
    INTERIOR_WALL("interiorWall"),

    /**
     * Horizontal partition separating two Thermal Zones of the same building.
     * 
     */
    @XmlEnumValue("intermediaryFloor")
    INTERMEDIARY_FLOOR("intermediaryFloor"),

    /**
     * Vertical partition separating two different buildings.
     * 
     */
    @XmlEnumValue("sharedWall")
    SHARED_WALL("sharedWall"),

    /**
     * Vertical ThermalBoundary with one side facing outdoor.
     * 
     */
    @XmlEnumValue("outerWall")
    OUTER_WALL("outerWall"),

    /**
     * Lower horizontal ThermalBoundary of the ThermalZone, built directly on the ground.
     * 
     */
    @XmlEnumValue("groundSlab")
    GROUND_SLAB("groundSlab"),

    /**
     * Horizontal partition separating the basement floor and the ground floor.
     * 
     */
    @XmlEnumValue("basementCeiling")
    BASEMENT_CEILING("basementCeiling"),

    /**
     * Horizontal partition separating the attic and the highest full storey.
     * 
     */
    @XmlEnumValue("atticFloor")
    ATTIC_FLOOR("atticFloor"),

    /**
     * ThermalBoundary corresponding to the CityGML RoofSurface.
     * 
     */
    @XmlEnumValue("roof")
    ROOF("roof");
    private final String value;

    ThermalBoundaryTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalBoundaryTypeValue fromValue(String v) {
        for (ThermalBoundaryTypeValue c: ThermalBoundaryTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
