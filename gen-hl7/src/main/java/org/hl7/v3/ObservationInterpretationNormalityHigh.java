
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationInterpretationNormalityHigh.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationNormalityHigh"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="HH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationNormalityHigh")
@XmlEnum
public enum ObservationInterpretationNormalityHigh {

    H,
    HH;

    public String value() {
        return name();
    }

    public static ObservationInterpretationNormalityHigh fromValue(String v) {
        return valueOf(v);
    }

}
