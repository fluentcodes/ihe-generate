
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInvoiceRootGroupCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceRootGroupCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="RXCINV"/&gt;
 *     &lt;enumeration value="RXDINV"/&gt;
 *     &lt;enumeration value="CPINV"/&gt;
 *     &lt;enumeration value="CSPINV"/&gt;
 *     &lt;enumeration value="CSINV"/&gt;
 *     &lt;enumeration value="FININV"/&gt;
 *     &lt;enumeration value="OHSINV"/&gt;
 *     &lt;enumeration value="PAINV"/&gt;
 *     &lt;enumeration value="SBFINV"/&gt;
 *     &lt;enumeration value="VRXINV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceRootGroupCode")
@XmlEnum
public enum ActInvoiceRootGroupCode {

    RXCINV,
    RXDINV,
    CPINV,
    CSPINV,
    CSINV,
    FININV,
    OHSINV,
    PAINV,
    SBFINV,
    VRXINV;

    public String value() {
        return name();
    }

    public static ActInvoiceRootGroupCode fromValue(String v) {
        return valueOf(v);
    }

}
