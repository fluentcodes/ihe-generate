
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntrabursalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrabursalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IBURSINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntrabursalRoute")
@XmlEnum
public enum IntrabursalRoute {

    IBURSINJ;

    public String value() {
        return name();
    }

    public static IntrabursalRoute fromValue(String v) {
        return valueOf(v);
    }

}
