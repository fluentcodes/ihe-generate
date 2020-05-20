
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RegistryQueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegistryQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperatorQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}OrganizationQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryQueryType", propOrder = {
    "operatorQuery"
})
public class RegistryQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "OperatorQuery")
    protected OrganizationQueryType operatorQuery;

    /**
     * Ruft den Wert der operatorQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQueryType }
     *     
     */
    public OrganizationQueryType getOperatorQuery() {
        return operatorQuery;
    }

    /**
     * Legt den Wert der operatorQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQueryType }
     *     
     */
    public void setOperatorQuery(OrganizationQueryType value) {
        this.operatorQuery = value;
    }

}
