
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OticRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OticRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="OT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OticRoute")
@XmlEnum
public enum OticRoute {

    OT;

    public String value() {
        return name();
    }

    public static OticRoute fromValue(String v) {
        return valueOf(v);
    }

}
