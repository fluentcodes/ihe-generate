
package oasis.names.tc.ebxml_regrep.xsd.rs._3;

import oasis.names.tc.ebxml_regrep.xsd.cms._3.ContentManagementServiceRequestType;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.*;
import oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryRequest;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotListType;

import javax.xml.bind.annotation.*;


/**
 * Base type for all ebXML Registry requests
 *
 * <p>Java-Klasse für RegistryRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RegistryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestSlotList" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryRequestType", propOrder = {
    "requestSlotList"
})
@XmlSeeAlso({
    AdhocQueryRequest.class,
    AcceptObjectsRequest.class,
    RelocateObjectsRequest.class,
    RemoveObjectsRequest.class,
    UndeprecateObjectsRequest.class,
    DeprecateObjectsRequest.class,
    ApproveObjectsRequest.class,
    UpdateObjectsRequest.class,
    SubmitObjectsRequest.class,
    ContentManagementServiceRequestType.class
})
public class RegistryRequestType {

    @XmlElement(name = "RequestSlotList")
    protected SlotListType requestSlotList;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "comment")
    protected String comment;

    /**
     * Ruft den Wert der requestSlotList-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SlotListType }
     *
     */
    public SlotListType getRequestSlotList() {
        return requestSlotList;
    }

    /**
     * Legt den Wert der requestSlotList-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SlotListType }
     *
     */
    public void setRequestSlotList(SlotListType value) {
        this.requestSlotList = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
