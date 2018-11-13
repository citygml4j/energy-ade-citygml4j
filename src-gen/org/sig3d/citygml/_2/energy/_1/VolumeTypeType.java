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
import net.opengis.gml.VolumeType;


/**
 * Volume of e.g. a ThermalZone or UsageZone
 * 
 * <p>Java-Klasse für VolumeTypeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VolumeTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}VolumeTypeValue"/&gt;
 *         &lt;element name="value" type="{http://www.opengis.net/gml}VolumeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeTypeType", propOrder = {
    "type",
    "value"
})
public class VolumeTypeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VolumeTypeValue type;
    @XmlElement(required = true)
    protected VolumeType value;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeTypeValue }
     *     
     */
    public VolumeTypeValue getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeTypeValue }
     *     
     */
    public void setType(VolumeTypeValue value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setValue(VolumeType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

}
