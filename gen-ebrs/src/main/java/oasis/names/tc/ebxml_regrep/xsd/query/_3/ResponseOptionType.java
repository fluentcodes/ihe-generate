
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für ResponseOptionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="returnType" default="RegistryObject"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName"&gt;
 *             &lt;enumeration value="ObjectRef"/&gt;
 *             &lt;enumeration value="RegistryObject"/&gt;
 *             &lt;enumeration value="LeafClass"/&gt;
 *             &lt;enumeration value="LeafClassWithRepositoryItem"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="returnComposedObjects" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseOptionType")
public class ResponseOptionType {

    @XmlAttribute(name = "returnType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String returnType;
    @XmlAttribute(name = "returnComposedObjects")
    protected Boolean returnComposedObjects;

    /**
     * Ruft den Wert der returnType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        if (returnType == null) {
            return "RegistryObject";
        } else {
            return returnType;
        }
    }

    /**
     * Legt den Wert der returnType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

    /**
     * Ruft den Wert der returnComposedObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnComposedObjects() {
        if (returnComposedObjects == null) {
            return false;
        } else {
            return returnComposedObjects;
        }
    }

    /**
     * Legt den Wert der returnComposedObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnComposedObjects(Boolean value) {
        this.returnComposedObjects = value;
    }

}
