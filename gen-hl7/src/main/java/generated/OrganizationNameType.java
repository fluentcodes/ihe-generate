
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OrganizationNameType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationNameType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrganizationNameType")
@XmlEnum
public enum OrganizationNameType {

    A,
    L,
    ST;

    public String value() {
        return name();
    }

    public static OrganizationNameType fromValue(String v) {
        return valueOf(v);
    }

}
