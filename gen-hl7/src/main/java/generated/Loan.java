
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Loan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Loan"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="RENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Loan")
@XmlEnum
public enum Loan {

    LOAN,
    RENT;

    public String value() {
        return name();
    }

    public static Loan fromValue(String v) {
        return valueOf(v);
    }

}
