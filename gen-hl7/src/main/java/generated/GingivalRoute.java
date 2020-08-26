
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GingivalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GingivalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GINGINJ"/&gt;
 *     &lt;enumeration value="GIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GingivalRoute")
@XmlEnum
public enum GingivalRoute {

    GINGINJ,
    GIN;

    public String value() {
        return name();
    }

    public static GingivalRoute fromValue(String v) {
        return valueOf(v);
    }

}
