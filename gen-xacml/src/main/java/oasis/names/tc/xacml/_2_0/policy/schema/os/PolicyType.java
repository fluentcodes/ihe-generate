
package oasis.names.tc.xacml._2_0.policy.schema.os;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PolicyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Description" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}PolicyDefaults" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}CombinerParameters" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Target"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}CombinerParameters" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}RuleCombinerParameters" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}VariableDefinition"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Rule"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Obligations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PolicyId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Version" type="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}VersionType" default="1.0" /&gt;
 *       &lt;attribute name="RuleCombiningAlgId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "description",
    "policyDefaults",
    "combinerParameters",
    "target",
    "combinerParametersOrRuleCombinerParametersOrVariableDefinition",
    "obligations"
})
public class PolicyType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PolicyDefaults")
    protected DefaultsType policyDefaults;
    @XmlElement(name = "CombinerParameters")
    protected CombinerParametersType combinerParameters;
    @XmlElement(name = "Target", required = true)
    protected TargetType target;
    @XmlElements({
        @XmlElement(name = "CombinerParameters", type = CombinerParametersType.class),
        @XmlElement(name = "RuleCombinerParameters", type = RuleCombinerParametersType.class),
        @XmlElement(name = "VariableDefinition", type = VariableDefinitionType.class),
        @XmlElement(name = "Rule", type = RuleType.class)
    })
    protected List<Object> combinerParametersOrRuleCombinerParametersOrVariableDefinition;
    @XmlElement(name = "Obligations")
    protected ObligationsType obligations;
    @XmlAttribute(name = "PolicyId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String policyId;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "RuleCombiningAlgId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String ruleCombiningAlgId;

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
     * Ruft den Wert der policyDefaults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultsType }
     *     
     */
    public DefaultsType getPolicyDefaults() {
        return policyDefaults;
    }

    /**
     * Legt den Wert der policyDefaults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultsType }
     *     
     */
    public void setPolicyDefaults(DefaultsType value) {
        this.policyDefaults = value;
    }

    /**
     * Ruft den Wert der combinerParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CombinerParametersType }
     *     
     */
    public CombinerParametersType getCombinerParameters() {
        return combinerParameters;
    }

    /**
     * Legt den Wert der combinerParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinerParametersType }
     *     
     */
    public void setCombinerParameters(CombinerParametersType value) {
        this.combinerParameters = value;
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
     * Gets the value of the combinerParametersOrRuleCombinerParametersOrVariableDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinerParametersOrRuleCombinerParametersOrVariableDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinerParametersOrRuleCombinerParametersOrVariableDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CombinerParametersType }
     * {@link RuleCombinerParametersType }
     * {@link VariableDefinitionType }
     * {@link RuleType }
     * 
     * 
     */
    public List<Object> getCombinerParametersOrRuleCombinerParametersOrVariableDefinition() {
        if (combinerParametersOrRuleCombinerParametersOrVariableDefinition == null) {
            combinerParametersOrRuleCombinerParametersOrVariableDefinition = new ArrayList<Object>();
        }
        return this.combinerParametersOrRuleCombinerParametersOrVariableDefinition;
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
     * Ruft den Wert der policyId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Legt den Wert der policyId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
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
     * Ruft den Wert der ruleCombiningAlgId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCombiningAlgId() {
        return ruleCombiningAlgId;
    }

    /**
     * Legt den Wert der ruleCombiningAlgId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCombiningAlgId(String value) {
        this.ruleCombiningAlgId = value;
    }

}
