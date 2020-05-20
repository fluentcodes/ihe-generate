
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       A registry query.
 *       A QueryExpression child element is not required when invoking a stored query.
 *       
 * 
 * <p>Java-Klasse für AdhocQueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AdhocQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}QueryExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocQueryType", propOrder = {
    "queryExpression"
})
public class AdhocQueryType
    extends RegistryObjectType
{

    @XmlElement(name = "QueryExpression")
    protected QueryExpressionType queryExpression;

    /**
     * Ruft den Wert der queryExpression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getQueryExpression() {
        return queryExpression;
    }

    /**
     * Legt den Wert der queryExpression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setQueryExpression(QueryExpressionType value) {
        this.queryExpression = value;
    }

}
