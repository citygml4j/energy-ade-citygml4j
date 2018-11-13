//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.8.1
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Nov 14 00:43:05 CET 2018
//


package org.sig3d.citygml._2.energy._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * Solid material.
 * 
 * <p>Java-Klasse für SolidMaterialType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SolidMaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractMaterialType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conductivity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="density" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="permeance" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="specificHeat" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolidMaterialType", propOrder = {
    "conductivity",
    "density",
    "permeance",
    "specificHeat"
})
public class SolidMaterialType
    extends AbstractMaterialType
{

    protected MeasureType conductivity;
    protected MeasureType density;
    protected MeasureType permeance;
    protected MeasureType specificHeat;

    /**
     * Ruft den Wert der conductivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getConductivity() {
        return conductivity;
    }

    /**
     * Legt den Wert der conductivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setConductivity(MeasureType value) {
        this.conductivity = value;
    }

    public boolean isSetConductivity() {
        return (this.conductivity!= null);
    }

    /**
     * Ruft den Wert der density-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDensity() {
        return density;
    }

    /**
     * Legt den Wert der density-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDensity(MeasureType value) {
        this.density = value;
    }

    public boolean isSetDensity() {
        return (this.density!= null);
    }

    /**
     * Ruft den Wert der permeance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPermeance() {
        return permeance;
    }

    /**
     * Legt den Wert der permeance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPermeance(MeasureType value) {
        this.permeance = value;
    }

    public boolean isSetPermeance() {
        return (this.permeance!= null);
    }

    /**
     * Ruft den Wert der specificHeat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpecificHeat() {
        return specificHeat;
    }

    /**
     * Legt den Wert der specificHeat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpecificHeat(MeasureType value) {
        this.specificHeat = value;
    }

    public boolean isSetSpecificHeat() {
        return (this.specificHeat!= null);
    }

}
