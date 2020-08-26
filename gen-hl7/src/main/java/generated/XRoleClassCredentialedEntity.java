
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_RoleClassCredentialedEntity.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCredentialedEntity"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ASSIGNED"/&gt;
 *     &lt;enumeration value="QUAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassCredentialedEntity")
@XmlEnum
public enum XRoleClassCredentialedEntity {

    ASSIGNED,
    QUAL;

    public String value() {
        return name();
    }

    public static XRoleClassCredentialedEntity fromValue(String v) {
        return valueOf(v);
    }

}
