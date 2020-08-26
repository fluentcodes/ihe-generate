
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für JejunumRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="JejunumRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GJT"/&gt;
 *     &lt;enumeration value="JJTINSTL"/&gt;
 *     &lt;enumeration value="OJJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JejunumRoute")
@XmlEnum
public enum JejunumRoute {

    GJT,
    JJTINSTL,
    OJJ;

    public String value() {
        return name();
    }

    public static JejunumRoute fromValue(String v) {
        return valueOf(v);
    }

}
