
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
 * <p>Java-Klasse für PRPA_MT201306UV02.QueryByParameter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201306UV02.QueryByParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="queryId" type="{urn:hl7-org:v3}II"/&gt;
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS"/&gt;
 *         &lt;element name="modifyCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="responseElementGroupId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responseModalityCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="responsePriorityCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="initialQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="initialQuantityCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="executionAndDeliveryTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/&gt;
 *         &lt;element name="matchCriterionList" type="{urn:hl7-org:v3}PRPA_MT201306UV02.MatchCriterionList" minOccurs="0"/&gt;
 *         &lt;element name="parameterList" type="{urn:hl7-org:v3}PRPA_MT201306UV02.ParameterList"/&gt;
 *         &lt;element name="sortControl" type="{urn:hl7-org:v3}PRPA_MT201306UV02.SortControl" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PRPA_MT201306UV02.QueryByParameter", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "queryId",
    "statusCode",
    "modifyCode",
    "responseElementGroupId",
    "responseModalityCode",
    "responsePriorityCode",
    "initialQuantity",
    "initialQuantityCode",
    "executionAndDeliveryTime",
    "matchCriterionList",
    "parameterList",
    "sortControl"
})
public class PRPAMT201306UV02QueryByParameter {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II queryId;
    @XmlElement(required = true)
    protected CS statusCode;
    protected CS modifyCode;
    protected List<II> responseElementGroupId;
    protected CS responseModalityCode;
    protected CS responsePriorityCode;
    protected INT initialQuantity;
    protected CE initialQuantityCode;
    protected TS executionAndDeliveryTime;
    @XmlElementRef(name = "matchCriterionList", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPAMT201306UV02MatchCriterionList> matchCriterionList;
    @XmlElement(required = true)
    protected PRPAMT201306UV02ParameterList parameterList;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02SortControl> sortControl;
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
     * Ruft den Wert der modifyCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getModifyCode() {
        return modifyCode;
    }

    /**
     * Legt den Wert der modifyCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setModifyCode(CS value) {
        this.modifyCode = value;
    }

    /**
     * Gets the value of the responseElementGroupId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseElementGroupId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseElementGroupId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getResponseElementGroupId() {
        if (responseElementGroupId == null) {
            responseElementGroupId = new ArrayList<II>();
        }
        return this.responseElementGroupId;
    }

    /**
     * Ruft den Wert der responseModalityCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getResponseModalityCode() {
        return responseModalityCode;
    }

    /**
     * Legt den Wert der responseModalityCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setResponseModalityCode(CS value) {
        this.responseModalityCode = value;
    }

    /**
     * Ruft den Wert der responsePriorityCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getResponsePriorityCode() {
        return responsePriorityCode;
    }

    /**
     * Legt den Wert der responsePriorityCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setResponsePriorityCode(CS value) {
        this.responsePriorityCode = value;
    }

    /**
     * Ruft den Wert der initialQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getInitialQuantity() {
        return initialQuantity;
    }

    /**
     * Legt den Wert der initialQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setInitialQuantity(INT value) {
        this.initialQuantity = value;
    }

    /**
     * Ruft den Wert der initialQuantityCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getInitialQuantityCode() {
        return initialQuantityCode;
    }

    /**
     * Legt den Wert der initialQuantityCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setInitialQuantityCode(CE value) {
        this.initialQuantityCode = value;
    }

    /**
     * Ruft den Wert der executionAndDeliveryTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getExecutionAndDeliveryTime() {
        return executionAndDeliveryTime;
    }

    /**
     * Legt den Wert der executionAndDeliveryTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setExecutionAndDeliveryTime(TS value) {
        this.executionAndDeliveryTime = value;
    }

    /**
     * Ruft den Wert der matchCriterionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MatchCriterionList }{@code >}
     *     
     */
    public JAXBElement<PRPAMT201306UV02MatchCriterionList> getMatchCriterionList() {
        return matchCriterionList;
    }

    /**
     * Legt den Wert der matchCriterionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MatchCriterionList }{@code >}
     *     
     */
    public void setMatchCriterionList(JAXBElement<PRPAMT201306UV02MatchCriterionList> value) {
        this.matchCriterionList = value;
    }

    /**
     * Ruft den Wert der parameterList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PRPAMT201306UV02ParameterList }
     *     
     */
    public PRPAMT201306UV02ParameterList getParameterList() {
        return parameterList;
    }

    /**
     * Legt den Wert der parameterList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAMT201306UV02ParameterList }
     *     
     */
    public void setParameterList(PRPAMT201306UV02ParameterList value) {
        this.parameterList = value;
    }

    /**
     * Gets the value of the sortControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02SortControl }
     * 
     * 
     */
    public List<PRPAMT201306UV02SortControl> getSortControl() {
        if (sortControl == null) {
            sortControl = new ArrayList<PRPAMT201306UV02SortControl>();
        }
        return this.sortControl;
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
