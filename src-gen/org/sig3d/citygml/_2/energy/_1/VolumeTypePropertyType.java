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
 * <p>Java-Klasse für VolumeTypePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VolumeTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/1.0}VolumeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeTypePropertyType", propOrder = {
    "volumeType"
})
public class VolumeTypePropertyType {

    @XmlElement(name = "VolumeType")
    protected VolumeTypeType volumeType;

    /**
     * Ruft den Wert der volumeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeTypeType }
     *     
     */
    public VolumeTypeType getVolumeType() {
        return volumeType;
    }

    /**
     * Legt den Wert der volumeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeTypeType }
     *     
     */
    public void setVolumeType(VolumeTypeType value) {
        this.volumeType = value;
    }

    public boolean isSetVolumeType() {
        return (this.volumeType!= null);
    }

}
