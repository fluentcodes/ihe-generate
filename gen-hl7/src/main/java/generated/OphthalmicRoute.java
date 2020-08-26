
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OphthalmicRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OphthalmicRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="OPTHALTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OphthalmicRoute")
@XmlEnum
public enum OphthalmicRoute {

    OPTHALTA;

    public String value() {
        return name();
    }

    public static OphthalmicRoute fromValue(String v) {
        return valueOf(v);
    }

}
