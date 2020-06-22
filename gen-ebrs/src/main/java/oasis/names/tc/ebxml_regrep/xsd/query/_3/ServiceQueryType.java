
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für ServiceQueryType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ServiceQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ServiceBindingQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceQueryType", propOrder = {
    "serviceBindingQuery"
})
public class ServiceQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ServiceBindingQuery")
    protected List<ServiceBindingQueryType> serviceBindingQuery;

    /**
     * Gets the value of the serviceBindingQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceBindingQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceBindingQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceBindingQueryType }
     *
     *
     */
    public List<ServiceBindingQueryType> getServiceBindingQuery() {
        if (serviceBindingQuery == null) {
            serviceBindingQuery = new ArrayList<ServiceBindingQueryType>();
        }
        return this.serviceBindingQuery;
    }

}
