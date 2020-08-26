
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_OrganizationNamePartType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_OrganizationNamePartType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="PFX"/&gt;
 *     &lt;enumeration value="SFX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_OrganizationNamePartType")
@XmlEnum
public enum XOrganizationNamePartType {

    DEL,
    PFX,
    SFX;

    public String value() {
        return name();
    }

    public static XOrganizationNamePartType fromValue(String v) {
        return valueOf(v);
    }

}
