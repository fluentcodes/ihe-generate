
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OromucosalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OromucosalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GARGLE"/&gt;
 *     &lt;enumeration value="SUCK"/&gt;
 *     &lt;enumeration value="SWISHSPIT"/&gt;
 *     &lt;enumeration value="SWISHSWAL"/&gt;
 *     &lt;enumeration value="ORMUC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OromucosalRoute")
@XmlEnum
public enum OromucosalRoute {

    GARGLE,
    SUCK,
    SWISHSPIT,
    SWISHSWAL,
    ORMUC;

    public String value() {
        return name();
    }

    public static OromucosalRoute fromValue(String v) {
        return valueOf(v);
    }

}
