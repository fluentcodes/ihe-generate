
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassSupine.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassSupine"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SUP"/&gt;
 *     &lt;enumeration value="RTRD"/&gt;
 *     &lt;enumeration value="TRD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassSupine")
@XmlEnum
public enum ActClassSupine {

    SUP,
    RTRD,
    TRD;

    public String value() {
        return name();
    }

    public static ActClassSupine fromValue(String v) {
        return valueOf(v);
    }

}
