//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Feb 13 16:55:57 CET 2019
//


package org.sig3d.citygml._2.energy._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;


/**
 * Facilities and appliances inside the usage zone or building unit, which consume and dissipate energy.
 * 
 * <p>Java-Klasse für FacilitiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FacilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="heatDissipation" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}HeatExchangeTypePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilitiesType", propOrder = {
    "operationSchedule",
    "heatDissipation"
})
@XmlSeeAlso({
    DHWFacilitiesType.class,
    ElectricalAppliancesType.class,
    LightingFacilitiesType.class
})
public class FacilitiesType
    extends AbstractCityObjectType
{

    protected AbstractSchedulePropertyType operationSchedule;
    protected HeatExchangeTypePropertyType heatDissipation;

    /**
     * Ruft den Wert der operationSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getOperationSchedule() {
        return operationSchedule;
    }

    /**
     * Legt den Wert der operationSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setOperationSchedule(AbstractSchedulePropertyType value) {
        this.operationSchedule = value;
    }

    public boolean isSetOperationSchedule() {
        return (this.operationSchedule!= null);
    }

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

}
