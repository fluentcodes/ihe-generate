
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ManagedCarePolicy.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedCarePolicy"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="MCPOL"/&gt;
 *     &lt;enumeration value="HMO"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="PPO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManagedCarePolicy")
@XmlEnum
public enum ManagedCarePolicy {

    MCPOL,
    HMO,
    POS,
    PPO;

    public String value() {
        return name();
    }

    public static ManagedCarePolicy fromValue(String v) {
        return valueOf(v);
    }

}
