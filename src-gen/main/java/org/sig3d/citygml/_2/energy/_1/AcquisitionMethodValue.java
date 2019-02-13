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
 * <p>Java-Klasse für AcquisitionMethodValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AcquisitionMethodValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="measurement"/&gt;
 *     &lt;enumeration value="simulation"/&gt;
 *     &lt;enumeration value="calibratedSimulation"/&gt;
 *     &lt;enumeration value="estimation"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcquisitionMethodValue")
@XmlEnum
public enum AcquisitionMethodValue {


    /**
     * Measured data
     * 
     */
    @XmlEnumValue("measurement")
    MEASUREMENT("measurement"),

    /**
     * Simulated data
     * 
     */
    @XmlEnumValue("simulation")
    SIMULATION("simulation"),

    /**
     * Data of a calibrated simulation
     * 
     */
    @XmlEnumValue("calibratedSimulation")
    CALIBRATED_SIMULATION("calibratedSimulation"),

    /**
     * Estimated data
     * 
     */
    @XmlEnumValue("estimation")
    ESTIMATION("estimation"),

    /**
     * Unknown acquisition method
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AcquisitionMethodValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcquisitionMethodValue fromValue(String v) {
        for (AcquisitionMethodValue c: AcquisitionMethodValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
