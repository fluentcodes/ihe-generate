
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInsurancePolicyCodeSubsidizedHealthProgramByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInsurancePolicyCodeSubsidizedHealthProgramByBOT"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SUBSIDIZ"/&gt;
 *     &lt;enumeration value="SUBSIDMC"/&gt;
 *     &lt;enumeration value="SUBSUPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInsurancePolicyCodeSubsidizedHealthProgramByBOT")
@XmlEnum
public enum ActInsurancePolicyCodeSubsidizedHealthProgramByBOT {

    SUBSIDIZ,
    SUBSIDMC,
    SUBSUPP;

    public String value() {
        return name();
    }

    public static ActInsurancePolicyCodeSubsidizedHealthProgramByBOT fromValue(String v) {
        return valueOf(v);
    }

}
