
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für FilterType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="negate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType")
@XmlSeeAlso({
    CompoundFilterType.class,
    SimpleFilterType.class
})
public class FilterType {

    @XmlAttribute(name = "negate")
    protected Boolean negate;

    /**
     * Ruft den Wert der negate-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isNegate() {
        if (negate == null) {
            return false;
        } else {
            return negate;
        }
    }

    /**
     * Legt den Wert der negate-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNegate(Boolean value) {
        this.negate = value;
    }

}
