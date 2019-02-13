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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * A usage zone is a zone of a building with homogeneous usage type.
 * 
 * <p>Java-Klasse für UsageZoneType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UsageZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractUsageZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coolingSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="heatingSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="usageZoneType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="ventilationSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="floorArea" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}FloorAreaPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="occupiedBy" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}OccupantsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="equippedWith" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}FacilitiesPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageZoneType", propOrder = {
    "coolingSchedule",
    "heatingSchedule",
    "usageZoneType",
    "ventilationSchedule",
    "floorArea",
    "occupiedBy",
    "equippedWith"
})
public class UsageZoneType
    extends AbstractUsageZoneType
{

    protected AbstractSchedulePropertyType coolingSchedule;
    protected AbstractSchedulePropertyType heatingSchedule;
    @XmlElement(required = true)
    protected CodeType usageZoneType;
    protected AbstractSchedulePropertyType ventilationSchedule;
    protected List<FloorAreaPropertyType> floorArea;
    protected List<OccupantsPropertyType> occupiedBy;
    protected List<FacilitiesPropertyType> equippedWith;

    /**
     * Ruft den Wert der coolingSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getCoolingSchedule() {
        return coolingSchedule;
    }

    /**
     * Legt den Wert der coolingSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setCoolingSchedule(AbstractSchedulePropertyType value) {
        this.coolingSchedule = value;
    }

    public boolean isSetCoolingSchedule() {
        return (this.coolingSchedule!= null);
    }

    /**
     * Ruft den Wert der heatingSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getHeatingSchedule() {
        return heatingSchedule;
    }

    /**
     * Legt den Wert der heatingSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setHeatingSchedule(AbstractSchedulePropertyType value) {
        this.heatingSchedule = value;
    }

    public boolean isSetHeatingSchedule() {
        return (this.heatingSchedule!= null);
    }

    /**
     * Ruft den Wert der usageZoneType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUsageZoneType() {
        return usageZoneType;
    }

    /**
     * Legt den Wert der usageZoneType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUsageZoneType(CodeType value) {
        this.usageZoneType = value;
    }

    public boolean isSetUsageZoneType() {
        return (this.usageZoneType!= null);
    }

    /**
     * Ruft den Wert der ventilationSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getVentilationSchedule() {
        return ventilationSchedule;
    }

    /**
     * Legt den Wert der ventilationSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setVentilationSchedule(AbstractSchedulePropertyType value) {
        this.ventilationSchedule = value;
    }

    public boolean isSetVentilationSchedule() {
        return (this.ventilationSchedule!= null);
    }

    /**
     * Gets the value of the floorArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floorArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloorArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloorAreaPropertyType }
     * 
     * 
     */
    public List<FloorAreaPropertyType> getFloorArea() {
        if (floorArea == null) {
            floorArea = new ArrayList<FloorAreaPropertyType>();
        }
        return this.floorArea;
    }

    public boolean isSetFloorArea() {
        return ((this.floorArea!= null)&&(!this.floorArea.isEmpty()));
    }

    public void unsetFloorArea() {
        this.floorArea = null;
    }

    /**
     * Gets the value of the occupiedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupiedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupiedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupantsPropertyType }
     * 
     * 
     */
    public List<OccupantsPropertyType> getOccupiedBy() {
        if (occupiedBy == null) {
            occupiedBy = new ArrayList<OccupantsPropertyType>();
        }
        return this.occupiedBy;
    }

    public boolean isSetOccupiedBy() {
        return ((this.occupiedBy!= null)&&(!this.occupiedBy.isEmpty()));
    }

    public void unsetOccupiedBy() {
        this.occupiedBy = null;
    }

    /**
     * Gets the value of the equippedWith property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equippedWith property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquippedWith().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilitiesPropertyType }
     * 
     * 
     */
    public List<FacilitiesPropertyType> getEquippedWith() {
        if (equippedWith == null) {
            equippedWith = new ArrayList<FacilitiesPropertyType>();
        }
        return this.equippedWith;
    }

    public boolean isSetEquippedWith() {
        return ((this.equippedWith!= null)&&(!this.equippedWith.isEmpty()));
    }

    public void unsetEquippedWith() {
        this.equippedWith = null;
    }

}
