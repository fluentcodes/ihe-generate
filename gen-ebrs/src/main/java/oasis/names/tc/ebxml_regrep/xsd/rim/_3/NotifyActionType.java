
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract Base type for all types of Notify Actions
 * 
 * <p>Java-Klasse für NotifyActionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NotifyActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ActionType"&gt;
 *       &lt;attribute name="notificationOption" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" default="urn:oasis:names:tc:ebxml-regrep:NotificationOptionType:ObjectRefs" /&gt;
 *       &lt;attribute name="endPoint" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyActionType")
public class NotifyActionType
    extends ActionType
{

    @XmlAttribute(name = "notificationOption")
    protected String notificationOption;
    @XmlAttribute(name = "endPoint", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String endPoint;

    /**
     * Ruft den Wert der notificationOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationOption() {
        if (notificationOption == null) {
            return "urn:oasis:names:tc:ebxml-regrep:NotificationOptionType:ObjectRefs";
        } else {
            return notificationOption;
        }
    }

    /**
     * Legt den Wert der notificationOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationOption(String value) {
        this.notificationOption = value;
    }

    /**
     * Ruft den Wert der endPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Legt den Wert der endPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

}
