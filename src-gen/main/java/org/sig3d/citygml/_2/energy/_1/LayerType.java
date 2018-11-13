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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * A Layer is a combination of one of more materials, references via a LayerComponent.
 * 
 * <p>Java-Klasse für LayerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LayerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="layerComponent" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}LayerComponentPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayerType", propOrder = {
    "layerComponent"
})
public class LayerType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected List<LayerComponentPropertyType> layerComponent;

    /**
     * Gets the value of the layerComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayerComponentPropertyType }
     * 
     * 
     */
    public List<LayerComponentPropertyType> getLayerComponent() {
        if (layerComponent == null) {
            layerComponent = new ArrayList<LayerComponentPropertyType>();
        }
        return this.layerComponent;
    }

    public boolean isSetLayerComponent() {
        return ((this.layerComponent!= null)&&(!this.layerComponent.isEmpty()));
    }

    public void unsetLayerComponent() {
        this.layerComponent = null;
    }

}
