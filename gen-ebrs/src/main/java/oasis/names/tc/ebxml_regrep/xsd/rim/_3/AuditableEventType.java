
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An Event that forms an audit trail in ebXML Registry.
 *
 * <p>Java-Klasse für AuditableEventType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AuditableEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="affectedObjects" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefListType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="eventType" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="user" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="requestId" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditableEventType", propOrder = {
    "affectedObjects"
})
public class AuditableEventType
    extends RegistryObjectType
{

    @XmlElement(required = true)
    protected ObjectRefListType affectedObjects;
    @XmlAttribute(name = "eventType", required = true)
    protected String eventType;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "user", required = true)
    protected String user;
    @XmlAttribute(name = "requestId", required = true)
    protected String requestId;

    /**
     * Ruft den Wert der affectedObjects-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ObjectRefListType }
     *
     */
    public ObjectRefListType getAffectedObjects() {
        return affectedObjects;
    }

    /**
     * Legt den Wert der affectedObjects-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ObjectRefListType }
     *
     */
    public void setAffectedObjects(ObjectRefListType value) {
        this.affectedObjects = value;
    }

    /**
     * Ruft den Wert der eventType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Legt den Wert der eventType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Ruft den Wert der user-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUser() {
        return user;
    }

    /**
     * Legt den Wert der user-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Ruft den Wert der requestId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Legt den Wert der requestId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
