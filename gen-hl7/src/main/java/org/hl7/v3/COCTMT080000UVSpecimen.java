
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
 * <p>Java-Klasse für COCT_MT080000UV.Specimen complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV.Specimen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="specimenNatural" type="{urn:hl7-org:v3}COCT_MT080000UV.Natural"/&gt;
 *           &lt;element name="specimenManufactured" type="{urn:hl7-org:v3}COCT_MT080000UV.Manufactured"/&gt;
 *           &lt;element name="specimenNonPersonLivingSubject" type="{urn:hl7-org:v3}COCT_MT080000UV.NonPersonLivingSubject"/&gt;
 *           &lt;element name="specimenPerson" type="{urn:hl7-org:v3}COCT_MT080000UV.Person"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="sourceNatural" type="{urn:hl7-org:v3}COCT_MT080000UV.Natural" minOccurs="0"/&gt;
 *           &lt;element name="sourceManufactured" type="{urn:hl7-org:v3}COCT_MT080000UV.Manufactured" minOccurs="0"/&gt;
 *           &lt;element name="sourceNonPersonLivingSubject" type="{urn:hl7-org:v3}COCT_MT080000UV.NonPersonLivingSubject" minOccurs="0"/&gt;
 *           &lt;element name="sourcePerson" type="{urn:hl7-org:v3}COCT_MT080000UV.Person" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}COCT_MT080000UV.Subject4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}COCT_MT080000UV.Subject3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOf" type="{urn:hl7-org:v3}COCT_MT080000UV.Product" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassSpecimen" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV.Specimen", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "specimenNatural",
    "specimenManufactured",
    "specimenNonPersonLivingSubject",
    "specimenPerson",
    "sourceNatural",
    "sourceManufactured",
    "sourceNonPersonLivingSubject",
    "sourcePerson",
    "subjectOf1",
    "subjectOf2",
    "productOf"
})
public class COCTMT080000UVSpecimen {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected CE code;
    protected COCTMT080000UVNatural specimenNatural;
    protected COCTMT080000UVManufactured specimenManufactured;
    protected COCTMT080000UVNonPersonLivingSubject specimenNonPersonLivingSubject;
    protected COCTMT080000UVPerson specimenPerson;
    @XmlElementRef(name = "sourceNatural", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVNatural> sourceNatural;
    @XmlElementRef(name = "sourceManufactured", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVManufactured> sourceManufactured;
    @XmlElementRef(name = "sourceNonPersonLivingSubject", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVNonPersonLivingSubject> sourceNonPersonLivingSubject;
    @XmlElementRef(name = "sourcePerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVPerson> sourcePerson;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSubject4> subjectOf1;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSubject3> subjectOf2;
    @XmlElementRef(name = "productOf", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVProduct> productOf;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassSpecimen classCode;

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
     * Ruft den Wert der specimenNatural-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT080000UVNatural }
     *     
     */
    public COCTMT080000UVNatural getSpecimenNatural() {
        return specimenNatural;
    }

    /**
     * Legt den Wert der specimenNatural-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT080000UVNatural }
     *     
     */
    public void setSpecimenNatural(COCTMT080000UVNatural value) {
        this.specimenNatural = value;
    }

    /**
     * Ruft den Wert der specimenManufactured-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT080000UVManufactured }
     *     
     */
    public COCTMT080000UVManufactured getSpecimenManufactured() {
        return specimenManufactured;
    }

    /**
     * Legt den Wert der specimenManufactured-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT080000UVManufactured }
     *     
     */
    public void setSpecimenManufactured(COCTMT080000UVManufactured value) {
        this.specimenManufactured = value;
    }

    /**
     * Ruft den Wert der specimenNonPersonLivingSubject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT080000UVNonPersonLivingSubject }
     *     
     */
    public COCTMT080000UVNonPersonLivingSubject getSpecimenNonPersonLivingSubject() {
        return specimenNonPersonLivingSubject;
    }

    /**
     * Legt den Wert der specimenNonPersonLivingSubject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT080000UVNonPersonLivingSubject }
     *     
     */
    public void setSpecimenNonPersonLivingSubject(COCTMT080000UVNonPersonLivingSubject value) {
        this.specimenNonPersonLivingSubject = value;
    }

    /**
     * Ruft den Wert der specimenPerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT080000UVPerson }
     *     
     */
    public COCTMT080000UVPerson getSpecimenPerson() {
        return specimenPerson;
    }

    /**
     * Legt den Wert der specimenPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT080000UVPerson }
     *     
     */
    public void setSpecimenPerson(COCTMT080000UVPerson value) {
        this.specimenPerson = value;
    }

    /**
     * Ruft den Wert der sourceNatural-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVNatural }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVNatural> getSourceNatural() {
        return sourceNatural;
    }

    /**
     * Legt den Wert der sourceNatural-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVNatural }{@code >}
     *     
     */
    public void setSourceNatural(JAXBElement<COCTMT080000UVNatural> value) {
        this.sourceNatural = value;
    }

    /**
     * Ruft den Wert der sourceManufactured-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVManufactured }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVManufactured> getSourceManufactured() {
        return sourceManufactured;
    }

    /**
     * Legt den Wert der sourceManufactured-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVManufactured }{@code >}
     *     
     */
    public void setSourceManufactured(JAXBElement<COCTMT080000UVManufactured> value) {
        this.sourceManufactured = value;
    }

    /**
     * Ruft den Wert der sourceNonPersonLivingSubject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVNonPersonLivingSubject }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVNonPersonLivingSubject> getSourceNonPersonLivingSubject() {
        return sourceNonPersonLivingSubject;
    }

    /**
     * Legt den Wert der sourceNonPersonLivingSubject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVNonPersonLivingSubject }{@code >}
     *     
     */
    public void setSourceNonPersonLivingSubject(JAXBElement<COCTMT080000UVNonPersonLivingSubject> value) {
        this.sourceNonPersonLivingSubject = value;
    }

    /**
     * Ruft den Wert der sourcePerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVPerson }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVPerson> getSourcePerson() {
        return sourcePerson;
    }

    /**
     * Legt den Wert der sourcePerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVPerson }{@code >}
     *     
     */
    public void setSourcePerson(JAXBElement<COCTMT080000UVPerson> value) {
        this.sourcePerson = value;
    }

    /**
     * Gets the value of the subjectOf1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVSubject4 }
     * 
     * 
     */
    public List<COCTMT080000UVSubject4> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<COCTMT080000UVSubject4>();
        }
        return this.subjectOf1;
    }

    /**
     * Gets the value of the subjectOf2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVSubject3 }
     * 
     * 
     */
    public List<COCTMT080000UVSubject3> getSubjectOf2() {
        if (subjectOf2 == null) {
            subjectOf2 = new ArrayList<COCTMT080000UVSubject3>();
        }
        return this.subjectOf2;
    }

    /**
     * Ruft den Wert der productOf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVProduct }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVProduct> getProductOf() {
        return productOf;
    }

    /**
     * Legt den Wert der productOf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVProduct }{@code >}
     *     
     */
    public void setProductOf(JAXBElement<COCTMT080000UVProduct> value) {
        this.productOf = value;
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
     *     {@link RoleClassSpecimen }
     *     
     */
    public RoleClassSpecimen getClassCode() {
        return classCode;
    }

    /**
     * Legt den Wert der classCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassSpecimen }
     *     
     */
    public void setClassCode(RoleClassSpecimen value) {
        this.classCode = value;
    }

}
