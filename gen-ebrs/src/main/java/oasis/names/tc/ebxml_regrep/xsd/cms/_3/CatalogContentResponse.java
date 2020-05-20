
package oasis.names.tc.ebxml_regrep.xsd.cms._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectListType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:cms:3.0}ContentManagementServiceResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CatalogedContent" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "catalogedContent"
})
@XmlRootElement(name = "CatalogContentResponse")
public class CatalogContentResponse
    extends ContentManagementServiceResponseType
{

    @XmlElement(name = "CatalogedContent", required = true)
    protected RegistryObjectListType catalogedContent;

    /**
     * Ruft den Wert der catalogedContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *     
     */
    public RegistryObjectListType getCatalogedContent() {
        return catalogedContent;
    }

    /**
     * Legt den Wert der catalogedContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *     
     */
    public void setCatalogedContent(RegistryObjectListType value) {
        this.catalogedContent = value;
    }

}
