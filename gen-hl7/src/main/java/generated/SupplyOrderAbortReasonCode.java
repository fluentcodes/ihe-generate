
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SupplyOrderAbortReasonCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyOrderAbortReasonCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IMPROV"/&gt;
 *     &lt;enumeration value="INTOL"/&gt;
 *     &lt;enumeration value="NEWSTR"/&gt;
 *     &lt;enumeration value="NEWTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplyOrderAbortReasonCode")
@XmlEnum
public enum SupplyOrderAbortReasonCode {

    IMPROV,
    INTOL,
    NEWSTR,
    NEWTHER;

    public String value() {
        return name();
    }

    public static SupplyOrderAbortReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
