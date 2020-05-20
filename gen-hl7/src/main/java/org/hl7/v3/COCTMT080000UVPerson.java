
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
 * <p>Java-Klasse für COCT_MT080000UV.Person complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV.Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}PQ" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="existenceTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}TEL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="riskCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="handlingCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="administrativeGenderCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="birthTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/&gt;
 *         &lt;element name="deceasedInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;element name="deceasedTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/&gt;
 *         &lt;element name="multipleBirthInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;element name="multipleBirthOrderNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="organDonorInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;element name="addr" type="{urn:hl7-org:v3}AD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="disabilityCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="raceCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ethnicGroupCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asSpecimenAlternateIdentifier" type="{urn:hl7-org:v3}COCT_MT080000UV.SpecimenAlternateIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asSpecimenStub" type="{urn:hl7-org:v3}COCT_MT080000UV.SpecimenStub" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asContent" type="{urn:hl7-org:v3}COCT_MT080000UV.Content1" minOccurs="0"/&gt;
 *         &lt;element name="additive" type="{urn:hl7-org:v3}COCT_MT080000UV.Additive" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClass" fixed="PSN" /&gt;
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}EntityDeterminer" fixed="INSTANCE" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV.Person", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "quantity",
    "name",
    "desc",
    "statusCode",
    "existenceTime",
    "telecom",
    "riskCode",
    "handlingCode",
    "administrativeGenderCode",
    "birthTime",
    "deceasedInd",
    "deceasedTime",
    "multipleBirthInd",
    "multipleBirthOrderNumber",
    "organDonorInd",
    "addr",
    "disabilityCode",
    "raceCode",
    "ethnicGroupCode",
    "asSpecimenAlternateIdentifier",
    "asSpecimenStub",
    "asContent",
    "additive"
})
public class COCTMT080000UVPerson {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected CE code;
    protected List<PQ> quantity;
    protected List<EN> name;
    protected ED desc;
    protected CS statusCode;
    protected IVLTS existenceTime;
    protected List<TEL> telecom;
    protected CE riskCode;
    protected CE handlingCode;
    protected CE administrativeGenderCode;
    protected TS birthTime;
    protected BL deceasedInd;
    protected TS deceasedTime;
    protected BL multipleBirthInd;
    protected INT multipleBirthOrderNumber;
    protected BL organDonorInd;
    protected List<AD> addr;
    protected List<CE> disabilityCode;
    protected List<CE> raceCode;
    protected List<CE> ethnicGroupCode;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSpecimenAlternateIdentifier> asSpecimenAlternateIdentifier;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSpecimenStub> asSpecimenStub;
    @XmlElementRef(name = "asContent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVContent1> asContent;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVAdditive> additive;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected List<String> classCode;
    @XmlAttribute(name = "determinerCode", required = true)
    protected String determinerCode;

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
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PQ }
     * 
     * 
     */
    public List<PQ> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<PQ>();
        }
        return this.quantity;
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
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEL }
     * 
     * 
     */
    public List<TEL> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<TEL>();
        }
        return this.telecom;
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
     * Ruft den Wert der deceasedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getDeceasedTime() {
        return deceasedTime;
    }

    /**
     * Legt den Wert der deceasedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setDeceasedTime(TS value) {
        this.deceasedTime = value;
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
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AD }
     * 
     * 
     */
    public List<AD> getAddr() {
        if (addr == null) {
            addr = new ArrayList<AD>();
        }
        return this.addr;
    }

    /**
     * Gets the value of the disabilityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getDisabilityCode() {
        if (disabilityCode == null) {
            disabilityCode = new ArrayList<CE>();
        }
        return this.disabilityCode;
    }

    /**
     * Gets the value of the raceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getRaceCode() {
        if (raceCode == null) {
            raceCode = new ArrayList<CE>();
        }
        return this.raceCode;
    }

    /**
     * Gets the value of the ethnicGroupCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ethnicGroupCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEthnicGroupCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getEthnicGroupCode() {
        if (ethnicGroupCode == null) {
            ethnicGroupCode = new ArrayList<CE>();
        }
        return this.ethnicGroupCode;
    }

    /**
     * Gets the value of the asSpecimenAlternateIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asSpecimenAlternateIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsSpecimenAlternateIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVSpecimenAlternateIdentifier }
     * 
     * 
     */
    public List<COCTMT080000UVSpecimenAlternateIdentifier> getAsSpecimenAlternateIdentifier() {
        if (asSpecimenAlternateIdentifier == null) {
            asSpecimenAlternateIdentifier = new ArrayList<COCTMT080000UVSpecimenAlternateIdentifier>();
        }
        return this.asSpecimenAlternateIdentifier;
    }

    /**
     * Gets the value of the asSpecimenStub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asSpecimenStub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsSpecimenStub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVSpecimenStub }
     * 
     * 
     */
    public List<COCTMT080000UVSpecimenStub> getAsSpecimenStub() {
        if (asSpecimenStub == null) {
            asSpecimenStub = new ArrayList<COCTMT080000UVSpecimenStub>();
        }
        return this.asSpecimenStub;
    }

    /**
     * Ruft den Wert der asContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVContent1 }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVContent1> getAsContent() {
        return asContent;
    }

    /**
     * Legt den Wert der asContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVContent1 }{@code >}
     *     
     */
    public void setAsContent(JAXBElement<COCTMT080000UVContent1> value) {
        this.asContent = value;
    }

    /**
     * Gets the value of the additive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVAdditive }
     * 
     * 
     */
    public List<COCTMT080000UVAdditive> getAdditive() {
        if (additive == null) {
            additive = new ArrayList<COCTMT080000UVAdditive>();
        }
        return this.additive;
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
     * Ruft den Wert der determinerCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminerCode() {
        if (determinerCode == null) {
            return "INSTANCE";
        } else {
            return determinerCode;
        }
    }

    /**
     * Legt den Wert der determinerCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminerCode(String value) {
        this.determinerCode = value;
    }

}
