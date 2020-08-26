
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActNoImmunizationReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActNoImmunizationReason"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IMMUNE"/&gt;
 *     &lt;enumeration value="MEDPREC"/&gt;
 *     &lt;enumeration value="OSTOCK"/&gt;
 *     &lt;enumeration value="PATOBJ"/&gt;
 *     &lt;enumeration value="PHILISOP"/&gt;
 *     &lt;enumeration value="RELIG"/&gt;
 *     &lt;enumeration value="VACEFF"/&gt;
 *     &lt;enumeration value="VACSAF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActNoImmunizationReason")
@XmlEnum
public enum ActNoImmunizationReason {

    IMMUNE,
    MEDPREC,
    OSTOCK,
    PATOBJ,
    PHILISOP,
    RELIG,
    VACEFF,
    VACSAF;

    public String value() {
        return name();
    }

    public static ActNoImmunizationReason fromValue(String v) {
        return valueOf(v);
    }

}
