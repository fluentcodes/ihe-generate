
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Fractional numbers. Typically used whenever quantities
 *             are measured, estimated, or computed from other real
 *             numbers.  The typical representation is decimal, where
 *             the number of significant decimal digits is known as the
 *             precision. Real numbers are needed beyond integers
 *             whenever quantities of the real world are measured,
 *             estimated, or computed from other real numbers. The term
 *             "Real number" in this specification is used to mean
 *             that fractional values are covered without necessarily
 *             implying the full set of the mathematical real numbers.
 *          
 * 
 * <p>Java-Klasse für REAL complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="REAL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}QTY"&gt;
 *       &lt;attribute name="value" type="{}real" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REAL")
@XmlSeeAlso({
    SXCMREAL.class,
    IVXBREAL.class
})
public class REAL
    extends QTY
{

    @XmlAttribute(name = "value")
    protected String value;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
