
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntragastricRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntragastricRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IGASTINSTIL"/&gt;
 *     &lt;enumeration value="IGASTIRR"/&gt;
 *     &lt;enumeration value="IGASTLAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntragastricRoute")
@XmlEnum
public enum IntragastricRoute {

    IGASTINSTIL,
    IGASTIRR,
    IGASTLAV;

    public String value() {
        return name();
    }

    public static IntragastricRoute fromValue(String v) {
        return valueOf(v);
    }

}
