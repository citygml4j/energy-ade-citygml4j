//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Feb 13 16:55:57 CET 2019
//


package org.sig3d.citygml._2.energy._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.AreaType;
import net.opengis.gml.MultiSurfacePropertyType;


/**
 * Single opening or group of openings, possibly related to an _Opening, sharing common thermal and optical characteristics.
 * 
 * <p>Java-Klasse für ThermalOpeningType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThermalOpeningType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}AreaType" minOccurs="0"/&gt;
 *         &lt;element name="construction" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractConstructionPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="surfaceGeometry" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalOpeningType", propOrder = {
    "area",
    "construction",
    "surfaceGeometry"
})
public class ThermalOpeningType
    extends AbstractCityObjectType
{

    protected AreaType area;
    protected AbstractConstructionPropertyType construction;
    protected MultiSurfacePropertyType surfaceGeometry;

    /**
     * Ruft den Wert der area-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getArea() {
        return area;
    }

    /**
     * Legt den Wert der area-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setArea(AreaType value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Ruft den Wert der construction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractConstructionPropertyType }
     *     
     */
    public AbstractConstructionPropertyType getConstruction() {
        return construction;
    }

    /**
     * Legt den Wert der construction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractConstructionPropertyType }
     *     
     */
    public void setConstruction(AbstractConstructionPropertyType value) {
        this.construction = value;
    }

    public boolean isSetConstruction() {
        return (this.construction!= null);
    }

    /**
     * Ruft den Wert der surfaceGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getSurfaceGeometry() {
        return surfaceGeometry;
    }

    /**
     * Legt den Wert der surfaceGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setSurfaceGeometry(MultiSurfacePropertyType value) {
        this.surfaceGeometry = value;
    }

    public boolean isSetSurfaceGeometry() {
        return (this.surfaceGeometry!= null);
    }

}
