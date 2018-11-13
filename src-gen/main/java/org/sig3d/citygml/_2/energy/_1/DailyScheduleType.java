//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.8.1
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Nov 14 00:43:05 CET 2018
//


package org.sig3d.citygml._2.energy._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Schedule over a one day period (from 0:00 to 24:00).
 * 
 * <p>Java-Klasse für DailyScheduleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DailyScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dayType" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}DayTypeValue"/&gt;
 *         &lt;element name="schedule" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractTimeSeriesPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyScheduleType", propOrder = {
    "dayType",
    "schedule"
})
public class DailyScheduleType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DayTypeValue dayType;
    @XmlElement(required = true)
    protected AbstractTimeSeriesPropertyType schedule;

    /**
     * Ruft den Wert der dayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypeValue }
     *     
     */
    public DayTypeValue getDayType() {
        return dayType;
    }

    /**
     * Legt den Wert der dayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypeValue }
     *     
     */
    public void setDayType(DayTypeValue value) {
        this.dayType = value;
    }

    public boolean isSetDayType() {
        return (this.dayType!= null);
    }

    /**
     * Ruft den Wert der schedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public AbstractTimeSeriesPropertyType getSchedule() {
        return schedule;
    }

    /**
     * Legt den Wert der schedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public void setSchedule(AbstractTimeSeriesPropertyType value) {
        this.schedule = value;
    }

    public boolean isSetSchedule() {
        return (this.schedule!= null);
    }

}
