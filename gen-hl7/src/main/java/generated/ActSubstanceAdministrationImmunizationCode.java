
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActSubstanceAdministrationImmunizationCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSubstanceAdministrationImmunizationCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IMMUNIZ"/&gt;
 *     &lt;enumeration value="BOOSTER"/&gt;
 *     &lt;enumeration value="INITIMMUNIZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActSubstanceAdministrationImmunizationCode")
@XmlEnum
public enum ActSubstanceAdministrationImmunizationCode {

    IMMUNIZ,
    BOOSTER,
    INITIMMUNIZ;

    public String value() {
        return name();
    }

    public static ActSubstanceAdministrationImmunizationCode fromValue(String v) {
        return valueOf(v);
    }

}
