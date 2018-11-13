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
 * <p>Java-Klasse für ElevationReferenceValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ElevationReferenceValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bottomOfConstruction"/&gt;
 *     &lt;enumeration value="entrancePoint"/&gt;
 *     &lt;enumeration value="generalEave"/&gt;
 *     &lt;enumeration value="generalRoof"/&gt;
 *     &lt;enumeration value="generalRoofEdge"/&gt;
 *     &lt;enumeration value="highestEave"/&gt;
 *     &lt;enumeration value="highestPoint"/&gt;
 *     &lt;enumeration value="highestRoofEdge"/&gt;
 *     &lt;enumeration value="lowestEave"/&gt;
 *     &lt;enumeration value="lowestFloorAboveGround"/&gt;
 *     &lt;enumeration value="lowestRoofEdge"/&gt;
 *     &lt;enumeration value="topOfConstruction"/&gt;
 *     &lt;enumeration value="topThermalBoundary"/&gt;
 *     &lt;enumeration value="bottomThermalBoundary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElevationReferenceValue")
@XmlEnum
public enum ElevationReferenceValue {


    /**
     * The elevation has been captured at the bottom of the usable part of the construction.
     * 
     * NOTE: The bottom of usable part of a building is generally its lowest underground floor.
     * 
     */
    @XmlEnumValue("bottomOfConstruction")
    BOTTOM_OF_CONSTRUCTION("bottomOfConstruction"),

    /**
     * The elevation has been captured at the entrance of the construction, generally the bottom of entrance door.
     * 
     */
    @XmlEnumValue("entrancePoint")
    ENTRANCE_POINT("entrancePoint"),

    /**
     * The elevation has been captured at eave level, anywhere between the lowest and the highest eave levels of the construction.
     * 
     * NOTE: in case of a roof having a symmetry axis, values generalEave, lowestEave and highestEave are equivalent.
     * 
     */
    @XmlEnumValue("generalEave")
    GENERAL_EAVE("generalEave"),

    /**
     * The elevation has been captured at roof level, anywhere between the lowest edge roof level and the top of the construction.
     * 
     */
    @XmlEnumValue("generalRoof")
    GENERAL_ROOF("generalRoof"),

    /**
     * The elevation has been captured at roof edge level, anywhere between the lowest and the highest roof edges of the construction.
     * 
     * NOTE: in case of a roof having a symmetry axis, values generalRoofEdge, lowestRoofEdge and highestRoofEdge are equivalent.
     * 
     */
    @XmlEnumValue("generalRoofEdge")
    GENERAL_ROOF_EDGE("generalRoofEdge"),

    /**
     * The elevation has been captured at the highest eave level of the construction.
     * 
     */
    @XmlEnumValue("highestEave")
    HIGHEST_EAVE("highestEave"),

    /**
     * The elevation has been captured at the highest point of the construction, including the installations, such as chimneys and antennas.
     * 
     */
    @XmlEnumValue("highestPoint")
    HIGHEST_POINT("highestPoint"),

    /**
     * The elevation has been captured at the highest roof edge level of the construction.
     * 
     */
    @XmlEnumValue("highestRoofEdge")
    HIGHEST_ROOF_EDGE("highestRoofEdge"),

    /**
     * The elevation has been captured at the lowest eave level of the construction.
     * 
     */
    @XmlEnumValue("lowestEave")
    LOWEST_EAVE("lowestEave"),

    /**
     * The elevation has been captured at the level of the lowest floor above ground.
     * 
     * This value is of interest for over-hanging buildings or for buildings on pylons.
     * 
     */
    @XmlEnumValue("lowestFloorAboveGround")
    LOWEST_FLOOR_ABOVE_GROUND("lowestFloorAboveGround"),

    /**
     * The elevation has been captured at the lowest roof edge level of the construction.
     * 
     */
    @XmlEnumValue("lowestRoofEdge")
    LOWEST_ROOF_EDGE("lowestRoofEdge"),

    /**
     * The elevation has been captured at the top level of the construction.
     * 
     * NOTE: for buildings, it is generally top of the roof.
     * 
     */
    @XmlEnumValue("topOfConstruction")
    TOP_OF_CONSTRUCTION("topOfConstruction"),

    /**
     * The elevation has been captured at the top of the highest Thermal Boundary.
     * 
     */
    @XmlEnumValue("topThermalBoundary")
    TOP_THERMAL_BOUNDARY("topThermalBoundary"),

    /**
     * The elevation has been captured at the bottom of the lowest Thermal Boundary.
     * 
     */
    @XmlEnumValue("bottomThermalBoundary")
    BOTTOM_THERMAL_BOUNDARY("bottomThermalBoundary");
    private final String value;

    ElevationReferenceValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElevationReferenceValue fromValue(String v) {
        for (ElevationReferenceValue c: ElevationReferenceValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
