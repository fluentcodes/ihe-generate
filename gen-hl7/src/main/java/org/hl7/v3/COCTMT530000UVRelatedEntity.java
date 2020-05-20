
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für COCT_MT530000UV.RelatedEntity complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT530000UV.RelatedEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="addr" type="{urn:hl7-org:v3}AD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}TEL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;choice&gt;
 *             &lt;element name="relatedPerson" type="{urn:hl7-org:v3}COCT_MT530000UV.Person" minOccurs="0"/&gt;
 *             &lt;element name="relatedAnimal" type="{urn:hl7-org:v3}COCT_MT530000UV.Animal" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="relatedEntity" type="{urn:hl7-org:v3}COCT_MT530000UV.Entity" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;choice&gt;
 *             &lt;element name="scopingPerson" type="{urn:hl7-org:v3}COCT_MT530000UV.Person" minOccurs="0"/&gt;
 *             &lt;element name="scopingAnimal" type="{urn:hl7-org:v3}COCT_MT530000UV.Animal" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="scopingEntity" type="{urn:hl7-org:v3}COCT_MT530000UV.Entity" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassMutualRelationship" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT530000UV.RelatedEntity", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "addr",
    "telecom",
    "relatedPerson",
    "relatedAnimal",
    "relatedEntity",
    "scopingPerson",
    "scopingAnimal",
    "scopingEntity"
})
public class COCTMT530000UVRelatedEntity {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    protected CE code;
    protected List<AD> addr;
    protected List<TEL> telecom;
    @XmlElementRef(name = "relatedPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVPerson> relatedPerson;
    @XmlElementRef(name = "relatedAnimal", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVAnimal> relatedAnimal;
    @XmlElementRef(name = "relatedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVEntity> relatedEntity;
    @XmlElementRef(name = "scopingPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVPerson> scopingPerson;
    @XmlElementRef(name = "scopingAnimal", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVAnimal> scopingAnimal;
    @XmlElementRef(name = "scopingEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVEntity> scopingEntity;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected List<String> classCode;

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
     * Ruft den Wert der relatedPerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVPerson }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVPerson> getRelatedPerson() {
        return relatedPerson;
    }

    /**
     * Legt den Wert der relatedPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVPerson }{@code >}
     *     
     */
    public void setRelatedPerson(JAXBElement<COCTMT530000UVPerson> value) {
        this.relatedPerson = value;
    }

    /**
     * Ruft den Wert der relatedAnimal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVAnimal }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVAnimal> getRelatedAnimal() {
        return relatedAnimal;
    }

    /**
     * Legt den Wert der relatedAnimal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVAnimal }{@code >}
     *     
     */
    public void setRelatedAnimal(JAXBElement<COCTMT530000UVAnimal> value) {
        this.relatedAnimal = value;
    }

    /**
     * Ruft den Wert der relatedEntity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVEntity }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVEntity> getRelatedEntity() {
        return relatedEntity;
    }

    /**
     * Legt den Wert der relatedEntity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVEntity }{@code >}
     *     
     */
    public void setRelatedEntity(JAXBElement<COCTMT530000UVEntity> value) {
        this.relatedEntity = value;
    }

    /**
     * Ruft den Wert der scopingPerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVPerson }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVPerson> getScopingPerson() {
        return scopingPerson;
    }

    /**
     * Legt den Wert der scopingPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVPerson }{@code >}
     *     
     */
    public void setScopingPerson(JAXBElement<COCTMT530000UVPerson> value) {
        this.scopingPerson = value;
    }

    /**
     * Ruft den Wert der scopingAnimal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVAnimal }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVAnimal> getScopingAnimal() {
        return scopingAnimal;
    }

    /**
     * Legt den Wert der scopingAnimal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVAnimal }{@code >}
     *     
     */
    public void setScopingAnimal(JAXBElement<COCTMT530000UVAnimal> value) {
        this.scopingAnimal = value;
    }

    /**
     * Ruft den Wert der scopingEntity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVEntity }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVEntity> getScopingEntity() {
        return scopingEntity;
    }

    /**
     * Legt den Wert der scopingEntity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVEntity }{@code >}
     *     
     */
    public void setScopingEntity(JAXBElement<COCTMT530000UVEntity> value) {
        this.scopingEntity = value;
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

}
