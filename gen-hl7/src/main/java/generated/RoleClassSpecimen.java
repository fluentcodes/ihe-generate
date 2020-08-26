
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleClassSpecimen.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassSpecimen"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *     &lt;enumeration value="ALQT"/&gt;
 *     &lt;enumeration value="ISLT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassSpecimen")
@XmlEnum
public enum RoleClassSpecimen {

    SPEC,
    ALQT,
    ISLT;

    public String value() {
        return name();
    }

    public static RoleClassSpecimen fromValue(String v) {
        return valueOf(v);
    }

}
