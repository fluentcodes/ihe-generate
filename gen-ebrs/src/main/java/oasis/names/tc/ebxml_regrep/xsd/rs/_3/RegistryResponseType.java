
package oasis.names.tc.ebxml_regrep.xsd.rs._3;

import oasis.names.tc.ebxml_regrep.xsd.cms._3.ContentManagementServiceResponseType;
import oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryResponse;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotListType;

import javax.xml.bind.annotation.*;


/**
 * Base type for all ebXML Registry responses
 *
 * <p>Java-Klasse für RegistryResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RegistryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseSlotList" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotListType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryErrorList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="status" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="requestId" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryResponseType", propOrder = {
    "responseSlotList",
    "registryErrorList"
})
@XmlSeeAlso({
    AdhocQueryResponse.class,
    ContentManagementServiceResponseType.class
})
public class RegistryResponseType {

    @XmlElement(name = "ResponseSlotList")
    protected SlotListType responseSlotList;
    @XmlElement(name = "RegistryErrorList")
    protected RegistryErrorList registryErrorList;
    @XmlAttribute(name = "status", required = true)
    protected String status;
    @XmlAttribute(name = "requestId")
    @XmlSchemaType(name = "anyURI")
    protected String requestId;

    /**
     * Ruft den Wert der responseSlotList-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SlotListType }
     *
     */
    public SlotListType getResponseSlotList() {
        return responseSlotList;
    }

    /**
     * Legt den Wert der responseSlotList-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SlotListType }
     *
     */
    public void setResponseSlotList(SlotListType value) {
        this.responseSlotList = value;
    }

    /**
     * Ruft den Wert der registryErrorList-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RegistryErrorList }
     *
     */
    public RegistryErrorList getRegistryErrorList() {
        return registryErrorList;
    }

    /**
     * Legt den Wert der registryErrorList-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RegistryErrorList }
     *
     */
    public void setRegistryErrorList(RegistryErrorList value) {
        this.registryErrorList = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
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
