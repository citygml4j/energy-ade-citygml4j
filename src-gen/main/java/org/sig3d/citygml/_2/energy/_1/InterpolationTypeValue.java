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
 * <p>Java-Klasse für InterpolationTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InterpolationTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="averageInPrecedingInterval"/&gt;
 *     &lt;enumeration value="averageInSucceedingInterval"/&gt;
 *     &lt;enumeration value="constantInPrecedingInterval"/&gt;
 *     &lt;enumeration value="constantInSucceedingInterval"/&gt;
 *     &lt;enumeration value="continuous"/&gt;
 *     &lt;enumeration value="discontinuous"/&gt;
 *     &lt;enumeration value="instantaneousTotal"/&gt;
 *     &lt;enumeration value="maximumInPrecedingInterval"/&gt;
 *     &lt;enumeration value="maximumInSucceedingInterval"/&gt;
 *     &lt;enumeration value="minimumInPrecedingInterval"/&gt;
 *     &lt;enumeration value="minimumInSucceedingInterval"/&gt;
 *     &lt;enumeration value="precedingTotal"/&gt;
 *     &lt;enumeration value="succeedingTotal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterpolationTypeValue")
@XmlEnum
public enum InterpolationTypeValue {


    /**
     * Value represents the average value over the preceding interval.
     * 
     */
    @XmlEnumValue("averageInPrecedingInterval")
    AVERAGE_IN_PRECEDING_INTERVAL("averageInPrecedingInterval"),

    /**
     * Value represents the average value over the following interval.
     * 
     */
    @XmlEnumValue("averageInSucceedingInterval")
    AVERAGE_IN_SUCCEEDING_INTERVAL("averageInSucceedingInterval"),

    /**
     * Value is constant in the preceding interval.
     * 
     */
    @XmlEnumValue("constantInPrecedingInterval")
    CONSTANT_IN_PRECEDING_INTERVAL("constantInPrecedingInterval"),

    /**
     * Value is constant in the succeeding interval.
     * 
     */
    @XmlEnumValue("constantInSucceedingInterval")
    CONSTANT_IN_SUCCEEDING_INTERVAL("constantInSucceedingInterval"),

    /**
     * A continuous time series indicates the observation result is the value of a property at the indicated instant in time. The points are essentially connected and interpolation may occur between points in order to estimate the value of the property between points. The appropriate time spacing between successive points to minimise interpolation errors is related to rate of change (wrt time) of the property.
     * 
     */
    @XmlEnumValue("continuous")
    CONTINUOUS("continuous"),

    /**
     * The sampling of the property occurs such that it is not possible to regard the series as continuous. The time between samples is too large to classify the measurements as continuous.
     * 
     */
    @XmlEnumValue("discontinuous")
    DISCONTINUOUS("discontinuous"),

    /**
     * Value represents a total attributed to a specific time instant. This is normally generated from an event based measuring device such as a tipping bucket rain gauge.
     * 
     */
    @XmlEnumValue("instantaneousTotal")
    INSTANTANEOUS_TOTAL("instantaneousTotal"),

    /**
     * Value represents the maximum value that was measured during the preceding time interval.
     * 
     */
    @XmlEnumValue("maximumInPrecedingInterval")
    MAXIMUM_IN_PRECEDING_INTERVAL("maximumInPrecedingInterval"),

    /**
     * Value represents the maximum value for the following interval.
     * 
     */
    @XmlEnumValue("maximumInSucceedingInterval")
    MAXIMUM_IN_SUCCEEDING_INTERVAL("maximumInSucceedingInterval"),

    /**
     * Value represents the minimum value that was measured during the preceding time interval.
     * 
     */
    @XmlEnumValue("minimumInPrecedingInterval")
    MINIMUM_IN_PRECEDING_INTERVAL("minimumInPrecedingInterval"),

    /**
     * Value represents the minimum value for the following interval.
     * 
     */
    @XmlEnumValue("minimumInSucceedingInterval")
    MINIMUM_IN_SUCCEEDING_INTERVAL("minimumInSucceedingInterval"),

    /**
     * Value represents the total of measurements taken within the previous time interval.
     * 
     */
    @XmlEnumValue("precedingTotal")
    PRECEDING_TOTAL("precedingTotal"),

    /**
     * Value represents the average value over the following interval.
     * 
     */
    @XmlEnumValue("succeedingTotal")
    SUCCEEDING_TOTAL("succeedingTotal");
    private final String value;

    InterpolationTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterpolationTypeValue fromValue(String v) {
        for (InterpolationTypeValue c: InterpolationTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
