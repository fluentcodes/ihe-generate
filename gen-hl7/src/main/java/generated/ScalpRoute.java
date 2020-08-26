
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ScalpRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ScalpRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SCALP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScalpRoute")
@XmlEnum
public enum ScalpRoute {

    SCALP;

    public String value() {
        return name();
    }

    public static ScalpRoute fromValue(String v) {
        return valueOf(v);
    }

}
