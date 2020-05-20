
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationSignature.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationSignature"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationSignature")
@XmlEnum
public enum ParticipationSignature {

    I,
    X,
    S;

    public String value() {
        return name();
    }

    public static ParticipationSignature fromValue(String v) {
        return valueOf(v);
    }

}
