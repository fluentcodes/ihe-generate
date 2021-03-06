
package oasis.names.tc.xacml._2_0.policy.schema.os;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObligationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObligationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}AttributeAssignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ObligationId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="FulfillOn" use="required" type="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}EffectType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObligationType", propOrder = {
    "attributeAssignment"
})
public class ObligationType {

    @XmlElement(name = "AttributeAssignment")
    protected List<AttributeAssignmentType> attributeAssignment;
    @XmlAttribute(name = "ObligationId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String obligationId;
    @XmlAttribute(name = "FulfillOn", required = true)
    protected EffectType fulfillOn;

    /**
     * Gets the value of the attributeAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeAssignmentType }
     * 
     * 
     */
    public List<AttributeAssignmentType> getAttributeAssignment() {
        if (attributeAssignment == null) {
            attributeAssignment = new ArrayList<AttributeAssignmentType>();
        }
        return this.attributeAssignment;
    }

    /**
     * Ruft den Wert der obligationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObligationId() {
        return obligationId;
    }

    /**
     * Legt den Wert der obligationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObligationId(String value) {
        this.obligationId = value;
    }

    /**
     * Ruft den Wert der fulfillOn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EffectType }
     *     
     */
    public EffectType getFulfillOn() {
        return fulfillOn;
    }

    /**
     * Legt den Wert der fulfillOn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectType }
     *     
     */
    public void setFulfillOn(EffectType value) {
        this.fulfillOn = value;
    }

}
