
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParanasalSinusesRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParanasalSinusesRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PNSINJ"/&gt;
 *     &lt;enumeration value="PNSINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParanasalSinusesRoute")
@XmlEnum
public enum ParanasalSinusesRoute {

    PNSINJ,
    PNSINSTL;

    public String value() {
        return name();
    }

    public static ParanasalSinusesRoute fromValue(String v) {
        return valueOf(v);
    }

}
