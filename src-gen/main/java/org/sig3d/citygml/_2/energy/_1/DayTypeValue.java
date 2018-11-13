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
 * <p>Java-Klasse für DayTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DayTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="monday"/&gt;
 *     &lt;enumeration value="tuesday"/&gt;
 *     &lt;enumeration value="wednesday"/&gt;
 *     &lt;enumeration value="thursday"/&gt;
 *     &lt;enumeration value="friday"/&gt;
 *     &lt;enumeration value="saturday"/&gt;
 *     &lt;enumeration value="sunday"/&gt;
 *     &lt;enumeration value="designDay"/&gt;
 *     &lt;enumeration value="weekDay"/&gt;
 *     &lt;enumeration value="weekEnd"/&gt;
 *     &lt;enumeration value="typicalDay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayTypeValue")
@XmlEnum
public enum DayTypeValue {


    /**
     * Monday is the day of the week between Sunday and Tuesday. According to the international standard ISO 8601 it is the first day of the week.
     * 
     */
    @XmlEnumValue("monday")
    MONDAY("monday"),

    /**
     * Tuesday is a day of the week occurring after Monday and before Wednesday. According to international standard ISO 8601, it is the second day of the week.
     * 
     */
    @XmlEnumValue("tuesday")
    TUESDAY("tuesday"),

    /**
     * Wednesday is the day of the week following Tuesday and preceding Thursday. According to international standard ISO 8601 it is the third day of the week.
     * 
     */
    @XmlEnumValue("wednesday")
    WEDNESDAY("wednesday"),

    /**
     * Thursday is the day of the week following Wednesday and before Friday. According to the ISO 8601 international standard, it is the fourth day of the week.
     * 
     */
    @XmlEnumValue("thursday")
    THURSDAY("thursday"),

    /**
     * Friday is the day after Thursday and the day before Saturday. As recommended by the international standard ISO 8601, it is the fifth day of the week.
     * 
     */
    @XmlEnumValue("friday")
    FRIDAY("friday"),

    /**
     * Saturday is the day of the week following Friday and preceding Sunday. 
     * 
     */
    @XmlEnumValue("saturday")
    SATURDAY("saturday"),

    /**
     * Sunday is the day of the week after Saturday but before Monday. Sunday is a day of rest in most Western countries, as a part of the weekend.
     * 
     */
    @XmlEnumValue("sunday")
    SUNDAY("sunday"),

    /**
     * "Extrem summer" day used for the sizing and design of HVAC Systems in summer condition.
     * 
     */
    @XmlEnumValue("designDay")
    DESIGN_DAY("designDay"),

    /**
     * Monday to Friday.
     * 
     */
    @XmlEnumValue("weekDay")
    WEEK_DAY("weekDay"),

    /**
     * Saturday and Sunday.
     * 
     */
    @XmlEnumValue("weekEnd")
    WEEK_END("weekEnd"),

    /**
     * Typical day defined by specific regulations.
     * 
     */
    @XmlEnumValue("typicalDay")
    TYPICAL_DAY("typicalDay");
    private final String value;

    DayTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayTypeValue fromValue(String v) {
        for (DayTypeValue c: DayTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
