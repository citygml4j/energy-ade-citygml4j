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
 * <p>Java-Klasse für EndUseTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EndUseTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cooking"/&gt;
 *     &lt;enumeration value="domesticHotWater"/&gt;
 *     &lt;enumeration value="electricalAppliances"/&gt;
 *     &lt;enumeration value="lighting"/&gt;
 *     &lt;enumeration value="otherOrCombination"/&gt;
 *     &lt;enumeration value="spaceCooling"/&gt;
 *     &lt;enumeration value="spaceHeating"/&gt;
 *     &lt;enumeration value="ventilation"/&gt;
 *     &lt;enumeration value="process"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EndUseTypeValue")
@XmlEnum
public enum EndUseTypeValue {


    /**
     * The practice or skill of preparing food by combining, mixing, and heating ingredients.
     * 
     */
    @XmlEnumValue("cooking")
    COOKING("cooking"),

    /**
     * Water used, in any type of building, for domestic purposes, principally drinking, food preparation, sanitation and personal hygiene (but not including space heating, swimming pool heating, or use for processes such as commercial food preparation or clothes washing).
     * 
     */
    @XmlEnumValue("domesticHotWater")
    DOMESTIC_HOT_WATER("domesticHotWater"),

    /**
     * An electrical appliance is a device that uses electricity to perform a function.
     * 
     */
    @XmlEnumValue("electricalAppliances")
    ELECTRICAL_APPLIANCES("electricalAppliances"),

    /**
     * Lighting includes the use of both artificial light sources like lamps and light fixtures, as well as natural illumination by capturing daylight.
     * 
     */
    @XmlEnumValue("lighting")
    LIGHTING("lighting"),

    /**
     * Other category of end use or a combination of the given end use related to a building energy use.
     * 
     */
    @XmlEnumValue("otherOrCombination")
    OTHER_OR_COMBINATION("otherOrCombination"),

    /**
     * Processes of cooling down the space.
     * 
     */
    @XmlEnumValue("spaceCooling")
    SPACE_COOLING("spaceCooling"),

    /**
     * Processes of heating up the space.
     * 
     */
    @XmlEnumValue("spaceHeating")
    SPACE_HEATING("spaceHeating"),

    /**
     * The provision of fresh air to a room, building, etc.
     * 
     */
    @XmlEnumValue("ventilation")
    VENTILATION("ventilation"),

    /**
     * A series of actions or steps taken in order to achieve a particular end.
     * 
     */
    @XmlEnumValue("process")
    PROCESS("process");
    private final String value;

    EndUseTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndUseTypeValue fromValue(String v) {
        for (EndUseTypeValue c: EndUseTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
