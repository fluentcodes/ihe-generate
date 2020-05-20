
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AssociationQueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssociationQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociationTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *         &lt;element name="SourceObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/&gt;
 *         &lt;element name="TargetObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationQueryType", propOrder = {
    "associationTypeQuery",
    "sourceObjectQuery",
    "targetObjectQuery"
})
public class AssociationQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AssociationTypeQuery")
    protected ClassificationNodeQueryType associationTypeQuery;
    @XmlElement(name = "SourceObjectQuery")
    protected RegistryObjectQueryType sourceObjectQuery;
    @XmlElement(name = "TargetObjectQuery")
    protected RegistryObjectQueryType targetObjectQuery;

    /**
     * Ruft den Wert der associationTypeQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getAssociationTypeQuery() {
        return associationTypeQuery;
    }

    /**
     * Legt den Wert der associationTypeQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setAssociationTypeQuery(ClassificationNodeQueryType value) {
        this.associationTypeQuery = value;
    }

    /**
     * Ruft den Wert der sourceObjectQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getSourceObjectQuery() {
        return sourceObjectQuery;
    }

    /**
     * Legt den Wert der sourceObjectQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setSourceObjectQuery(RegistryObjectQueryType value) {
        this.sourceObjectQuery = value;
    }

    /**
     * Ruft den Wert der targetObjectQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getTargetObjectQuery() {
        return targetObjectQuery;
    }

    /**
     * Legt den Wert der targetObjectQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setTargetObjectQuery(RegistryObjectQueryType value) {
        this.targetObjectQuery = value;
    }

}
