
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_PayeeRelationshipRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_PayeeRelationshipRoleType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="PH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_PayeeRelationshipRoleType")
@XmlEnum
public enum XPayeeRelationshipRoleType {

    FM,
    GT,
    PT,
    PH;

    public String value() {
        return name();
    }

    public static XPayeeRelationshipRoleType fromValue(String v) {
        return valueOf(v);
    }

}
