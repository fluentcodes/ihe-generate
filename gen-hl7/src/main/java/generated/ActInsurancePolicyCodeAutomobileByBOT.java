
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInsurancePolicyCodeAutomobileByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInsurancePolicyCodeAutomobileByBOT"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AUTOPOL"/&gt;
 *     &lt;enumeration value="COL"/&gt;
 *     &lt;enumeration value="UNINSMOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInsurancePolicyCodeAutomobileByBOT")
@XmlEnum
public enum ActInsurancePolicyCodeAutomobileByBOT {

    AUTOPOL,
    COL,
    UNINSMOT;

    public String value() {
        return name();
    }

    public static ActInsurancePolicyCodeAutomobileByBOT fromValue(String v) {
        return valueOf(v);
    }

}
