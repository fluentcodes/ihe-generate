
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
 * <p>Java-Klasse für COCT_MT080000UV.Container complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV.Container"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="riskCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="handlingCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="capacityQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *         &lt;element name="heightQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *         &lt;element name="diameterQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *         &lt;element name="capTypeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="separatorTypeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="barrierDeltaQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *         &lt;element name="bottomDeltaQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *         &lt;element name="asIdentifiedContainer" type="{urn:hl7-org:v3}COCT_MT080000UV.IdentifiedContainer" minOccurs="0"/&gt;
 *         &lt;element name="asContent" type="{urn:hl7-org:v3}COCT_MT080000UV.Content3" minOccurs="0"/&gt;
 *         &lt;element name="asLocatedEntity" type="{urn:hl7-org:v3}COCT_MT070000UV01.LocatedEntity" minOccurs="0"/&gt;
 *         &lt;element name="additive" type="{urn:hl7-org:v3}COCT_MT080000UV.Additive2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClassContainer" /&gt;
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}EntityDeterminer" fixed="INSTANCE" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV.Container", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "desc",
    "riskCode",
    "handlingCode",
    "capacityQuantity",
    "heightQuantity",
    "diameterQuantity",
    "capTypeCode",
    "separatorTypeCode",
    "barrierDeltaQuantity",
    "bottomDeltaQuantity",
    "asIdentifiedContainer",
    "asContent",
    "asLocatedEntity",
    "additive"
})
public class COCTMT080000UVContainer {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    protected CE code;
    protected ED desc;
    protected CE riskCode;
    protected CE handlingCode;
    protected PQ capacityQuantity;
    protected PQ heightQuantity;
    protected PQ diameterQuantity;
    protected CE capTypeCode;
    protected CE separatorTypeCode;
    protected PQ barrierDeltaQuantity;
    protected PQ bottomDeltaQuantity;
    @XmlElementRef(name = "asIdentifiedContainer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVIdentifiedContainer> asIdentifiedContainer;
    @XmlElementRef(name = "asContent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVContent3> asContent;
    @XmlElementRef(name = "asLocatedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT070000UV01LocatedEntity> asLocatedEntity;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVAdditive2> additive;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected EntityClassContainer classCode;
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
     * Ruft den Wert der capacityQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getCapacityQuantity() {
        return capacityQuantity;
    }

    /**
     * Legt den Wert der capacityQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setCapacityQuantity(PQ value) {
        this.capacityQuantity = value;
    }

    /**
     * Ruft den Wert der heightQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getHeightQuantity() {
        return heightQuantity;
    }

    /**
     * Legt den Wert der heightQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setHeightQuantity(PQ value) {
        this.heightQuantity = value;
    }

    /**
     * Ruft den Wert der diameterQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getDiameterQuantity() {
        return diameterQuantity;
    }

    /**
     * Legt den Wert der diameterQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDiameterQuantity(PQ value) {
        this.diameterQuantity = value;
    }

    /**
     * Ruft den Wert der capTypeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCapTypeCode() {
        return capTypeCode;
    }

    /**
     * Legt den Wert der capTypeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCapTypeCode(CE value) {
        this.capTypeCode = value;
    }

    /**
     * Ruft den Wert der separatorTypeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getSeparatorTypeCode() {
        return separatorTypeCode;
    }

    /**
     * Legt den Wert der separatorTypeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setSeparatorTypeCode(CE value) {
        this.separatorTypeCode = value;
    }

    /**
     * Ruft den Wert der barrierDeltaQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getBarrierDeltaQuantity() {
        return barrierDeltaQuantity;
    }

    /**
     * Legt den Wert der barrierDeltaQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setBarrierDeltaQuantity(PQ value) {
        this.barrierDeltaQuantity = value;
    }

    /**
     * Ruft den Wert der bottomDeltaQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getBottomDeltaQuantity() {
        return bottomDeltaQuantity;
    }

    /**
     * Legt den Wert der bottomDeltaQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setBottomDeltaQuantity(PQ value) {
        this.bottomDeltaQuantity = value;
    }

    /**
     * Ruft den Wert der asIdentifiedContainer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVIdentifiedContainer }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVIdentifiedContainer> getAsIdentifiedContainer() {
        return asIdentifiedContainer;
    }

    /**
     * Legt den Wert der asIdentifiedContainer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVIdentifiedContainer }{@code >}
     *     
     */
    public void setAsIdentifiedContainer(JAXBElement<COCTMT080000UVIdentifiedContainer> value) {
        this.asIdentifiedContainer = value;
    }

    /**
     * Ruft den Wert der asContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVContent3 }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVContent3> getAsContent() {
        return asContent;
    }

    /**
     * Legt den Wert der asContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVContent3 }{@code >}
     *     
     */
    public void setAsContent(JAXBElement<COCTMT080000UVContent3> value) {
        this.asContent = value;
    }

    /**
     * Ruft den Wert der asLocatedEntity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}
     *     
     */
    public JAXBElement<COCTMT070000UV01LocatedEntity> getAsLocatedEntity() {
        return asLocatedEntity;
    }

    /**
     * Legt den Wert der asLocatedEntity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}
     *     
     */
    public void setAsLocatedEntity(JAXBElement<COCTMT070000UV01LocatedEntity> value) {
        this.asLocatedEntity = value;
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
     * {@link COCTMT080000UVAdditive2 }
     * 
     * 
     */
    public List<COCTMT080000UVAdditive2> getAdditive() {
        if (additive == null) {
            additive = new ArrayList<COCTMT080000UVAdditive2>();
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
     * Ruft den Wert der classCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntityClassContainer }
     *     
     */
    public EntityClassContainer getClassCode() {
        return classCode;
    }

    /**
     * Legt den Wert der classCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassContainer }
     *     
     */
    public void setClassCode(EntityClassContainer value) {
        this.classCode = value;
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
