
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActContainerRegistrationCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActContainerRegistrationCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IP"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActContainerRegistrationCode")
@XmlEnum
public enum ActContainerRegistrationCode {

    X,
    ID,
    IP,
    O,
    L,
    M,
    R;

    public String value() {
        return name();
    }

    public static ActContainerRegistrationCode fromValue(String v) {
        return valueOf(v);
    }

}
