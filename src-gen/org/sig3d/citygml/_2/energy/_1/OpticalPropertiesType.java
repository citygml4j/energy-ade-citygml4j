//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.8.1
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Nov 14 00:43:05 CET 2018
//


package org.sig3d.citygml._2.energy._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ScaleType;


/**
 * Optical properties of a material
 * 
 * <p>Java-Klasse für OpticalPropertiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OpticalPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reflectance" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}ReflectancePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transmittance" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}TransmittancePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="glazingRatio" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpticalPropertiesType", propOrder = {
    "reflectance",
    "transmittance",
    "glazingRatio"
})
public class OpticalPropertiesType {

    protected List<ReflectancePropertyType> reflectance;
    protected List<TransmittancePropertyType> transmittance;
    protected ScaleType glazingRatio;

    /**
     * Gets the value of the reflectance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reflectance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReflectance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReflectancePropertyType }
     * 
     * 
     */
    public List<ReflectancePropertyType> getReflectance() {
        if (reflectance == null) {
            reflectance = new ArrayList<ReflectancePropertyType>();
        }
        return this.reflectance;
    }

    public boolean isSetReflectance() {
        return ((this.reflectance!= null)&&(!this.reflectance.isEmpty()));
    }

    public void unsetReflectance() {
        this.reflectance = null;
    }

    /**
     * Gets the value of the transmittance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transmittance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransmittance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransmittancePropertyType }
     * 
     * 
     */
    public List<TransmittancePropertyType> getTransmittance() {
        if (transmittance == null) {
            transmittance = new ArrayList<TransmittancePropertyType>();
        }
        return this.transmittance;
    }

    public boolean isSetTransmittance() {
        return ((this.transmittance!= null)&&(!this.transmittance.isEmpty()));
    }

    public void unsetTransmittance() {
        this.transmittance = null;
    }

    /**
     * Ruft den Wert der glazingRatio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getGlazingRatio() {
        return glazingRatio;
    }

    /**
     * Legt den Wert der glazingRatio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setGlazingRatio(ScaleType value) {
        this.glazingRatio = value;
    }

    public boolean isSetGlazingRatio() {
        return (this.glazingRatio!= null);
    }

}
