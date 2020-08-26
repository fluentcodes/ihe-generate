
package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SLIST_PQ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SLIST_PQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ANY"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="origin" type="{}PQ"/&gt;
 *         &lt;element name="scale" type="{}PQ"/&gt;
 *         &lt;element name="digits" type="{}list_int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLIST_PQ", propOrder = {
    "origin",
    "scale",
    "digits"
})
public class SLISTPQ
    extends ANY
{

    @XmlElement(required = true)
    protected PQ origin;
    @XmlElement(required = true)
    protected PQ scale;
    @XmlList
    @XmlElement(required = true)
    protected List<BigInteger> digits;

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setOrigin(PQ value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getScale() {
        return scale;
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setScale(PQ value) {
        this.scale = value;
    }

    /**
     * Gets the value of the digits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getDigits() {
        if (digits == null) {
            digits = new ArrayList<BigInteger>();
        }
        return this.digits;
    }

}
