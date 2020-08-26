
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_RoleClassAccommodationRequestor.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassAccommodationRequestor"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassAccommodationRequestor")
@XmlEnum
public enum XRoleClassAccommodationRequestor {

    AGNT,
    PROV,
    PAT,
    PRS;

    public String value() {
        return name();
    }

    public static XRoleClassAccommodationRequestor fromValue(String v) {
        return valueOf(v);
    }

}
