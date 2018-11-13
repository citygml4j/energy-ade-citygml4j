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
import net.opengis.gml.ScaleType;


/**
 * Percentage of energy transmittance in different wavelength ranges. Effectiveness of a construction in transmitting an incident radiant flux of a given wavelength range.
 * 
 * <p>Java-Klasse für TransmittanceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransmittanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fraction" type="{http://www.opengis.net/gml}ScaleType"/&gt;
 *         &lt;element name="wavelengthRange" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}WavelengthRangeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmittanceType", propOrder = {
    "fraction",
    "wavelengthRange"
})
public class TransmittanceType {

    @XmlElement(required = true)
    protected ScaleType fraction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected WavelengthRangeType wavelengthRange;

    /**
     * Ruft den Wert der fraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getFraction() {
        return fraction;
    }

    /**
     * Legt den Wert der fraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setFraction(ScaleType value) {
        this.fraction = value;
    }

    public boolean isSetFraction() {
        return (this.fraction!= null);
    }

    /**
     * Ruft den Wert der wavelengthRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WavelengthRangeType }
     *     
     */
    public WavelengthRangeType getWavelengthRange() {
        return wavelengthRange;
    }

    /**
     * Legt den Wert der wavelengthRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WavelengthRangeType }
     *     
     */
    public void setWavelengthRange(WavelengthRangeType value) {
        this.wavelengthRange = value;
    }

    public boolean isSetWavelengthRange() {
        return (this.wavelengthRange!= null);
    }

}
