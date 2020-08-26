
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RepetitionsOutOfRange.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RepetitionsOutOfRange"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="REP_RANGE"/&gt;
 *     &lt;enumeration value="MAXOCCURS"/&gt;
 *     &lt;enumeration value="MINOCCURS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepetitionsOutOfRange")
@XmlEnum
public enum RepetitionsOutOfRange {

    REP_RANGE,
    MAXOCCURS,
    MINOCCURS;

    public String value() {
        return name();
    }

    public static RepetitionsOutOfRange fromValue(String v) {
        return valueOf(v);
    }

}
