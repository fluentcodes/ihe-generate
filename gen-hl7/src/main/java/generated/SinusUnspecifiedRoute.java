
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SinusUnspecifiedRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SinusUnspecifiedRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ENDOSININJ"/&gt;
 *     &lt;enumeration value="SININSTIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SinusUnspecifiedRoute")
@XmlEnum
public enum SinusUnspecifiedRoute {

    ENDOSININJ,
    SININSTIL;

    public String value() {
        return name();
    }

    public static SinusUnspecifiedRoute fromValue(String v) {
        return valueOf(v);
    }

}
