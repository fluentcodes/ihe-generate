
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntrathecalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrathecalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="ITINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntrathecalRoute")
@XmlEnum
public enum IntrathecalRoute {

    IT,
    ITINJ;

    public String value() {
        return name();
    }

    public static IntrathecalRoute fromValue(String v) {
        return valueOf(v);
    }

}
