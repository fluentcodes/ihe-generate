
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SpecificationLinkType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpecificationLinkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}UsageDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}UsageParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="serviceBinding" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="specificationObject" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificationLinkType", propOrder = {
    "usageDescription",
    "usageParameter"
})
public class SpecificationLinkType
    extends RegistryObjectType
{

    @XmlElement(name = "UsageDescription")
    protected InternationalStringType usageDescription;
    @XmlElement(name = "UsageParameter")
    protected List<String> usageParameter;
    @XmlAttribute(name = "serviceBinding", required = true)
    protected String serviceBinding;
    @XmlAttribute(name = "specificationObject", required = true)
    protected String specificationObject;

    /**
     * Ruft den Wert der usageDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringType }
     *     
     */
    public InternationalStringType getUsageDescription() {
        return usageDescription;
    }

    /**
     * Legt den Wert der usageDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringType }
     *     
     */
    public void setUsageDescription(InternationalStringType value) {
        this.usageDescription = value;
    }

    /**
     * Gets the value of the usageParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsageParameter() {
        if (usageParameter == null) {
            usageParameter = new ArrayList<String>();
        }
        return this.usageParameter;
    }

    /**
     * Ruft den Wert der serviceBinding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceBinding() {
        return serviceBinding;
    }

    /**
     * Legt den Wert der serviceBinding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceBinding(String value) {
        this.serviceBinding = value;
    }

    /**
     * Ruft den Wert der specificationObject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationObject() {
        return specificationObject;
    }

    /**
     * Legt den Wert der specificationObject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationObject(String value) {
        this.specificationObject = value;
    }

}
