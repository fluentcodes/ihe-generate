
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SXCM_PPD_TS complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SXCM_PPD_TS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}PPD_TS"&gt;
 *       &lt;attribute name="operator" type="{urn:hl7-org:v3}SetOperator" default="I" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SXCM_PPD_TS")
@XmlSeeAlso({
    PIVLPPDTS.class,
    IVLPPDTS.class,
    EIVLPPDTS.class
})
public class SXCMPPDTS
    extends PPDTS
{

    @XmlAttribute(name = "operator")
    protected SetOperator operator;

    /**
     * Ruft den Wert der operator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SetOperator }
     *     
     */
    public SetOperator getOperator() {
        if (operator == null) {
            return SetOperator.I;
        } else {
            return operator;
        }
    }

    /**
     * Legt den Wert der operator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOperator }
     *     
     */
    public void setOperator(SetOperator value) {
        this.operator = value;
    }

}
