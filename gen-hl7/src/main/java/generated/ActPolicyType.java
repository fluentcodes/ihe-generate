
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActPolicyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActPolicyType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="COVPOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActPolicyType")
@XmlEnum
public enum ActPolicyType {

    COVPOL;

    public String value() {
        return name();
    }

    public static ActPolicyType fromValue(String v) {
        return valueOf(v);
    }

}
