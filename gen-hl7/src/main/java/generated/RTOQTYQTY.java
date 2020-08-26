
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RTO_QTY_QTY complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RTO_QTY_QTY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}QTY"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numerator" type="{}QTY"/&gt;
 *         &lt;element name="denominator" type="{}QTY"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTO_QTY_QTY", propOrder = {
    "numerator",
    "denominator"
})
@XmlSeeAlso({
    RTO.class
})
public class RTOQTYQTY
    extends QTY
{

    @XmlElement(required = true)
    protected QTY numerator;
    @XmlElement(required = true)
    protected QTY denominator;

    /**
     * Ruft den Wert der numerator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getNumerator() {
        return numerator;
    }

    /**
     * Legt den Wert der numerator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setNumerator(QTY value) {
        this.numerator = value;
    }

    /**
     * Ruft den Wert der denominator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getDenominator() {
        return denominator;
    }

    /**
     * Legt den Wert der denominator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setDenominator(QTY value) {
        this.denominator = value;
    }

}
