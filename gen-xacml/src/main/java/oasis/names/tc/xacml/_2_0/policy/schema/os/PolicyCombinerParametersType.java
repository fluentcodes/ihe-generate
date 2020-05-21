
package oasis.names.tc.xacml._2_0.policy.schema.os;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PolicyCombinerParametersType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PolicyCombinerParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}CombinerParametersType"&gt;
 *       &lt;attribute name="PolicyIdRef" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyCombinerParametersType")
public class PolicyCombinerParametersType
    extends CombinerParametersType
{

    @XmlAttribute(name = "PolicyIdRef", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String policyIdRef;

    /**
     * Ruft den Wert der policyIdRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyIdRef() {
        return policyIdRef;
    }

    /**
     * Legt den Wert der policyIdRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyIdRef(String value) {
        this.policyIdRef = value;
    }

}
