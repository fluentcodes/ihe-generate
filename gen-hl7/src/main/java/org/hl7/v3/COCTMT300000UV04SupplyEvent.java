
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für COCT_MT300000UV04.SupplyEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT300000UV04.SupplyEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}TS"/&gt;
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}PQ"/&gt;
 *         &lt;element name="expectedUseTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{urn:hl7-org:v3}COCT_MT300000UV04.Product"/&gt;
 *         &lt;element name="performer" type="{urn:hl7-org:v3}COCT_MT300000UV04.Performer1" minOccurs="0"/&gt;
 *         &lt;element name="origin" type="{urn:hl7-org:v3}COCT_MT300000UV04.Origin" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{urn:hl7-org:v3}COCT_MT300000UV04.Destination" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:hl7-org:v3}COCT_MT300000UV04.Location"/&gt;
 *         &lt;element name="reasonOf" type="{urn:hl7-org:v3}COCT_MT300000UV04.Reason2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClassSupply" /&gt;
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}x_ActMoodIntentEvent" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT300000UV04.SupplyEvent", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "effectiveTime",
    "quantity",
    "expectedUseTime",
    "product",
    "performer",
    "origin",
    "destination",
    "location",
    "reasonOf"
})
public class COCTMT300000UV04SupplyEvent {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    protected CE code;
    @XmlElement(required = true)
    protected TS effectiveTime;
    @XmlElement(required = true)
    protected PQ quantity;
    protected IVLTS expectedUseTime;
    @XmlElement(required = true, nillable = true)
    protected COCTMT300000UV04Product product;
    @XmlElementRef(name = "performer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT300000UV04Performer1> performer;
    @XmlElementRef(name = "origin", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT300000UV04Origin> origin;
    @XmlElementRef(name = "destination", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT300000UV04Destination> destination;
    @XmlElement(required = true)
    protected COCTMT300000UV04Location location;
    @XmlElement(required = true, nillable = true)
    protected COCTMT300000UV04Reason2 reasonOf;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected ActClassSupply classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected XActMoodIntentEvent moodCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Ruft den Wert der typeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Legt den Wert der typeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Ruft den Wert der effectiveTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Legt den Wert der effectiveTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setEffectiveTime(TS value) {
        this.effectiveTime = value;
    }

    /**
     * Ruft den Wert der quantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getQuantity() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setQuantity(PQ value) {
        this.quantity = value;
    }

    /**
     * Ruft den Wert der expectedUseTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getExpectedUseTime() {
        return expectedUseTime;
    }

    /**
     * Legt den Wert der expectedUseTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setExpectedUseTime(IVLTS value) {
        this.expectedUseTime = value;
    }

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT300000UV04Product }
     *     
     */
    public COCTMT300000UV04Product getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT300000UV04Product }
     *     
     */
    public void setProduct(COCTMT300000UV04Product value) {
        this.product = value;
    }

    /**
     * Ruft den Wert der performer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04Performer1 }{@code >}
     *     
     */
    public JAXBElement<COCTMT300000UV04Performer1> getPerformer() {
        return performer;
    }

    /**
     * Legt den Wert der performer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04Performer1 }{@code >}
     *     
     */
    public void setPerformer(JAXBElement<COCTMT300000UV04Performer1> value) {
        this.performer = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04Origin }{@code >}
     *     
     */
    public JAXBElement<COCTMT300000UV04Origin> getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04Origin }{@code >}
     *     
     */
    public void setOrigin(JAXBElement<COCTMT300000UV04Origin> value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04Destination }{@code >}
     *     
     */
    public JAXBElement<COCTMT300000UV04Destination> getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04Destination }{@code >}
     *     
     */
    public void setDestination(JAXBElement<COCTMT300000UV04Destination> value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT300000UV04Location }
     *     
     */
    public COCTMT300000UV04Location getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT300000UV04Location }
     *     
     */
    public void setLocation(COCTMT300000UV04Location value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der reasonOf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT300000UV04Reason2 }
     *     
     */
    public COCTMT300000UV04Reason2 getReasonOf() {
        return reasonOf;
    }

    /**
     * Legt den Wert der reasonOf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT300000UV04Reason2 }
     *     
     */
    public void setReasonOf(COCTMT300000UV04Reason2 value) {
        this.reasonOf = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Ruft den Wert der classCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActClassSupply }
     *     
     */
    public ActClassSupply getClassCode() {
        return classCode;
    }

    /**
     * Legt den Wert der classCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassSupply }
     *     
     */
    public void setClassCode(ActClassSupply value) {
        this.classCode = value;
    }

    /**
     * Ruft den Wert der moodCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XActMoodIntentEvent }
     *     
     */
    public XActMoodIntentEvent getMoodCode() {
        return moodCode;
    }

    /**
     * Legt den Wert der moodCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XActMoodIntentEvent }
     *     
     */
    public void setMoodCode(XActMoodIntentEvent value) {
        this.moodCode = value;
    }

}
