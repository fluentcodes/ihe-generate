
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DocumentCompletion.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentCompletion"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AU"/&gt;
 *     &lt;enumeration value="DI"/&gt;
 *     &lt;enumeration value="DO"/&gt;
 *     &lt;enumeration value="IP"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentCompletion")
@XmlEnum
public enum DocumentCompletion {

    AU,
    DI,
    DO,
    IP,
    IN,
    LA,
    PA;

    public String value() {
        return name();
    }

    public static DocumentCompletion fromValue(String v) {
        return valueOf(v);
    }

}
