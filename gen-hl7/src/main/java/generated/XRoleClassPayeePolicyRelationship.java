
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_RoleClassPayeePolicyRelationship.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassPayeePolicyRelationship"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="COVPTY"/&gt;
 *     &lt;enumeration value="GUAR"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *     &lt;enumeration value="POLHOLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassPayeePolicyRelationship")
@XmlEnum
public enum XRoleClassPayeePolicyRelationship {

    COVPTY,
    GUAR,
    PROV,
    PRS,
    POLHOLD;

    public String value() {
        return name();
    }

    public static XRoleClassPayeePolicyRelationship fromValue(String v) {
        return valueOf(v);
    }

}
