
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectListType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryResponseType;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectList"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="startIndex" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute name="totalResultCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registryObjectList"
})
@XmlRootElement(name = "AdhocQueryResponse")
public class AdhocQueryResponse
    extends RegistryResponseType
{

    @XmlElement(name = "RegistryObjectList", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", required = true)
    protected RegistryObjectListType registryObjectList;
    @XmlAttribute(name = "startIndex")
    protected BigInteger startIndex;
    @XmlAttribute(name = "totalResultCount")
    protected BigInteger totalResultCount;

    /**
     * Ruft den Wert der registryObjectList-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *
     */
    public RegistryObjectListType getRegistryObjectList() {
        return registryObjectList;
    }

    /**
     * Legt den Wert der registryObjectList-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *
     */
    public void setRegistryObjectList(RegistryObjectListType value) {
        this.registryObjectList = value;
    }

    /**
     * Ruft den Wert der startIndex-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getStartIndex() {
        if (startIndex == null) {
            return new BigInteger("0");
        } else {
            return startIndex;
        }
    }

    /**
     * Legt den Wert der startIndex-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setStartIndex(BigInteger value) {
        this.startIndex = value;
    }

    /**
     * Ruft den Wert der totalResultCount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getTotalResultCount() {
        return totalResultCount;
    }

    /**
     * Legt den Wert der totalResultCount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setTotalResultCount(BigInteger value) {
        this.totalResultCount = value;
    }

}
