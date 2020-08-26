
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActConsentInformationAccessOverrideReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActConsentInformationAccessOverrideReason"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="OVRER"/&gt;
 *     &lt;enumeration value="OVRPJ"/&gt;
 *     &lt;enumeration value="OVRPS"/&gt;
 *     &lt;enumeration value="OVRTPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActConsentInformationAccessOverrideReason")
@XmlEnum
public enum ActConsentInformationAccessOverrideReason {

    OVRER,
    OVRPJ,
    OVRPS,
    OVRTPS;

    public String value() {
        return name();
    }

    public static ActConsentInformationAccessOverrideReason fromValue(String v) {
        return valueOf(v);
    }

}
