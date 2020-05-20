
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInvoicePaymentCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoicePaymentCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="BONUS"/&gt;
 *     &lt;enumeration value="CFWD"/&gt;
 *     &lt;enumeration value="EPYMT"/&gt;
 *     &lt;enumeration value="EDU"/&gt;
 *     &lt;enumeration value="GARN"/&gt;
 *     &lt;enumeration value="PINV"/&gt;
 *     &lt;enumeration value="PPRD"/&gt;
 *     &lt;enumeration value="PROA"/&gt;
 *     &lt;enumeration value="RECOV"/&gt;
 *     &lt;enumeration value="RETRO"/&gt;
 *     &lt;enumeration value="INVOICE"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInvoicePaymentCode")
@XmlEnum
public enum ActInvoicePaymentCode {

    BONUS,
    CFWD,
    EPYMT,
    EDU,
    GARN,
    PINV,
    PPRD,
    PROA,
    RECOV,
    RETRO,
    INVOICE,
    TRAN;

    public String value() {
        return name();
    }

    public static ActInvoicePaymentCode fromValue(String v) {
        return valueOf(v);
    }

}
