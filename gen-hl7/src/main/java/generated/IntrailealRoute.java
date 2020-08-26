
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntrailealRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrailealRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IILEALINJ"/&gt;
 *     &lt;enumeration value="IILEALTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntrailealRoute")
@XmlEnum
public enum IntrailealRoute {

    IILEALINJ,
    IILEALTA;

    public String value() {
        return name();
    }

    public static IntrailealRoute fromValue(String v) {
        return valueOf(v);
    }

}
