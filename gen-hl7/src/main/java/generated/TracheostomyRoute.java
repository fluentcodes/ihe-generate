
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TracheostomyRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TracheostomyRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TRACH"/&gt;
 *     &lt;enumeration value="TRACHINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TracheostomyRoute")
@XmlEnum
public enum TracheostomyRoute {

    TRACH,
    TRACHINSTL;

    public String value() {
        return name();
    }

    public static TracheostomyRoute fromValue(String v) {
        return valueOf(v);
    }

}
