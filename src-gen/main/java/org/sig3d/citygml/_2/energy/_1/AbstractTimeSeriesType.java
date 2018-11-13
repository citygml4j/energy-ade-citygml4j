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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractGMLType;


/**
 * Base class for all types of time series. A time series is a consistent series of time-depending values.
 * 
 * <p>Java-Klasse für AbstractTimeSeriesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractTimeSeriesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variableProperties" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}TimeValuesPropertiesPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeSeriesType", propOrder = {
    "variableProperties"
})
@XmlSeeAlso({
    RegularTimeSeriesType.class,
    RegularTimeSeriesFileType.class
})
public abstract class AbstractTimeSeriesType
    extends AbstractGMLType
{

    @XmlElement(required = true)
    protected TimeValuesPropertiesPropertyType variableProperties;

    /**
     * Ruft den Wert der variableProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeValuesPropertiesPropertyType }
     *     
     */
    public TimeValuesPropertiesPropertyType getVariableProperties() {
        return variableProperties;
    }

    /**
     * Legt den Wert der variableProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeValuesPropertiesPropertyType }
     *     
     */
    public void setVariableProperties(TimeValuesPropertiesPropertyType value) {
        this.variableProperties = value;
    }

    public boolean isSetVariableProperties() {
        return (this.variableProperties!= null);
    }

}
