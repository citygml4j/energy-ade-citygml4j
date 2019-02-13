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
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.PointPropertyType;


/**
 * Data structure to model weather or climate data at the location of a building.
 * 
 * <p>Java-Klasse für WeatherDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WeatherDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherDataType" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}WeatherDataTypeValue"/&gt;
 *         &lt;element name="values" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractTimeSeriesPropertyType"/&gt;
 *         &lt;element name="position" type="{http://www.opengis.net/gml}PointPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherDataType", propOrder = {
    "weatherDataType",
    "values",
    "position"
})
public class WeatherDataType
    extends AbstractGMLType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected WeatherDataTypeValue weatherDataType;
    @XmlElement(required = true)
    protected AbstractTimeSeriesPropertyType values;
    protected PointPropertyType position;

    /**
     * Ruft den Wert der weatherDataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WeatherDataTypeValue }
     *     
     */
    public WeatherDataTypeValue getWeatherDataType() {
        return weatherDataType;
    }

    /**
     * Legt den Wert der weatherDataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherDataTypeValue }
     *     
     */
    public void setWeatherDataType(WeatherDataTypeValue value) {
        this.weatherDataType = value;
    }

    public boolean isSetWeatherDataType() {
        return (this.weatherDataType!= null);
    }

    /**
     * Ruft den Wert der values-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public AbstractTimeSeriesPropertyType getValues() {
        return values;
    }

    /**
     * Legt den Wert der values-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public void setValues(AbstractTimeSeriesPropertyType value) {
        this.values = value;
    }

    public boolean isSetValues() {
        return (this.values!= null);
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPosition(PointPropertyType value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
    }

}
