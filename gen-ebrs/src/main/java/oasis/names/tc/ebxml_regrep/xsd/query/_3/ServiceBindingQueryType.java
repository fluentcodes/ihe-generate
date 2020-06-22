
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für ServiceBindingQueryType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ServiceBindingQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ServiceQuery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}SpecificationLinkQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TargetBindingQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ServiceBindingQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBindingQueryType", propOrder = {
    "serviceQuery",
    "specificationLinkQuery",
    "targetBindingQuery"
})
public class ServiceBindingQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ServiceQuery")
    protected ServiceQueryType serviceQuery;
    @XmlElement(name = "SpecificationLinkQuery")
    protected List<SpecificationLinkQueryType> specificationLinkQuery;
    @XmlElement(name = "TargetBindingQuery")
    protected ServiceBindingQueryType targetBindingQuery;

    /**
     * Ruft den Wert der serviceQuery-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ServiceQueryType }
     *
     */
    public ServiceQueryType getServiceQuery() {
        return serviceQuery;
    }

    /**
     * Legt den Wert der serviceQuery-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceQueryType }
     *
     */
    public void setServiceQuery(ServiceQueryType value) {
        this.serviceQuery = value;
    }

    /**
     * Gets the value of the specificationLinkQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificationLinkQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificationLinkQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationLinkQueryType }
     *
     *
     */
    public List<SpecificationLinkQueryType> getSpecificationLinkQuery() {
        if (specificationLinkQuery == null) {
            specificationLinkQuery = new ArrayList<SpecificationLinkQueryType>();
        }
        return this.specificationLinkQuery;
    }

    /**
     * Ruft den Wert der targetBindingQuery-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ServiceBindingQueryType }
     *
     */
    public ServiceBindingQueryType getTargetBindingQuery() {
        return targetBindingQuery;
    }

    /**
     * Legt den Wert der targetBindingQuery-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceBindingQueryType }
     *
     */
    public void setTargetBindingQuery(ServiceBindingQueryType value) {
        this.targetBindingQuery = value;
    }

}
