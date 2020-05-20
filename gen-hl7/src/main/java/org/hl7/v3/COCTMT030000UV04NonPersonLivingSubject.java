
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
 * <p>Java-Klasse für COCT_MT030000UV04.NonPersonLivingSubject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT030000UV04.NonPersonLivingSubject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="existenceTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="riskCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="handlingCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="administrativeGenderCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="birthTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/&gt;
 *         &lt;element name="deceasedInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;element name="multipleBirthInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;element name="multipleBirthOrderNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="organDonorInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;element name="strainText" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="genderStatusCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="asMember" type="{urn:hl7-org:v3}COCT_MT030000UV04.Member" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asOtherIDs" type="{urn:hl7-org:v3}COCT_MT030000UV04.OtherIDs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asCoveredParty" type="{urn:hl7-org:v3}COCT_MT500000UV04.CoveredParty" minOccurs="0"/&gt;
 *         &lt;element name="contactParty" type="{urn:hl7-org:v3}COCT_MT030000UV04.ContactParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guardian" type="{urn:hl7-org:v3}COCT_MT030000UV04.Guardian" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guarantor" type="{urn:hl7-org:v3}COCT_MT030000UV04.Guarantor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="birthPlace" type="{urn:hl7-org:v3}COCT_MT030000UV04.BirthPlace" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClassNonPersonLivingSubject" /&gt;
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}x_DeterminerInstanceKind" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT030000UV04.NonPersonLivingSubject", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "quantity",
    "name",
    "desc",
    "statusCode",
    "existenceTime",
    "riskCode",
    "handlingCode",
    "administrativeGenderCode",
    "birthTime",
    "deceasedInd",
    "multipleBirthInd",
    "multipleBirthOrderNumber",
    "organDonorInd",
    "strainText",
    "genderStatusCode",
    "asMember",
    "asOtherIDs",
    "asCoveredParty",
    "contactParty",
    "guardian",
    "guarantor",
    "birthPlace"
})
public class COCTMT030000UV04NonPersonLivingSubject {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    protected INT quantity;
    protected List<EN> name;
    protected ED desc;
    protected CS statusCode;
    protected IVLTS existenceTime;
    protected CE riskCode;
    protected CE handlingCode;
    protected CE administrativeGenderCode;
    protected TS birthTime;
    protected BL deceasedInd;
    protected BL multipleBirthInd;
    protected INT multipleBirthOrderNumber;
    protected BL organDonorInd;
    protected ED strainText;
    protected CE genderStatusCode;
    @XmlElement(nillable = true)
    protected List<COCTMT030000UV04Member> asMember;
    @XmlElement(nillable = true)
    protected List<COCTMT030000UV04OtherIDs> asOtherIDs;
    @XmlElementRef(name = "asCoveredParty", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT500000UV04CoveredParty> asCoveredParty;
    @XmlElement(nillable = true)
    protected List<COCTMT030000UV04ContactParty> contactParty;
    @XmlElement(nillable = true)
    protected List<COCTMT030000UV04Guardian> guardian;
    @XmlElement(nillable = true)
    protected List<COCTMT030000UV04Guarantor> guarantor;
    @XmlElementRef(name = "birthPlace", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT030000UV04BirthPlace> birthPlace;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected EntityClassNonPersonLivingSubject classCode;
    @XmlAttribute(name = "determinerCode", required = true)
    protected XDeterminerInstanceKind determinerCode;

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
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
    }

    /**
     * Ruft den Wert der quantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getQuantity() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setQuantity(INT value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EN }
     * 
     * 
     */
    public List<EN> getName() {
        if (name == null) {
            name = new ArrayList<EN>();
        }
        return this.name;
    }

    /**
     * Ruft den Wert der desc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getDesc() {
        return desc;
    }

    /**
     * Legt den Wert der desc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setDesc(ED value) {
        this.desc = value;
    }

    /**
     * Ruft den Wert der statusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getStatusCode() {
        return statusCode;
    }

    /**
     * Legt den Wert der statusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setStatusCode(CS value) {
        this.statusCode = value;
    }

    /**
     * Ruft den Wert der existenceTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getExistenceTime() {
        return existenceTime;
    }

    /**
     * Legt den Wert der existenceTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setExistenceTime(IVLTS value) {
        this.existenceTime = value;
    }

    /**
     * Ruft den Wert der riskCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getRiskCode() {
        return riskCode;
    }

    /**
     * Legt den Wert der riskCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setRiskCode(CE value) {
        this.riskCode = value;
    }

    /**
     * Ruft den Wert der handlingCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getHandlingCode() {
        return handlingCode;
    }

    /**
     * Legt den Wert der handlingCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setHandlingCode(CE value) {
        this.handlingCode = value;
    }

    /**
     * Ruft den Wert der administrativeGenderCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getAdministrativeGenderCode() {
        return administrativeGenderCode;
    }

    /**
     * Legt den Wert der administrativeGenderCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setAdministrativeGenderCode(CE value) {
        this.administrativeGenderCode = value;
    }

    /**
     * Ruft den Wert der birthTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getBirthTime() {
        return birthTime;
    }

    /**
     * Legt den Wert der birthTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setBirthTime(TS value) {
        this.birthTime = value;
    }

    /**
     * Ruft den Wert der deceasedInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getDeceasedInd() {
        return deceasedInd;
    }

    /**
     * Legt den Wert der deceasedInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setDeceasedInd(BL value) {
        this.deceasedInd = value;
    }

    /**
     * Ruft den Wert der multipleBirthInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getMultipleBirthInd() {
        return multipleBirthInd;
    }

    /**
     * Legt den Wert der multipleBirthInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setMultipleBirthInd(BL value) {
        this.multipleBirthInd = value;
    }

    /**
     * Ruft den Wert der multipleBirthOrderNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getMultipleBirthOrderNumber() {
        return multipleBirthOrderNumber;
    }

    /**
     * Legt den Wert der multipleBirthOrderNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setMultipleBirthOrderNumber(INT value) {
        this.multipleBirthOrderNumber = value;
    }

    /**
     * Ruft den Wert der organDonorInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getOrganDonorInd() {
        return organDonorInd;
    }

    /**
     * Legt den Wert der organDonorInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setOrganDonorInd(BL value) {
        this.organDonorInd = value;
    }

    /**
     * Ruft den Wert der strainText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getStrainText() {
        return strainText;
    }

    /**
     * Legt den Wert der strainText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setStrainText(ED value) {
        this.strainText = value;
    }

    /**
     * Ruft den Wert der genderStatusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getGenderStatusCode() {
        return genderStatusCode;
    }

    /**
     * Legt den Wert der genderStatusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setGenderStatusCode(CE value) {
        this.genderStatusCode = value;
    }

    /**
     * Gets the value of the asMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030000UV04Member }
     * 
     * 
     */
    public List<COCTMT030000UV04Member> getAsMember() {
        if (asMember == null) {
            asMember = new ArrayList<COCTMT030000UV04Member>();
        }
        return this.asMember;
    }

    /**
     * Gets the value of the asOtherIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asOtherIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsOtherIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030000UV04OtherIDs }
     * 
     * 
     */
    public List<COCTMT030000UV04OtherIDs> getAsOtherIDs() {
        if (asOtherIDs == null) {
            asOtherIDs = new ArrayList<COCTMT030000UV04OtherIDs>();
        }
        return this.asOtherIDs;
    }

    /**
     * Ruft den Wert der asCoveredParty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT500000UV04CoveredParty }{@code >}
     *     
     */
    public JAXBElement<COCTMT500000UV04CoveredParty> getAsCoveredParty() {
        return asCoveredParty;
    }

    /**
     * Legt den Wert der asCoveredParty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT500000UV04CoveredParty }{@code >}
     *     
     */
    public void setAsCoveredParty(JAXBElement<COCTMT500000UV04CoveredParty> value) {
        this.asCoveredParty = value;
    }

    /**
     * Gets the value of the contactParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030000UV04ContactParty }
     * 
     * 
     */
    public List<COCTMT030000UV04ContactParty> getContactParty() {
        if (contactParty == null) {
            contactParty = new ArrayList<COCTMT030000UV04ContactParty>();
        }
        return this.contactParty;
    }

    /**
     * Gets the value of the guardian property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guardian property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuardian().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030000UV04Guardian }
     * 
     * 
     */
    public List<COCTMT030000UV04Guardian> getGuardian() {
        if (guardian == null) {
            guardian = new ArrayList<COCTMT030000UV04Guardian>();
        }
        return this.guardian;
    }

    /**
     * Gets the value of the guarantor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030000UV04Guarantor }
     * 
     * 
     */
    public List<COCTMT030000UV04Guarantor> getGuarantor() {
        if (guarantor == null) {
            guarantor = new ArrayList<COCTMT030000UV04Guarantor>();
        }
        return this.guarantor;
    }

    /**
     * Ruft den Wert der birthPlace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030000UV04BirthPlace }{@code >}
     *     
     */
    public JAXBElement<COCTMT030000UV04BirthPlace> getBirthPlace() {
        return birthPlace;
    }

    /**
     * Legt den Wert der birthPlace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030000UV04BirthPlace }{@code >}
     *     
     */
    public void setBirthPlace(JAXBElement<COCTMT030000UV04BirthPlace> value) {
        this.birthPlace = value;
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
     *     {@link EntityClassNonPersonLivingSubject }
     *     
     */
    public EntityClassNonPersonLivingSubject getClassCode() {
        return classCode;
    }

    /**
     * Legt den Wert der classCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassNonPersonLivingSubject }
     *     
     */
    public void setClassCode(EntityClassNonPersonLivingSubject value) {
        this.classCode = value;
    }

    /**
     * Ruft den Wert der determinerCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XDeterminerInstanceKind }
     *     
     */
    public XDeterminerInstanceKind getDeterminerCode() {
        return determinerCode;
    }

    /**
     * Legt den Wert der determinerCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XDeterminerInstanceKind }
     *     
     */
    public void setDeterminerCode(XDeterminerInstanceKind value) {
        this.determinerCode = value;
    }

}
