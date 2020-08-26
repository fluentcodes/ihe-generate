
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PeriodontalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodontalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PDONTINJ"/&gt;
 *     &lt;enumeration value="PDONTTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodontalRoute")
@XmlEnum
public enum PeriodontalRoute {

    PDONTINJ,
    PDONTTA;

    public String value() {
        return name();
    }

    public static PeriodontalRoute fromValue(String v) {
        return valueOf(v);
    }

}
