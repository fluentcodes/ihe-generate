
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationInterpretationNormalityAlert.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationNormalityAlert"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="HH"/&gt;
 *     &lt;enumeration value="LL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationNormalityAlert")
@XmlEnum
public enum ObservationInterpretationNormalityAlert {

    AA,
    HH,
    LL;

    public String value() {
        return name();
    }

    public static ObservationInterpretationNormalityAlert fromValue(String v) {
        return valueOf(v);
    }

}
