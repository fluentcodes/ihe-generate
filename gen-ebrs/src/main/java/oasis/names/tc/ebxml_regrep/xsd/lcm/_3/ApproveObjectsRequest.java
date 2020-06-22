
package oasis.names.tc.ebxml_regrep.xsd.lcm._3;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.AdhocQueryType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectRefListType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryRequestType;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}AdhocQuery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adhocQuery",
    "objectRefList"
})
@XmlRootElement(name = "ApproveObjectsRequest")
public class ApproveObjectsRequest
    extends RegistryRequestType
{

    @XmlElement(name = "AdhocQuery", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0")
    protected AdhocQueryType adhocQuery;
    @XmlElement(name = "ObjectRefList", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0")
    protected ObjectRefListType objectRefList;

    /**
     * Ruft den Wert der adhocQuery-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AdhocQueryType }
     *
     */
    public AdhocQueryType getAdhocQuery() {
        return adhocQuery;
    }

    /**
     * Legt den Wert der adhocQuery-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AdhocQueryType }
     *
     */
    public void setAdhocQuery(AdhocQueryType value) {
        this.adhocQuery = value;
    }

    /**
     * Ruft den Wert der objectRefList-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ObjectRefListType }
     *
     */
    public ObjectRefListType getObjectRefList() {
        return objectRefList;
    }

    /**
     * Legt den Wert der objectRefList-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ObjectRefListType }
     *
     */
    public void setObjectRefList(ObjectRefListType value) {
        this.objectRefList = value;
    }

}
