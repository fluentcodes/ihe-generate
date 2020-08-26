
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UrinaryTractRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UrinaryTractRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BLADINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrinaryTractRoute")
@XmlEnum
public enum UrinaryTractRoute {

    BLADINSTL;

    public String value() {
        return name();
    }

    public static UrinaryTractRoute fromValue(String v) {
        return valueOf(v);
    }

}
