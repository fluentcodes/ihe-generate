
package org.hl7.v3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BXIT_CD complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BXIT_CD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}CD"&gt;
 *       &lt;attribute name="qty" type="{urn:hl7-org:v3}int" default="1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BXIT_CD")
public class BXITCD
    extends CD
{

    @XmlAttribute(name = "qty")
    protected BigInteger qty;

    /**
     * Ruft den Wert der qty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQty() {
        if (qty == null) {
            return new BigInteger("1");
        } else {
            return qty;
        }
    }

    /**
     * Legt den Wert der qty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQty(BigInteger value) {
        this.qty = value;
    }

}
