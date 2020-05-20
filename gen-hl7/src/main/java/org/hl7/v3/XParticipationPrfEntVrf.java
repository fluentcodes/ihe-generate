
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ParticipationPrfEntVrf.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationPrfEntVrf"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ENT"/&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *     &lt;enumeration value="VRF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationPrfEntVrf")
@XmlEnum
public enum XParticipationPrfEntVrf {

    ENT,
    PRF,
    VRF;

    public String value() {
        return name();
    }

    public static XParticipationPrfEntVrf fromValue(String v) {
        return valueOf(v);
    }

}
