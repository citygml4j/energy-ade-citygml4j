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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ReferenceType;


/**
 * Energy demand is the useful energy required to satisfy a specific end-use, such as heating, cooling, domestic hot water etc.
 * 
 * <p>Java-Klasse für EnergyDemandType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnergyDemandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energyAmount" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractTimeSeriesPropertyType"/&gt;
 *         &lt;element name="endUse" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}EndUseTypeValue"/&gt;
 *         &lt;element name="maximumLoad" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="energyCarrierType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="demandedBy" type="{http://www.opengis.net/gml}ReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyDemandType", propOrder = {
    "energyAmount",
    "endUse",
    "maximumLoad",
    "energyCarrierType",
    "demandedBy"
})
public class EnergyDemandType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected AbstractTimeSeriesPropertyType energyAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EndUseTypeValue endUse;
    protected MeasureType maximumLoad;
    protected CodeType energyCarrierType;
    protected List<ReferenceType> demandedBy;

    /**
     * Ruft den Wert der energyAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public AbstractTimeSeriesPropertyType getEnergyAmount() {
        return energyAmount;
    }

    /**
     * Legt den Wert der energyAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public void setEnergyAmount(AbstractTimeSeriesPropertyType value) {
        this.energyAmount = value;
    }

    public boolean isSetEnergyAmount() {
        return (this.energyAmount!= null);
    }

    /**
     * Ruft den Wert der endUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndUseTypeValue }
     *     
     */
    public EndUseTypeValue getEndUse() {
        return endUse;
    }

    /**
     * Legt den Wert der endUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndUseTypeValue }
     *     
     */
    public void setEndUse(EndUseTypeValue value) {
        this.endUse = value;
    }

    public boolean isSetEndUse() {
        return (this.endUse!= null);
    }

    /**
     * Ruft den Wert der maximumLoad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumLoad() {
        return maximumLoad;
    }

    /**
     * Legt den Wert der maximumLoad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumLoad(MeasureType value) {
        this.maximumLoad = value;
    }

    public boolean isSetMaximumLoad() {
        return (this.maximumLoad!= null);
    }

    /**
     * Ruft den Wert der energyCarrierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getEnergyCarrierType() {
        return energyCarrierType;
    }

    /**
     * Legt den Wert der energyCarrierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setEnergyCarrierType(CodeType value) {
        this.energyCarrierType = value;
    }

    public boolean isSetEnergyCarrierType() {
        return (this.energyCarrierType!= null);
    }

    /**
     * Gets the value of the demandedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getDemandedBy() {
        if (demandedBy == null) {
            demandedBy = new ArrayList<ReferenceType>();
        }
        return this.demandedBy;
    }

    public boolean isSetDemandedBy() {
        return ((this.demandedBy!= null)&&(!this.demandedBy.isEmpty()));
    }

    public void unsetDemandedBy() {
        this.demandedBy = null;
    }

}
