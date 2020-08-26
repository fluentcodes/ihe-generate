
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActSpecObsInterferenceCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecObsInterferenceCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="INTFR"/&gt;
 *     &lt;enumeration value="FIBRIN"/&gt;
 *     &lt;enumeration value="HEMOLYSIS"/&gt;
 *     &lt;enumeration value="ICTERUS"/&gt;
 *     &lt;enumeration value="LIPEMIA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActSpecObsInterferenceCode")
@XmlEnum
public enum ActSpecObsInterferenceCode {

    INTFR,
    FIBRIN,
    HEMOLYSIS,
    ICTERUS,
    LIPEMIA;

    public String value() {
        return name();
    }

    public static ActSpecObsInterferenceCode fromValue(String v) {
        return valueOf(v);
    }

}
