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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;


/**
 * Different kinds of building height above general ground. level. The general ground level lies anywhere between the lowest and the highest ground points of the construction.
 * 
 * <p>Java-Klasse für HeightAboveGroundType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeightAboveGroundType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heightReference" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}ElevationReferenceValue"/&gt;
 *         &lt;element name="value" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeightAboveGroundType", propOrder = {
    "heightReference",
    "value"
})
public class HeightAboveGroundType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ElevationReferenceValue heightReference;
    @XmlElement(required = true)
    protected LengthType value;

    /**
     * Ruft den Wert der heightReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevationReferenceValue }
     *     
     */
    public ElevationReferenceValue getHeightReference() {
        return heightReference;
    }

    /**
     * Legt den Wert der heightReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevationReferenceValue }
     *     
     */
    public void setHeightReference(ElevationReferenceValue value) {
        this.heightReference = value;
    }

    public boolean isSetHeightReference() {
        return (this.heightReference!= null);
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setValue(LengthType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

}
