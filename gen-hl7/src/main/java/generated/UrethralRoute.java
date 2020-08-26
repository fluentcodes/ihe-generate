
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UrethralRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UrethralRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="URETHINJ"/&gt;
 *     &lt;enumeration value="URETHINS"/&gt;
 *     &lt;enumeration value="URETHSUP"/&gt;
 *     &lt;enumeration value="URETHINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrethralRoute")
@XmlEnum
public enum UrethralRoute {

    URETHINJ,
    URETHINS,
    URETHSUP,
    URETHINSTL;

    public String value() {
        return name();
    }

    public static UrethralRoute fromValue(String v) {
        return valueOf(v);
    }

}
