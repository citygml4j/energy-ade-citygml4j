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
import net.opengis.gml.ScaleType;


/**
 * Effectiveness of a material surface in reflecting an incident radiant flux of a given wavelength range.
 * 
 * <p>Java-Klasse für ReflectanceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReflectanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fraction" type="{http://www.opengis.net/gml}ScaleType"/&gt;
 *         &lt;element name="surface" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}SurfaceSide"/&gt;
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
@XmlType(name = "ReflectanceType", propOrder = {
    "fraction",
    "surface",
    "wavelengthRange"
})
public class ReflectanceType {

    @XmlElement(required = true)
    protected ScaleType fraction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SurfaceSide surface;
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
     * Ruft den Wert der surface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceSide }
     *     
     */
    public SurfaceSide getSurface() {
        return surface;
    }

    /**
     * Legt den Wert der surface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceSide }
     *     
     */
    public void setSurface(SurfaceSide value) {
        this.surface = value;
    }

    public boolean isSetSurface() {
        return (this.surface!= null);
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
