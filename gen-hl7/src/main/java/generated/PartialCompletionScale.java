
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PartialCompletionScale.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PartialCompletionScale"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="LE"/&gt;
 *     &lt;enumeration value="ME"/&gt;
 *     &lt;enumeration value="MI"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartialCompletionScale")
@XmlEnum
public enum PartialCompletionScale {

    G,
    LE,
    ME,
    MI,
    N,
    S;

    public String value() {
        return name();
    }

    public static PartialCompletionScale fromValue(String v) {
        return valueOf(v);
    }

}
