
package oasis.names.tc.ebxml_regrep.xsd.lcm._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.AdhocQueryType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectRefType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryRequestType;


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
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}AdhocQuery"/&gt;
 *         &lt;element name="SourceRegistry" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="DestinationRegistry" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="OwnerAtSource" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="OwnerAtDestination" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
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
    "sourceRegistry",
    "destinationRegistry",
    "ownerAtSource",
    "ownerAtDestination"
})
@XmlRootElement(name = "RelocateObjectsRequest")
public class RelocateObjectsRequest
    extends RegistryRequestType
{

    @XmlElement(name = "AdhocQuery", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", required = true)
    protected AdhocQueryType adhocQuery;
    @XmlElement(name = "SourceRegistry", required = true)
    protected ObjectRefType sourceRegistry;
    @XmlElement(name = "DestinationRegistry", required = true)
    protected ObjectRefType destinationRegistry;
    @XmlElement(name = "OwnerAtSource", required = true)
    protected ObjectRefType ownerAtSource;
    @XmlElement(name = "OwnerAtDestination", required = true)
    protected ObjectRefType ownerAtDestination;

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
     * Ruft den Wert der sourceRegistry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getSourceRegistry() {
        return sourceRegistry;
    }

    /**
     * Legt den Wert der sourceRegistry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setSourceRegistry(ObjectRefType value) {
        this.sourceRegistry = value;
    }

    /**
     * Ruft den Wert der destinationRegistry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getDestinationRegistry() {
        return destinationRegistry;
    }

    /**
     * Legt den Wert der destinationRegistry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setDestinationRegistry(ObjectRefType value) {
        this.destinationRegistry = value;
    }

    /**
     * Ruft den Wert der ownerAtSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getOwnerAtSource() {
        return ownerAtSource;
    }

    /**
     * Legt den Wert der ownerAtSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setOwnerAtSource(ObjectRefType value) {
        this.ownerAtSource = value;
    }

    /**
     * Ruft den Wert der ownerAtDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getOwnerAtDestination() {
        return ownerAtDestination;
    }

    /**
     * Legt den Wert der ownerAtDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setOwnerAtDestination(ObjectRefType value) {
        this.ownerAtDestination = value;
    }

}
