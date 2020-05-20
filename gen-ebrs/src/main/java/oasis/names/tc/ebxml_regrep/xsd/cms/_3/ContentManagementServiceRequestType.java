
package oasis.names.tc.ebxml_regrep.xsd.cms._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectListType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryRequestType;


/**
 * Base type for all Content Management Service requests.
 * 
 * <p>Java-Klasse für ContentManagementServiceRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentManagementServiceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalContent" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectListType"/&gt;
 *         &lt;element name="InvocationControlFile" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ExtrinsicObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentManagementServiceRequestType", propOrder = {
    "originalContent",
    "invocationControlFile"
})
@XmlSeeAlso({
    CatalogContentRequest.class,
    ValidateContentRequest.class
})
public class ContentManagementServiceRequestType
    extends RegistryRequestType
{

    @XmlElement(name = "OriginalContent", required = true)
    protected RegistryObjectListType originalContent;
    @XmlElement(name = "InvocationControlFile")
    protected List<ExtrinsicObjectType> invocationControlFile;

    /**
     * Ruft den Wert der originalContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *     
     */
    public RegistryObjectListType getOriginalContent() {
        return originalContent;
    }

    /**
     * Legt den Wert der originalContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *     
     */
    public void setOriginalContent(RegistryObjectListType value) {
        this.originalContent = value;
    }

    /**
     * Gets the value of the invocationControlFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invocationControlFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvocationControlFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrinsicObjectType }
     * 
     * 
     */
    public List<ExtrinsicObjectType> getInvocationControlFile() {
        if (invocationControlFile == null) {
            invocationControlFile = new ArrayList<ExtrinsicObjectType>();
        }
        return this.invocationControlFile;
    }

}
