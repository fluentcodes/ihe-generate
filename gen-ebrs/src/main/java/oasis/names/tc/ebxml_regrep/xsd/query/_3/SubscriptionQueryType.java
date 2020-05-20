
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubscriptionQueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectorQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}AdhocQueryQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionQueryType", propOrder = {
    "selectorQuery"
})
public class SubscriptionQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "SelectorQuery")
    protected AdhocQueryQueryType selectorQuery;

    /**
     * Ruft den Wert der selectorQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdhocQueryQueryType }
     *     
     */
    public AdhocQueryQueryType getSelectorQuery() {
        return selectorQuery;
    }

    /**
     * Legt den Wert der selectorQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQueryQueryType }
     *     
     */
    public void setSelectorQuery(AdhocQueryQueryType value) {
        this.selectorQuery = value;
    }

}
