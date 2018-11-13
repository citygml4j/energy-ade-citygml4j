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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DailySchedulePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DailySchedulePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/1.0}DailySchedule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailySchedulePropertyType", propOrder = {
    "dailySchedule"
})
public class DailySchedulePropertyType {

    @XmlElement(name = "DailySchedule")
    protected DailyScheduleType dailySchedule;

    /**
     * Ruft den Wert der dailySchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DailyScheduleType }
     *     
     */
    public DailyScheduleType getDailySchedule() {
        return dailySchedule;
    }

    /**
     * Legt den Wert der dailySchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyScheduleType }
     *     
     */
    public void setDailySchedule(DailyScheduleType value) {
        this.dailySchedule = value;
    }

    public boolean isSetDailySchedule() {
        return (this.dailySchedule!= null);
    }

}
