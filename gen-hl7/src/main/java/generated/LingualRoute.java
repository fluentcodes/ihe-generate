
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LingualRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LingualRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TRNSLING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LingualRoute")
@XmlEnum
public enum LingualRoute {

    TRNSLING;

    public String value() {
        return name();
    }

    public static LingualRoute fromValue(String v) {
        return valueOf(v);
    }

}
