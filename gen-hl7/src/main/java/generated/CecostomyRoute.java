
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CecostomyRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CecostomyRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CECINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CecostomyRoute")
@XmlEnum
public enum CecostomyRoute {

    CECINSTL;

    public String value() {
        return name();
    }

    public static CecostomyRoute fromValue(String v) {
        return valueOf(v);
    }

}
