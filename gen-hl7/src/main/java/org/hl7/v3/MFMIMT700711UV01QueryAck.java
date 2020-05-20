
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MFMI_MT700711UV01.QueryAck complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MFMI_MT700711UV01.QueryAck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="queryId" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="queryResponseCode" type="{urn:hl7-org:v3}CS"/&gt;
 *         &lt;element name="resultTotalQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="resultCurrentQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="resultRemainingQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MFMI_MT700711UV01.QueryAck", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "queryId",
    "statusCode",
    "queryResponseCode",
    "resultTotalQuantity",
    "resultCurrentQuantity",
    "resultRemainingQuantity"
})
public class MFMIMT700711UV01QueryAck {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II queryId;
    protected CS statusCode;
    @XmlElement(required = true)
    protected CS queryResponseCode;
    protected INT resultTotalQuantity;
    protected INT resultCurrentQuantity;
    protected INT resultRemainingQuantity;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;

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
     * Ruft den Wert der queryId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getQueryId() {
        return queryId;
    }

    /**
     * Legt den Wert der queryId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setQueryId(II value) {
        this.queryId = value;
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
     * Ruft den Wert der queryResponseCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getQueryResponseCode() {
        return queryResponseCode;
    }

    /**
     * Legt den Wert der queryResponseCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setQueryResponseCode(CS value) {
        this.queryResponseCode = value;
    }

    /**
     * Ruft den Wert der resultTotalQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getResultTotalQuantity() {
        return resultTotalQuantity;
    }

    /**
     * Legt den Wert der resultTotalQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setResultTotalQuantity(INT value) {
        this.resultTotalQuantity = value;
    }

    /**
     * Ruft den Wert der resultCurrentQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getResultCurrentQuantity() {
        return resultCurrentQuantity;
    }

    /**
     * Legt den Wert der resultCurrentQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setResultCurrentQuantity(INT value) {
        this.resultCurrentQuantity = value;
    }

    /**
     * Ruft den Wert der resultRemainingQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getResultRemainingQuantity() {
        return resultRemainingQuantity;
    }

    /**
     * Legt den Wert der resultRemainingQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setResultRemainingQuantity(INT value) {
        this.resultRemainingQuantity = value;
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

}
