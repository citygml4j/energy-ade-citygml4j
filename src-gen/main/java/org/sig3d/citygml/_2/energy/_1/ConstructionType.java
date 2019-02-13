//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Feb 13 16:55:57 CET 2019
//


package org.sig3d.citygml._2.energy._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * A Construction is a combination of layers, such as a wall or a roof.
 * 
 * <p>Java-Klasse für ConstructionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractConstructionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uValue" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="opticalProperties" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}OpticalPropertiesPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="layer" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}LayerPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionType", propOrder = {
    "uValue",
    "opticalProperties",
    "layer"
})
public class ConstructionType
    extends AbstractConstructionType
{

    protected MeasureType uValue;
    protected OpticalPropertiesPropertyType opticalProperties;
    protected List<LayerPropertyType> layer;

    /**
     * Ruft den Wert der uValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getUValue() {
        return uValue;
    }

    /**
     * Legt den Wert der uValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setUValue(MeasureType value) {
        this.uValue = value;
    }

    public boolean isSetUValue() {
        return (this.uValue!= null);
    }

    /**
     * Ruft den Wert der opticalProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OpticalPropertiesPropertyType }
     *     
     */
    public OpticalPropertiesPropertyType getOpticalProperties() {
        return opticalProperties;
    }

    /**
     * Legt den Wert der opticalProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalPropertiesPropertyType }
     *     
     */
    public void setOpticalProperties(OpticalPropertiesPropertyType value) {
        this.opticalProperties = value;
    }

    public boolean isSetOpticalProperties() {
        return (this.opticalProperties!= null);
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayerPropertyType }
     * 
     * 
     */
    public List<LayerPropertyType> getLayer() {
        if (layer == null) {
            layer = new ArrayList<LayerPropertyType>();
        }
        return this.layer;
    }

    public boolean isSetLayer() {
        return ((this.layer!= null)&&(!this.layer.isEmpty()));
    }

    public void unsetLayer() {
        this.layer = null;
    }

}
