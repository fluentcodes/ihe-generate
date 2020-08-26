
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AdministrativeContactRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeContactRoleType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BILL"/&gt;
 *     &lt;enumeration value="PAYOR"/&gt;
 *     &lt;enumeration value="ORG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeContactRoleType")
@XmlEnum
public enum AdministrativeContactRoleType {

    BILL,
    PAYOR,
    ORG;

    public String value() {
        return name();
    }

    public static AdministrativeContactRoleType fromValue(String v) {
        return valueOf(v);
    }

}
