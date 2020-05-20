
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationInterpretationOustsideThreshold.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationOustsideThreshold"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EX"/&gt;
 *     &lt;enumeration value="HX"/&gt;
 *     &lt;enumeration value="LX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationOustsideThreshold")
@XmlEnum
public enum ObservationInterpretationOustsideThreshold {

    EX,
    HX,
    LX;

    public String value() {
        return name();
    }

    public static ObservationInterpretationOustsideThreshold fromValue(String v) {
        return valueOf(v);
    }

}
