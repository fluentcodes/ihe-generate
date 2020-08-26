
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Calendar.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Calendar"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GREG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Calendar")
@XmlEnum
public enum Calendar {

    GREG;

    public String value() {
        return name();
    }

    public static Calendar fromValue(String v) {
        return valueOf(v);
    }

}
