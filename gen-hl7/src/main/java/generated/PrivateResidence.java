
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PrivateResidence.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PrivateResidence"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrivateResidence")
@XmlEnum
public enum PrivateResidence {

    PR,
    H,
    R,
    SL;

    public String value() {
        return name();
    }

    public static PrivateResidence fromValue(String v) {
        return valueOf(v);
    }

}
