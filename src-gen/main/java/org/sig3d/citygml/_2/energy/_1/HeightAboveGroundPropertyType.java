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
 * <p>Java-Klasse für HeightAboveGroundPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeightAboveGroundPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/1.0}HeightAboveGround" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeightAboveGroundPropertyType", propOrder = {
    "heightAboveGround"
})
public class HeightAboveGroundPropertyType {

    @XmlElement(name = "HeightAboveGround")
    protected HeightAboveGroundType heightAboveGround;

    /**
     * Ruft den Wert der heightAboveGround-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeightAboveGroundType }
     *     
     */
    public HeightAboveGroundType getHeightAboveGround() {
        return heightAboveGround;
    }

    /**
     * Legt den Wert der heightAboveGround-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightAboveGroundType }
     *     
     */
    public void setHeightAboveGround(HeightAboveGroundType value) {
        this.heightAboveGround = value;
    }

    public boolean isSetHeightAboveGround() {
        return (this.heightAboveGround!= null);
    }

}
