
package oasis.names.tc.xacml._2_0.policy.schema.os;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PolicySetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PolicySetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Description" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}PolicySetDefaults" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Target"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}PolicySet"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Policy"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}PolicySetIdReference"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}PolicyIdReference"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}CombinerParameters"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}PolicyCombinerParameters"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}PolicySetCombinerParameters"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Obligations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PolicySetId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Version" type="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}VersionType" default="1.0" /&gt;
 *       &lt;attribute name="PolicyCombiningAlgId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicySetType", propOrder = {
    "description",
    "policySetDefaults",
    "target",
    "policySetOrPolicyOrPolicySetIdReference",
    "obligations"
})
public class PolicySetType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PolicySetDefaults")
    protected DefaultsType policySetDefaults;
    @XmlElement(name = "Target", required = true)
    protected TargetType target;
    @XmlElementRefs({
        @XmlElementRef(name = "PolicySet", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Policy", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicySetIdReference", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicyIdReference", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CombinerParameters", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicyCombinerParameters", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicySetCombinerParameters", namespace = "urn:oasis:names:tc:xacml:2.0:policy:schema:os", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> policySetOrPolicyOrPolicySetIdReference;
    @XmlElement(name = "Obligations")
    protected ObligationsType obligations;
    @XmlAttribute(name = "PolicySetId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String policySetId;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "PolicyCombiningAlgId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String policyCombiningAlgId;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der policySetDefaults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultsType }
     *     
     */
    public DefaultsType getPolicySetDefaults() {
        return policySetDefaults;
    }

    /**
     * Legt den Wert der policySetDefaults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultsType }
     *     
     */
    public void setPolicySetDefaults(DefaultsType value) {
        this.policySetDefaults = value;
    }

    /**
     * Ruft den Wert der target-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetType }
     *     
     */
    public TargetType getTarget() {
        return target;
    }

    /**
     * Legt den Wert der target-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetType }
     *     
     */
    public void setTarget(TargetType value) {
        this.target = value;
    }

    /**
     * Gets the value of the policySetOrPolicyOrPolicySetIdReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policySetOrPolicyOrPolicySetIdReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicySetOrPolicyOrPolicySetIdReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PolicySetType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicyType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CombinerParametersType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicyCombinerParametersType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicySetCombinerParametersType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPolicySetOrPolicyOrPolicySetIdReference() {
        if (policySetOrPolicyOrPolicySetIdReference == null) {
            policySetOrPolicyOrPolicySetIdReference = new ArrayList<JAXBElement<?>>();
        }
        return this.policySetOrPolicyOrPolicySetIdReference;
    }

    /**
     * Ruft den Wert der obligations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObligationsType }
     *     
     */
    public ObligationsType getObligations() {
        return obligations;
    }

    /**
     * Legt den Wert der obligations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligationsType }
     *     
     */
    public void setObligations(ObligationsType value) {
        this.obligations = value;
    }

    /**
     * Ruft den Wert der policySetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySetId() {
        return policySetId;
    }

    /**
     * Legt den Wert der policySetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySetId(String value) {
        this.policySetId = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der policyCombiningAlgId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCombiningAlgId() {
        return policyCombiningAlgId;
    }

    /**
     * Legt den Wert der policyCombiningAlgId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCombiningAlgId(String value) {
        this.policyCombiningAlgId = value;
    }

}
