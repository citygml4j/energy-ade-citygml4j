//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Feb 13 16:55:57 CET 2019
//


package org.sig3d.citygml._2.energy._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.TimePeriodPropertyType;


/**
 * Specification of a time period  (e.g. 1. January -30. June) within a  year.
 * 
 * <p>Java-Klasse für PeriodOfYearType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PeriodOfYearType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="period" type="{http://www.opengis.net/gml}TimePeriodPropertyType"/&gt;
 *         &lt;element name="dailySchedule" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}DailySchedulePropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodOfYearType", propOrder = {
    "period",
    "dailySchedule"
})
public class PeriodOfYearType {

    @XmlElement(required = true)
    protected TimePeriodPropertyType period;
    @XmlElement(required = true)
    protected List<DailySchedulePropertyType> dailySchedule;

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setPeriod(TimePeriodPropertyType value) {
        this.period = value;
    }

    public boolean isSetPeriod() {
        return (this.period!= null);
    }

    /**
     * Gets the value of the dailySchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailySchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailySchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DailySchedulePropertyType }
     * 
     * 
     */
    public List<DailySchedulePropertyType> getDailySchedule() {
        if (dailySchedule == null) {
            dailySchedule = new ArrayList<DailySchedulePropertyType>();
        }
        return this.dailySchedule;
    }

    public boolean isSetDailySchedule() {
        return ((this.dailySchedule!= null)&&(!this.dailySchedule.isEmpty()));
    }

    public void unsetDailySchedule() {
        this.dailySchedule = null;
    }

}
