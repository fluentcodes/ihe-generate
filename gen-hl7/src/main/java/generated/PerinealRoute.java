
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PerinealRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PerinealRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PERINEAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PerinealRoute")
@XmlEnum
public enum PerinealRoute {

    PERINEAL;

    public String value() {
        return name();
    }

    public static PerinealRoute fromValue(String v) {
        return valueOf(v);
    }

}
