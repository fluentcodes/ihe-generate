
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActFinancialTransactionCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActFinancialTransactionCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CHRG"/&gt;
 *     &lt;enumeration value="REV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActFinancialTransactionCode")
@XmlEnum
public enum ActFinancialTransactionCode {

    CHRG,
    REV;

    public String value() {
        return name();
    }

    public static ActFinancialTransactionCode fromValue(String v) {
        return valueOf(v);
    }

}
