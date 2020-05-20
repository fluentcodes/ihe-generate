
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
 * <p>Java-Klasse für COCT_MT310000UV04.AccomodationSupplied complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT310000UV04.AccomodationSupplied"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CS"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS"/&gt;
 *         &lt;element name="reasonCode" type="{urn:hl7-org:v3}CS"/&gt;
 *         &lt;element name="location" type="{urn:hl7-org:v3}COCT_MT310000UV04.Location"/&gt;
 *         &lt;element name="inFulfillmentOf" type="{urn:hl7-org:v3}COCT_MT310000UV04.InFulfillmentOf"/&gt;
 *         &lt;element name="pertinentInformation1" type="{urn:hl7-org:v3}COCT_MT310000UV04.PertinentInformation1" minOccurs="0"/&gt;
 *         &lt;element name="pertinentInformation2" type="{urn:hl7-org:v3}COCT_MT310000UV04.PertinentInformation2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClass" fixed="ACCM" /&gt;
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}x_ActMoodIntentEvent" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT310000UV04.AccomodationSupplied", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "effectiveTime",
    "reasonCode",
    "location",
    "inFulfillmentOf",
    "pertinentInformation1",
    "pertinentInformation2"
})
public class COCTMT310000UV04AccomodationSupplied {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected CS code;
    @XmlElement(required = true)
    protected IVLTS effectiveTime;
    @XmlElement(required = true)
    protected CS reasonCode;
    @XmlElement(required = true)
    protected COCTMT310000UV04Location location;
    @XmlElement(required = true)
    protected COCTMT310000UV04InFulfillmentOf inFulfillmentOf;
    @XmlElementRef(name = "pertinentInformation1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT310000UV04PertinentInformation1> pertinentInformation1;
    @XmlElement(required = true)
    protected COCTMT310000UV04PertinentInformation2 pertinentInformation2;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected List<String> classCode;
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
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setCode(CS value) {
        this.code = value;
    }

    /**
     * Ruft den Wert der effectiveTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Legt den Wert der effectiveTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
     * Ruft den Wert der reasonCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getReasonCode() {
        return reasonCode;
    }

    /**
     * Legt den Wert der reasonCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setReasonCode(CS value) {
        this.reasonCode = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT310000UV04Location }
     *     
     */
    public COCTMT310000UV04Location getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT310000UV04Location }
     *     
     */
    public void setLocation(COCTMT310000UV04Location value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der inFulfillmentOf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT310000UV04InFulfillmentOf }
     *     
     */
    public COCTMT310000UV04InFulfillmentOf getInFulfillmentOf() {
        return inFulfillmentOf;
    }

    /**
     * Legt den Wert der inFulfillmentOf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT310000UV04InFulfillmentOf }
     *     
     */
    public void setInFulfillmentOf(COCTMT310000UV04InFulfillmentOf value) {
        this.inFulfillmentOf = value;
    }

    /**
     * Ruft den Wert der pertinentInformation1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT310000UV04PertinentInformation1 }{@code >}
     *     
     */
    public JAXBElement<COCTMT310000UV04PertinentInformation1> getPertinentInformation1() {
        return pertinentInformation1;
    }

    /**
     * Legt den Wert der pertinentInformation1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT310000UV04PertinentInformation1 }{@code >}
     *     
     */
    public void setPertinentInformation1(JAXBElement<COCTMT310000UV04PertinentInformation1> value) {
        this.pertinentInformation1 = value;
    }

    /**
     * Ruft den Wert der pertinentInformation2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT310000UV04PertinentInformation2 }
     *     
     */
    public COCTMT310000UV04PertinentInformation2 getPertinentInformation2() {
        return pertinentInformation2;
    }

    /**
     * Legt den Wert der pertinentInformation2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT310000UV04PertinentInformation2 }
     *     
     */
    public void setPertinentInformation2(COCTMT310000UV04PertinentInformation2 value) {
        this.pertinentInformation2 = value;
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
     * Gets the value of the classCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassCode() {
        if (classCode == null) {
            classCode = new ArrayList<String>();
        }
        return this.classCode;
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
