
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notification of registry events.
 * 
 * <p>Java-Klasse für NotificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectList"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="subscription" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", propOrder = {
    "registryObjectList"
})
public class NotificationType
    extends RegistryObjectType
{

    @XmlElement(name = "RegistryObjectList", required = true)
    protected RegistryObjectListType registryObjectList;
    @XmlAttribute(name = "subscription", required = true)
    protected String subscription;

    /**
     * Ruft den Wert der registryObjectList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *     
     */
    public RegistryObjectListType getRegistryObjectList() {
        return registryObjectList;
    }

    /**
     * Legt den Wert der registryObjectList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *     
     */
    public void setRegistryObjectList(RegistryObjectListType value) {
        this.registryObjectList = value;
    }

    /**
     * Ruft den Wert der subscription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscription() {
        return subscription;
    }

    /**
     * Legt den Wert der subscription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscription(String value) {
        this.subscription = value;
    }

}
