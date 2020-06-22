
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für RegistryObjectQueryType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RegistryObjectQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SlotBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}SlotBranchType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NameBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}InternationalStringBranchType" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}InternationalStringBranchType" minOccurs="0"/&gt;
 *         &lt;element name="VersionInfoFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ExternalIdentifierQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ObjectTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *         &lt;element name="StatusQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *         &lt;element name="SourceAssociationQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}AssociationQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TargetAssociationQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}AssociationQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryObjectQueryType", propOrder = {
    "slotBranch",
    "nameBranch",
    "descriptionBranch",
    "versionInfoFilter",
    "classificationQuery",
    "externalIdentifierQuery",
    "objectTypeQuery",
    "statusQuery",
    "sourceAssociationQuery",
    "targetAssociationQuery"
})
@XmlSeeAlso({
    AssociationQueryType.class,
    AuditableEventQueryType.class,
    ClassificationQueryType.class,
    ClassificationNodeQueryType.class,
    ClassificationSchemeQueryType.class,
    ExternalIdentifierQueryType.class,
    ExternalLinkQueryType.class,
    ExtrinsicObjectQueryType.class,
    OrganizationQueryType.class,
    RegistryPackageQueryType.class,
    ServiceQueryType.class,
    ServiceBindingQueryType.class,
    SpecificationLinkQueryType.class,
    PersonQueryType.class,
    RegistryQueryType.class,
    FederationQueryType.class,
    AdhocQueryQueryType.class,
    NotificationQueryType.class,
    SubscriptionQueryType.class
})
public class RegistryObjectQueryType
    extends FilterQueryType
{

    @XmlElement(name = "SlotBranch")
    protected List<SlotBranchType> slotBranch;
    @XmlElement(name = "NameBranch")
    protected InternationalStringBranchType nameBranch;
    @XmlElement(name = "DescriptionBranch")
    protected InternationalStringBranchType descriptionBranch;
    @XmlElement(name = "VersionInfoFilter")
    protected FilterType versionInfoFilter;
    @XmlElement(name = "ClassificationQuery")
    protected List<ClassificationQueryType> classificationQuery;
    @XmlElement(name = "ExternalIdentifierQuery")
    protected List<ExternalIdentifierQueryType> externalIdentifierQuery;
    @XmlElement(name = "ObjectTypeQuery")
    protected ClassificationNodeQueryType objectTypeQuery;
    @XmlElement(name = "StatusQuery")
    protected ClassificationNodeQueryType statusQuery;
    @XmlElement(name = "SourceAssociationQuery")
    protected List<AssociationQueryType> sourceAssociationQuery;
    @XmlElement(name = "TargetAssociationQuery")
    protected List<AssociationQueryType> targetAssociationQuery;

    /**
     * Gets the value of the slotBranch property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slotBranch property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlotBranch().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlotBranchType }
     *
     *
     */
    public List<SlotBranchType> getSlotBranch() {
        if (slotBranch == null) {
            slotBranch = new ArrayList<SlotBranchType>();
        }
        return this.slotBranch;
    }

    /**
     * Ruft den Wert der nameBranch-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link InternationalStringBranchType }
     *
     */
    public InternationalStringBranchType getNameBranch() {
        return nameBranch;
    }

    /**
     * Legt den Wert der nameBranch-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link InternationalStringBranchType }
     *
     */
    public void setNameBranch(InternationalStringBranchType value) {
        this.nameBranch = value;
    }

    /**
     * Ruft den Wert der descriptionBranch-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link InternationalStringBranchType }
     *
     */
    public InternationalStringBranchType getDescriptionBranch() {
        return descriptionBranch;
    }

    /**
     * Legt den Wert der descriptionBranch-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link InternationalStringBranchType }
     *
     */
    public void setDescriptionBranch(InternationalStringBranchType value) {
        this.descriptionBranch = value;
    }

    /**
     * Ruft den Wert der versionInfoFilter-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link FilterType }
     *
     */
    public FilterType getVersionInfoFilter() {
        return versionInfoFilter;
    }

    /**
     * Legt den Wert der versionInfoFilter-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *
     */
    public void setVersionInfoFilter(FilterType value) {
        this.versionInfoFilter = value;
    }

    /**
     * Gets the value of the classificationQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationQueryType }
     *
     *
     */
    public List<ClassificationQueryType> getClassificationQuery() {
        if (classificationQuery == null) {
            classificationQuery = new ArrayList<ClassificationQueryType>();
        }
        return this.classificationQuery;
    }

    /**
     * Gets the value of the externalIdentifierQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalIdentifierQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalIdentifierQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalIdentifierQueryType }
     *
     *
     */
    public List<ExternalIdentifierQueryType> getExternalIdentifierQuery() {
        if (externalIdentifierQuery == null) {
            externalIdentifierQuery = new ArrayList<ExternalIdentifierQueryType>();
        }
        return this.externalIdentifierQuery;
    }

    /**
     * Ruft den Wert der objectTypeQuery-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *
     */
    public ClassificationNodeQueryType getObjectTypeQuery() {
        return objectTypeQuery;
    }

    /**
     * Legt den Wert der objectTypeQuery-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *
     */
    public void setObjectTypeQuery(ClassificationNodeQueryType value) {
        this.objectTypeQuery = value;
    }

    /**
     * Ruft den Wert der statusQuery-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *
     */
    public ClassificationNodeQueryType getStatusQuery() {
        return statusQuery;
    }

    /**
     * Legt den Wert der statusQuery-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *
     */
    public void setStatusQuery(ClassificationNodeQueryType value) {
        this.statusQuery = value;
    }

    /**
     * Gets the value of the sourceAssociationQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceAssociationQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceAssociationQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationQueryType }
     *
     *
     */
    public List<AssociationQueryType> getSourceAssociationQuery() {
        if (sourceAssociationQuery == null) {
            sourceAssociationQuery = new ArrayList<AssociationQueryType>();
        }
        return this.sourceAssociationQuery;
    }

    /**
     * Gets the value of the targetAssociationQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetAssociationQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetAssociationQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationQueryType }
     *
     *
     */
    public List<AssociationQueryType> getTargetAssociationQuery() {
        if (targetAssociationQuery == null) {
            targetAssociationQuery = new ArrayList<AssociationQueryType>();
        }
        return this.targetAssociationQuery;
    }

}
