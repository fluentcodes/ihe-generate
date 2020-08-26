
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClaimantCoveredPartyRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimantCoveredPartyRoleType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CRIMEVIC"/&gt;
 *     &lt;enumeration value="INJ"/&gt;
 *     &lt;enumeration value="INJWKR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClaimantCoveredPartyRoleType")
@XmlEnum
public enum ClaimantCoveredPartyRoleType {

    CRIMEVIC,
    INJ,
    INJWKR;

    public String value() {
        return name();
    }

    public static ClaimantCoveredPartyRoleType fromValue(String v) {
        return valueOf(v);
    }

}
