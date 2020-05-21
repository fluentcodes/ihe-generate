
package oasis.names.tc.xacml._2_0.policy.schema.os;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubjectAttributeDesignatorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubjectAttributeDesignatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}AttributeDesignatorType"&gt;
 *       &lt;attribute name="SubjectCategory" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="urn:oasis:names:tc:xacml:1.0:subject-category:access-subject" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectAttributeDesignatorType")
public class SubjectAttributeDesignatorType
    extends AttributeDesignatorType
{

    @XmlAttribute(name = "SubjectCategory")
    @XmlSchemaType(name = "anyURI")
    protected String subjectCategory;

    /**
     * Ruft den Wert der subjectCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCategory() {
        if (subjectCategory == null) {
            return "urn:oasis:names:tc:xacml:1.0:subject-category:access-subject";
        } else {
            return subjectCategory;
        }
    }

    /**
     * Legt den Wert der subjectCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCategory(String value) {
        this.subjectCategory = value;
    }

}
