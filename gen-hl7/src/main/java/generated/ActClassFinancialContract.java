
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassFinancialContract.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassFinancialContract"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="FCNTRCT"/&gt;
 *     &lt;enumeration value="COV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassFinancialContract")
@XmlEnum
public enum ActClassFinancialContract {

    FCNTRCT,
    COV;

    public String value() {
        return name();
    }

    public static ActClassFinancialContract fromValue(String v) {
        return valueOf(v);
    }

}
