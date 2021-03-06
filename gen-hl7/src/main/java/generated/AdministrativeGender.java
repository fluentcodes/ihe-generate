
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AdministrativeGender.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeGender"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="UN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeGender")
@XmlEnum
public enum AdministrativeGender {

    F,
    M,
    UN;

    public String value() {
        return name();
    }

    public static AdministrativeGender fromValue(String v) {
        return valueOf(v);
    }

}
