
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActBoundedROICode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActBoundedROICode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ROIFS"/&gt;
 *     &lt;enumeration value="ROIPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActBoundedROICode")
@XmlEnum
public enum ActBoundedROICode {

    ROIFS,
    ROIPS;

    public String value() {
        return name();
    }

    public static ActBoundedROICode fromValue(String v) {
        return valueOf(v);
    }

}
