
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActOrderableOrBillable.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActOrderableOrBillable"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ACCM"/&gt;
 *     &lt;enumeration value="PCPR"/&gt;
 *     &lt;enumeration value="ENC"/&gt;
 *     &lt;enumeration value="SBADM"/&gt;
 *     &lt;enumeration value="TRNS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActOrderableOrBillable")
@XmlEnum
public enum XActOrderableOrBillable {

    ACCM,
    PCPR,
    ENC,
    SBADM,
    TRNS;

    public String value() {
        return name();
    }

    public static XActOrderableOrBillable fromValue(String v) {
        return valueOf(v);
    }

}
