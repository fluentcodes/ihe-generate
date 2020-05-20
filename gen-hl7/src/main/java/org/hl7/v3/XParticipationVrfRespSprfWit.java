
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ParticipationVrfRespSprfWit.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationVrfRespSprfWit"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="RESP"/&gt;
 *     &lt;enumeration value="SPRF"/&gt;
 *     &lt;enumeration value="VRF"/&gt;
 *     &lt;enumeration value="WIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationVrfRespSprfWit")
@XmlEnum
public enum XParticipationVrfRespSprfWit {

    RESP,
    SPRF,
    VRF,
    WIT;

    public String value() {
        return name();
    }

    public static XParticipationVrfRespSprfWit fromValue(String v) {
        return valueOf(v);
    }

}
