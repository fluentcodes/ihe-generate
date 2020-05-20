
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
 * <p>Java-Klasse für COCT_MT960000UV05.Position complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT960000UV05.Position"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/&gt;
 *         &lt;element name="text" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="activityTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{urn:hl7-org:v3}ST" minOccurs="0"/&gt;
 *         &lt;element name="device" type="{urn:hl7-org:v3}COCT_MT960000UV05.Device2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}COCT_MT960000UV05.Author" minOccurs="0"/&gt;
 *         &lt;element name="component1" type="{urn:hl7-org:v3}COCT_MT960000UV05.Component1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="component2" type="{urn:hl7-org:v3}COCT_MT960000UV05.Component2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClassPosition" /&gt;
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}ActMood" fixed="EVN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT960000UV05.Position", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "text",
    "effectiveTime",
    "activityTime",
    "value",
    "device",
    "author",
    "component1",
    "component2"
})
public class COCTMT960000UV05Position {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    @XmlElement(required = true)
    protected CE code;
    protected ED text;
    protected IVLTS effectiveTime;
    protected IVLTS activityTime;
    protected ST value;
    @XmlElement(nillable = true)
    protected List<COCTMT960000UV05Device2> device;
    @XmlElementRef(name = "author", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT960000UV05Author> author;
    @XmlElement(nillable = true)
    protected List<COCTMT960000UV05Component1> component1;
    @XmlElementRef(name = "component2", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT960000UV05Component2> component2;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected ActClassPosition classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected List<String> moodCode;

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
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setText(ED value) {
        this.text = value;
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
     * Ruft den Wert der activityTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getActivityTime() {
        return activityTime;
    }

    /**
     * Legt den Wert der activityTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setActivityTime(IVLTS value) {
        this.activityTime = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setValue(ST value) {
        this.value = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT960000UV05Device2 }
     * 
     * 
     */
    public List<COCTMT960000UV05Device2> getDevice() {
        if (device == null) {
            device = new ArrayList<COCTMT960000UV05Device2>();
        }
        return this.device;
    }

    /**
     * Ruft den Wert der author-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT960000UV05Author }{@code >}
     *     
     */
    public JAXBElement<COCTMT960000UV05Author> getAuthor() {
        return author;
    }

    /**
     * Legt den Wert der author-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT960000UV05Author }{@code >}
     *     
     */
    public void setAuthor(JAXBElement<COCTMT960000UV05Author> value) {
        this.author = value;
    }

    /**
     * Gets the value of the component1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT960000UV05Component1 }
     * 
     * 
     */
    public List<COCTMT960000UV05Component1> getComponent1() {
        if (component1 == null) {
            component1 = new ArrayList<COCTMT960000UV05Component1>();
        }
        return this.component1;
    }

    /**
     * Ruft den Wert der component2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT960000UV05Component2 }{@code >}
     *     
     */
    public JAXBElement<COCTMT960000UV05Component2> getComponent2() {
        return component2;
    }

    /**
     * Legt den Wert der component2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT960000UV05Component2 }{@code >}
     *     
     */
    public void setComponent2(JAXBElement<COCTMT960000UV05Component2> value) {
        this.component2 = value;
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
     *     {@link ActClassPosition }
     *     
     */
    public ActClassPosition getClassCode() {
        return classCode;
    }

    /**
     * Legt den Wert der classCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassPosition }
     *     
     */
    public void setClassCode(ActClassPosition value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMoodCode() {
        if (moodCode == null) {
            moodCode = new ArrayList<String>();
        }
        return this.moodCode;
    }

}
