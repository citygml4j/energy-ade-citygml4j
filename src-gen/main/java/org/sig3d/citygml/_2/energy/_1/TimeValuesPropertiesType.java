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


/**
 * Set of meta data of a time series
 * 
 * <p>Java-Klasse für TimeValuesPropertiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeValuesPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acquisitionMethod" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AcquisitionMethodValue"/&gt;
 *         &lt;element name="interpolationType" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}InterpolationTypeValue"/&gt;
 *         &lt;element name="qualityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thematicDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeValuesPropertiesType", propOrder = {
    "acquisitionMethod",
    "interpolationType",
    "qualityDescription",
    "source",
    "thematicDescription"
})
public class TimeValuesPropertiesType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AcquisitionMethodValue acquisitionMethod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InterpolationTypeValue interpolationType;
    protected String qualityDescription;
    protected String source;
    protected String thematicDescription;

    /**
     * Ruft den Wert der acquisitionMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AcquisitionMethodValue }
     *     
     */
    public AcquisitionMethodValue getAcquisitionMethod() {
        return acquisitionMethod;
    }

    /**
     * Legt den Wert der acquisitionMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquisitionMethodValue }
     *     
     */
    public void setAcquisitionMethod(AcquisitionMethodValue value) {
        this.acquisitionMethod = value;
    }

    public boolean isSetAcquisitionMethod() {
        return (this.acquisitionMethod!= null);
    }

    /**
     * Ruft den Wert der interpolationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterpolationTypeValue }
     *     
     */
    public InterpolationTypeValue getInterpolationType() {
        return interpolationType;
    }

    /**
     * Legt den Wert der interpolationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpolationTypeValue }
     *     
     */
    public void setInterpolationType(InterpolationTypeValue value) {
        this.interpolationType = value;
    }

    public boolean isSetInterpolationType() {
        return (this.interpolationType!= null);
    }

    /**
     * Ruft den Wert der qualityDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityDescription() {
        return qualityDescription;
    }

    /**
     * Legt den Wert der qualityDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityDescription(String value) {
        this.qualityDescription = value;
    }

    public boolean isSetQualityDescription() {
        return (this.qualityDescription!= null);
    }

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
    }

    /**
     * Ruft den Wert der thematicDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThematicDescription() {
        return thematicDescription;
    }

    /**
     * Legt den Wert der thematicDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThematicDescription(String value) {
        this.thematicDescription = value;
    }

    public boolean isSetThematicDescription() {
        return (this.thematicDescription!= null);
    }

}
