
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubstanceAdminSubstitutionNotAllowedReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstanceAdminSubstitutionNotAllowedReason"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *     &lt;enumeration value="ALGINT"/&gt;
 *     &lt;enumeration value="TRIAL"/&gt;
 *     &lt;enumeration value="COMPCON"/&gt;
 *     &lt;enumeration value="THERCHAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubstanceAdminSubstitutionNotAllowedReason")
@XmlEnum
public enum SubstanceAdminSubstitutionNotAllowedReason {

    PAT,
    ALGINT,
    TRIAL,
    COMPCON,
    THERCHAR;

    public String value() {
        return name();
    }

    public static SubstanceAdminSubstitutionNotAllowedReason fromValue(String v) {
        return valueOf(v);
    }

}
