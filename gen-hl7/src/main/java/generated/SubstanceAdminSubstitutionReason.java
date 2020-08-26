
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubstanceAdminSubstitutionReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstanceAdminSubstitutionReason"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="FP"/&gt;
 *     &lt;enumeration value="OS"/&gt;
 *     &lt;enumeration value="RR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubstanceAdminSubstitutionReason")
@XmlEnum
public enum SubstanceAdminSubstitutionReason {

    CT,
    FP,
    OS,
    RR;

    public String value() {
        return name();
    }

    public static SubstanceAdminSubstitutionReason fromValue(String v) {
        return valueOf(v);
    }

}
