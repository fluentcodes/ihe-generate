
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Conditional.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Conditional"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CONFIRM"/&gt;
 *     &lt;enumeration value="NOTIFY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Conditional")
@XmlEnum
public enum Conditional {

    CONFIRM,
    NOTIFY;

    public String value() {
        return name();
    }

    public static Conditional fromValue(String v) {
        return valueOf(v);
    }

}
