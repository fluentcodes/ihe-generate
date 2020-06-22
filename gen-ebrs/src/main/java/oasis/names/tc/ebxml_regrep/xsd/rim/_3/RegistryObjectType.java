
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für RegistryObjectType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RegistryObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}IdentifiableType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Description" minOccurs="0"/&gt;
 *         &lt;element name="VersionInfo" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}VersionInfoType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Classification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ExternalIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lid" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="objectType" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="status" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryObjectType", propOrder = {
    "name",
    "description",
    "versionInfo",
    "classification",
    "externalIdentifier"
})
@XmlSeeAlso({
    ExtrinsicObjectType.class,
    AssociationType1 .class,
    AuditableEventType.class,
    ClassificationType.class,
    ClassificationNodeType.class,
    ClassificationSchemeType.class,
    ExternalIdentifierType.class,
    ExternalLinkType.class,
    OrganizationType.class,
    RegistryPackageType.class,
    ServiceType.class,
    ServiceBindingType.class,
    SpecificationLinkType.class,
    PersonType.class,
    RegistryType.class,
    FederationType.class,
    AdhocQueryType.class,
    NotificationType.class,
    SubscriptionType.class
})
public class RegistryObjectType
    extends IdentifiableType
{

    @XmlElement(name = "Name")
    protected InternationalStringType name;
    @XmlElement(name = "Description")
    protected InternationalStringType description;
    @XmlElement(name = "VersionInfo")
    protected VersionInfoType versionInfo;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;
    @XmlElement(name = "ExternalIdentifier")
    protected List<ExternalIdentifierType> externalIdentifier;
    @XmlAttribute(name = "lid")
    @XmlSchemaType(name = "anyURI")
    protected String lid;
    @XmlAttribute(name = "objectType")
    protected String objectType;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link InternationalStringType }
     *
     */
    public InternationalStringType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link InternationalStringType }
     *
     */
    public void setName(InternationalStringType value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link InternationalStringType }
     *
     */
    public InternationalStringType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link InternationalStringType }
     *
     */
    public void setDescription(InternationalStringType value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der versionInfo-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link VersionInfoType }
     *
     */
    public VersionInfoType getVersionInfo() {
        return versionInfo;
    }

    /**
     * Legt den Wert der versionInfo-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link VersionInfoType }
     *
     */
    public void setVersionInfo(VersionInfoType value) {
        this.versionInfo = value;
    }

    /**
     * Gets the value of the classification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     *
     *
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the externalIdentifier property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalIdentifier property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalIdentifier().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalIdentifierType }
     *
     *
     */
    public List<ExternalIdentifierType> getExternalIdentifier() {
        if (externalIdentifier == null) {
            externalIdentifier = new ArrayList<ExternalIdentifierType>();
        }
        return this.externalIdentifier;
    }

    /**
     * Ruft den Wert der lid-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLid() {
        return lid;
    }

    /**
     * Legt den Wert der lid-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLid(String value) {
        this.lid = value;
    }

    /**
     * Ruft den Wert der objectType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Legt den Wert der objectType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
