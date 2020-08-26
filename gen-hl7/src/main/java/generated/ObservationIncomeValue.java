
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationIncomeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationIncomeValue"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="INCOME"/&gt;
 *     &lt;enumeration value="CHILD"/&gt;
 *     &lt;enumeration value="DISABL"/&gt;
 *     &lt;enumeration value="SUPPLE"/&gt;
 *     &lt;enumeration value="INVEST"/&gt;
 *     &lt;enumeration value="PAY"/&gt;
 *     &lt;enumeration value="RETIRE"/&gt;
 *     &lt;enumeration value="SPOUSAL"/&gt;
 *     &lt;enumeration value="TAX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationIncomeValue")
@XmlEnum
public enum ObservationIncomeValue {

    INCOME,
    CHILD,
    DISABL,
    SUPPLE,
    INVEST,
    PAY,
    RETIRE,
    SPOUSAL,
    TAX;

    public String value() {
        return name();
    }

    public static ObservationIncomeValue fromValue(String v) {
        return valueOf(v);
    }

}
