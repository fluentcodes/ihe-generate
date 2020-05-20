
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SponsorParticipationFunction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SponsorParticipationFunction"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="FULINRD"/&gt;
 *     &lt;enumeration value="SELFINRD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SponsorParticipationFunction")
@XmlEnum
public enum SponsorParticipationFunction {

    FULINRD,
    SELFINRD;

    public String value() {
        return name();
    }

    public static SponsorParticipationFunction fromValue(String v) {
        return valueOf(v);
    }

}
