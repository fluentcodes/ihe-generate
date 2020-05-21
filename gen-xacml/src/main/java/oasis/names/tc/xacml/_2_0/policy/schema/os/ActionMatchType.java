
package oasis.names.tc.xacml._2_0.policy.schema.os;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActionMatchType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActionMatchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}AttributeValue"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}ActionAttributeDesignator"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}AttributeSelector"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMatchType", propOrder = {
    "attributeValue",
    "actionAttributeDesignator",
    "attributeSelector"
})
public class ActionMatchType {

    @XmlElement(name = "AttributeValue", required = true)
    protected AttributeValueType attributeValue;
    @XmlElement(name = "ActionAttributeDesignator")
    protected AttributeDesignatorType actionAttributeDesignator;
    @XmlElement(name = "AttributeSelector")
    protected AttributeSelectorType attributeSelector;
    @XmlAttribute(name = "MatchId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String matchId;

    /**
     * Ruft den Wert der attributeValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttributeValueType }
     *     
     */
    public AttributeValueType getAttributeValue() {
        return attributeValue;
    }

    /**
     * Legt den Wert der attributeValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeValueType }
     *     
     */
    public void setAttributeValue(AttributeValueType value) {
        this.attributeValue = value;
    }

    /**
     * Ruft den Wert der actionAttributeDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDesignatorType }
     *     
     */
    public AttributeDesignatorType getActionAttributeDesignator() {
        return actionAttributeDesignator;
    }

    /**
     * Legt den Wert der actionAttributeDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDesignatorType }
     *     
     */
    public void setActionAttributeDesignator(AttributeDesignatorType value) {
        this.actionAttributeDesignator = value;
    }

    /**
     * Ruft den Wert der attributeSelector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSelectorType }
     *     
     */
    public AttributeSelectorType getAttributeSelector() {
        return attributeSelector;
    }

    /**
     * Legt den Wert der attributeSelector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSelectorType }
     *     
     */
    public void setAttributeSelector(AttributeSelectorType value) {
        this.attributeSelector = value;
    }

    /**
     * Ruft den Wert der matchId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * Legt den Wert der matchId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchId(String value) {
        this.matchId = value;
    }

}
