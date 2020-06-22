
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 *         ClassificationScheme is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *
 *
 * <p>Java-Klasse für ClassificationSchemeType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ClassificationSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ClassificationNode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isInternal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="nodeType" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSchemeType", propOrder = {
    "classificationNode"
})
public class ClassificationSchemeType
    extends RegistryObjectType
{

    @XmlElement(name = "ClassificationNode")
    protected List<ClassificationNodeType> classificationNode;
    @XmlAttribute(name = "isInternal", required = true)
    protected boolean isInternal;
    @XmlAttribute(name = "nodeType", required = true)
    protected String nodeType;

    /**
     * Gets the value of the classificationNode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationNode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationNode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationNodeType }
     *
     *
     */
    public List<ClassificationNodeType> getClassificationNode() {
        if (classificationNode == null) {
            classificationNode = new ArrayList<ClassificationNodeType>();
        }
        return this.classificationNode;
    }

    /**
     * Ruft den Wert der isInternal-Eigenschaft ab.
     *
     */
    public boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Legt den Wert der isInternal-Eigenschaft fest.
     *
     */
    public void setIsInternal(boolean value) {
        this.isInternal = value;
    }

    /**
     * Ruft den Wert der nodeType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Legt den Wert der nodeType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNodeType(String value) {
        this.nodeType = value;
    }

}
