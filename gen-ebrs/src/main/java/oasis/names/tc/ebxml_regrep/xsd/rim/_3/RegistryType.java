
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Mapping of the same named interface in ebRIM.
 * 
 * <p>Java-Klasse für RegistryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegistryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;attribute name="operator" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="specificationVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="replicationSyncLatency" type="{http://www.w3.org/2001/XMLSchema}duration" default="P1D" /&gt;
 *       &lt;attribute name="catalogingLatency" type="{http://www.w3.org/2001/XMLSchema}duration" default="P1D" /&gt;
 *       &lt;attribute name="conformanceProfile" default="registryLite"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName"&gt;
 *             &lt;enumeration value="registryFull"/&gt;
 *             &lt;enumeration value="registryLite"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryType")
public class RegistryType
    extends RegistryObjectType
{

    @XmlAttribute(name = "operator", required = true)
    protected String operator;
    @XmlAttribute(name = "specificationVersion", required = true)
    protected String specificationVersion;
    @XmlAttribute(name = "replicationSyncLatency")
    protected Duration replicationSyncLatency;
    @XmlAttribute(name = "catalogingLatency")
    protected Duration catalogingLatency;
    @XmlAttribute(name = "conformanceProfile")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conformanceProfile;

    /**
     * Ruft den Wert der operator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Legt den Wert der operator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Ruft den Wert der specificationVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationVersion() {
        return specificationVersion;
    }

    /**
     * Legt den Wert der specificationVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationVersion(String value) {
        this.specificationVersion = value;
    }

    /**
     * Ruft den Wert der replicationSyncLatency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getReplicationSyncLatency() {
        return replicationSyncLatency;
    }

    /**
     * Legt den Wert der replicationSyncLatency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setReplicationSyncLatency(Duration value) {
        this.replicationSyncLatency = value;
    }

    /**
     * Ruft den Wert der catalogingLatency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCatalogingLatency() {
        return catalogingLatency;
    }

    /**
     * Legt den Wert der catalogingLatency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCatalogingLatency(Duration value) {
        this.catalogingLatency = value;
    }

    /**
     * Ruft den Wert der conformanceProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformanceProfile() {
        if (conformanceProfile == null) {
            return "registryLite";
        } else {
            return conformanceProfile;
        }
    }

    /**
     * Legt den Wert der conformanceProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformanceProfile(String value) {
        this.conformanceProfile = value;
    }

}
