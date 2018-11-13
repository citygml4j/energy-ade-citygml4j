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
import net.opengis.gml.AbstractFeatureType;


/**
 * Occupants is an aggregated group of occupants of a usage zone or building unit, which can be residents, workers, visitors etc. 
 * 
 * <p>Java-Klasse für OccupantsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OccupantsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heatDissipation" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}HeatExchangeTypePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOccupants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="occupancyRate" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupantsType", propOrder = {
    "heatDissipation",
    "numberOfOccupants",
    "occupancyRate"
})
public class OccupantsType
    extends AbstractFeatureType
{

    protected HeatExchangeTypePropertyType heatDissipation;
    protected Integer numberOfOccupants;
    protected AbstractSchedulePropertyType occupancyRate;

    /**
     * Ruft den Wert der heatDissipation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public HeatExchangeTypePropertyType getHeatDissipation() {
        return heatDissipation;
    }

    /**
     * Legt den Wert der heatDissipation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public void setHeatDissipation(HeatExchangeTypePropertyType value) {
        this.heatDissipation = value;
    }

    public boolean isSetHeatDissipation() {
        return (this.heatDissipation!= null);
    }

    /**
     * Ruft den Wert der numberOfOccupants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOccupants() {
        return numberOfOccupants;
    }

    /**
     * Legt den Wert der numberOfOccupants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOccupants(Integer value) {
        this.numberOfOccupants = value;
    }

    public boolean isSetNumberOfOccupants() {
        return (this.numberOfOccupants!= null);
    }

    /**
     * Ruft den Wert der occupancyRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getOccupancyRate() {
        return occupancyRate;
    }

    /**
     * Legt den Wert der occupancyRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setOccupancyRate(AbstractSchedulePropertyType value) {
        this.occupancyRate = value;
    }

    public boolean isSetOccupancyRate() {
        return (this.occupancyRate!= null);
    }

}
