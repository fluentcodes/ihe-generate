
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AlgorithmicDecisionObservationMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AlgorithmicDecisionObservationMethod"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
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
