
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LaryngealRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LaryngealRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="LARYNGINSTIL"/&gt;
 *     &lt;enumeration value="LARYNGTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LaryngealRoute")
@XmlEnum
public enum LaryngealRoute {

    LARYNGINSTIL,
    LARYNGTA;

    public String value() {
        return name();
    }

    public static LaryngealRoute fromValue(String v) {
        return valueOf(v);
    }

}
