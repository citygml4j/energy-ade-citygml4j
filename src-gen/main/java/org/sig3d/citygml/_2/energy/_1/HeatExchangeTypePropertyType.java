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


/**
 * <p>Java-Klasse für HeatExchangeTypePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeatExchangeTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/1.0}HeatExchangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatExchangeTypePropertyType", propOrder = {
    "heatExchangeType"
})
public class HeatExchangeTypePropertyType {

    @XmlElement(name = "HeatExchangeType")
    protected HeatExchangeTypeType heatExchangeType;

    /**
     * Ruft den Wert der heatExchangeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatExchangeTypeType }
     *     
     */
    public HeatExchangeTypeType getHeatExchangeType() {
        return heatExchangeType;
    }

    /**
     * Legt den Wert der heatExchangeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatExchangeTypeType }
     *     
     */
    public void setHeatExchangeType(HeatExchangeTypeType value) {
        this.heatExchangeType = value;
    }

    public boolean isSetHeatExchangeType() {
        return (this.heatExchangeType!= null);
    }

}
