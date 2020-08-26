
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SoftTissueRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SoftTissueRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SOFTISINJ"/&gt;
 *     &lt;enumeration value="SOFTISINSTIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SoftTissueRoute")
@XmlEnum
public enum SoftTissueRoute {

    SOFTISINJ,
    SOFTISINSTIL;

    public String value() {
        return name();
    }

    public static SoftTissueRoute fromValue(String v) {
        return valueOf(v);
    }

}
