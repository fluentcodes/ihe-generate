
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PayorRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PayorRoleType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ENROLBKR"/&gt;
 *     &lt;enumeration value="TPA"/&gt;
 *     &lt;enumeration value="UMO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayorRoleType")
@XmlEnum
public enum PayorRoleType {

    ENROLBKR,
    TPA,
    UMO;

    public String value() {
        return name();
    }

    public static PayorRoleType fromValue(String v) {
        return valueOf(v);
    }

}
