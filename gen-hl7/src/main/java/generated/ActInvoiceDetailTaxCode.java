
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInvoiceDetailTaxCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceDetailTaxCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="FST"/&gt;
 *     &lt;enumeration value="HST"/&gt;
 *     &lt;enumeration value="PST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceDetailTaxCode")
@XmlEnum
public enum ActInvoiceDetailTaxCode {

    FST,
    HST,
    PST;

    public String value() {
        return name();
    }

    public static ActInvoiceDetailTaxCode fromValue(String v) {
        return valueOf(v);
    }

}
