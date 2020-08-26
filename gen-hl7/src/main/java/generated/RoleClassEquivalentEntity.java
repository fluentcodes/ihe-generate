
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleClassEquivalentEntity.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassEquivalentEntity"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SAME"/&gt;
 *     &lt;enumeration value="SUBY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassEquivalentEntity")
@XmlEnum
public enum RoleClassEquivalentEntity {

    SAME,
    SUBY;

    public String value() {
        return name();
    }

    public static RoleClassEquivalentEntity fromValue(String v) {
        return valueOf(v);
    }

}
