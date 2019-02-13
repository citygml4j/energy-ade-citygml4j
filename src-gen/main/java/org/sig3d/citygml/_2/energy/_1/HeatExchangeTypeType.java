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
import net.opengis.gml.MeasureType;
import net.opengis.gml.ScaleType;


/**
 * Contributions of the different types of heat or cool exchange (convective, radiant and latent)
 * 
 * <p>Java-Klasse für HeatExchangeTypeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeatExchangeTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="convectiveFraction" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="latentFraction" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="radiantFraction" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="totalValue" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatExchangeTypeType", propOrder = {
    "convectiveFraction",
    "latentFraction",
    "radiantFraction",
    "totalValue"
})
public class HeatExchangeTypeType {

    protected ScaleType convectiveFraction;
    protected ScaleType latentFraction;
    protected ScaleType radiantFraction;
    @XmlElement(required = true)
    protected MeasureType totalValue;

    /**
     * Ruft den Wert der convectiveFraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getConvectiveFraction() {
        return convectiveFraction;
    }

    /**
     * Legt den Wert der convectiveFraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setConvectiveFraction(ScaleType value) {
        this.convectiveFraction = value;
    }

    public boolean isSetConvectiveFraction() {
        return (this.convectiveFraction!= null);
    }

    /**
     * Ruft den Wert der latentFraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getLatentFraction() {
        return latentFraction;
    }

    /**
     * Legt den Wert der latentFraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setLatentFraction(ScaleType value) {
        this.latentFraction = value;
    }

    public boolean isSetLatentFraction() {
        return (this.latentFraction!= null);
    }

    /**
     * Ruft den Wert der radiantFraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getRadiantFraction() {
        return radiantFraction;
    }

    /**
     * Legt den Wert der radiantFraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setRadiantFraction(ScaleType value) {
        this.radiantFraction = value;
    }

    public boolean isSetRadiantFraction() {
        return (this.radiantFraction!= null);
    }

    /**
     * Ruft den Wert der totalValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalValue() {
        return totalValue;
    }

    /**
     * Legt den Wert der totalValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalValue(MeasureType value) {
        this.totalValue = value;
    }

    public boolean isSetTotalValue() {
        return (this.totalValue!= null);
    }

}
