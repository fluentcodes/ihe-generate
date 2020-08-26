
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInvoiceDetailGenericAdjudicatorCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceDetailGenericAdjudicatorCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="COIN"/&gt;
 *     &lt;enumeration value="DEDUCTIBLE"/&gt;
 *     &lt;enumeration value="COPAYMENT"/&gt;
 *     &lt;enumeration value="PAY"/&gt;
 *     &lt;enumeration value="SPEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceDetailGenericAdjudicatorCode")
@XmlEnum
public enum ActInvoiceDetailGenericAdjudicatorCode {

    COIN,
    DEDUCTIBLE,
    COPAYMENT,
    PAY,
    SPEND;

    public String value() {
        return name();
    }

    public static ActInvoiceDetailGenericAdjudicatorCode fromValue(String v) {
        return valueOf(v);
    }

}
