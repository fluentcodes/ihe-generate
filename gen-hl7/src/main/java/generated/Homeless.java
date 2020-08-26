
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Homeless.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Homeless"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="HL"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Homeless")
@XmlEnum
public enum Homeless {

    HL,
    M,
    T;

    public String value() {
        return name();
    }

    public static Homeless fromValue(String v) {
        return valueOf(v);
    }

}
