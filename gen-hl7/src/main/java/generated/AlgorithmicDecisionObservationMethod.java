
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AlgorithmicDecisionObservationMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AlgorithmicDecisionObservationMethod"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ALGM"/&gt;
 *     &lt;enumeration value="BYCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlgorithmicDecisionObservationMethod")
@XmlEnum
public enum AlgorithmicDecisionObservationMethod {

    ALGM,
    BYCL;

    public String value() {
        return name();
    }

    public static AlgorithmicDecisionObservationMethod fromValue(String v) {
        return valueOf(v);
    }

}
