
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActAdministrativeRuleDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActAdministrativeRuleDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="KEY205"/&gt;
 *     &lt;enumeration value="KEY204"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActAdministrativeRuleDetectedIssueCode")
@XmlEnum
public enum ActAdministrativeRuleDetectedIssueCode {

    @XmlEnumValue("KEY205")
    KEY_205("KEY205"),
    @XmlEnumValue("KEY204")
    KEY_204("KEY204");
    private final String value;

    ActAdministrativeRuleDetectedIssueCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActAdministrativeRuleDetectedIssueCode fromValue(String v) {
        for (ActAdministrativeRuleDetectedIssueCode c: ActAdministrativeRuleDetectedIssueCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
