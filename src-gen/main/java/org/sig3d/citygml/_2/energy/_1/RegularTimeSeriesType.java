//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Feb 13 16:55:57 CET 2019
//


package org.sig3d.citygml._2.energy._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureListType;
import net.opengis.gml.TimeIntervalLengthType;
import net.opengis.gml.TimePeriodPropertyType;


/**
 * Series of time-depending values, regularly spaced with a constant interval of time.
 * 
 * <p>Java-Klasse für RegularTimeSeriesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegularTimeSeriesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractTimeSeriesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temporalExtent" type="{http://www.opengis.net/gml}TimePeriodPropertyType"/&gt;
 *         &lt;element name="timeInterval" type="{http://www.opengis.net/gml}TimeIntervalLengthType"/&gt;
 *         &lt;element name="values" type="{http://www.opengis.net/gml}MeasureListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularTimeSeriesType", propOrder = {
    "temporalExtent",
    "timeInterval",
    "values"
})
public class RegularTimeSeriesType
    extends AbstractTimeSeriesType
{

    @XmlElement(required = true)
    protected TimePeriodPropertyType temporalExtent;
    @XmlElement(required = true)
    protected TimeIntervalLengthType timeInterval;
    @XmlElement(required = true)
    protected MeasureListType values;

    /**
     * Ruft den Wert der temporalExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getTemporalExtent() {
        return temporalExtent;
    }

    /**
     * Legt den Wert der temporalExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setTemporalExtent(TimePeriodPropertyType value) {
        this.temporalExtent = value;
    }

    public boolean isSetTemporalExtent() {
        return (this.temporalExtent!= null);
    }

    /**
     * Ruft den Wert der timeInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getTimeInterval() {
        return timeInterval;
    }

    /**
     * Legt den Wert der timeInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setTimeInterval(TimeIntervalLengthType value) {
        this.timeInterval = value;
    }

    public boolean isSetTimeInterval() {
        return (this.timeInterval!= null);
    }

    /**
     * Ruft den Wert der values-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureListType }
     *     
     */
    public MeasureListType getValues() {
        return values;
    }

    /**
     * Legt den Wert der values-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureListType }
     *     
     */
    public void setValues(MeasureListType value) {
        this.values = value;
    }

    public boolean isSetValues() {
        return (this.values!= null);
    }

}
