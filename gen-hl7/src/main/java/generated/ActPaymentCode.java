
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActPaymentCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActPaymentCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ACH"/&gt;
 *     &lt;enumeration value="CHK"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActPaymentCode")
@XmlEnum
public enum ActPaymentCode {

    ACH,
    CHK,
    DDP,
    NON;

    public String value() {
        return name();
    }

    public static ActPaymentCode fromValue(String v) {
        return valueOf(v);
    }

}
