
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Association is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *         An Association specifies references to two previously submitted
 *         registry entrys.
 *         The sourceObject is id of the sourceObject in association
 *         The targetObject is id of the targetObject in association
 *       
 * 
 * <p>Java-Klasse für AssociationType1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssociationType1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;attribute name="associationType" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="sourceObject" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="targetObject" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationType1")
public class AssociationType1
    extends RegistryObjectType
{

    @XmlAttribute(name = "associationType", required = true)
    protected String associationType;
    @XmlAttribute(name = "sourceObject", required = true)
    protected String sourceObject;
    @XmlAttribute(name = "targetObject", required = true)
    protected String targetObject;

    /**
     * Ruft den Wert der associationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * Legt den Wert der associationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationType(String value) {
        this.associationType = value;
    }

    /**
     * Ruft den Wert der sourceObject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceObject() {
        return sourceObject;
    }

    /**
     * Legt den Wert der sourceObject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceObject(String value) {
        this.sourceObject = value;
    }

    /**
     * Ruft den Wert der targetObject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetObject() {
        return targetObject;
    }

    /**
     * Legt den Wert der targetObject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetObject(String value) {
        this.targetObject = value;
    }

}
