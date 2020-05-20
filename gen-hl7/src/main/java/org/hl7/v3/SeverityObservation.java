
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SeverityObservation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityObservation"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityObservation")
@XmlEnum
public enum SeverityObservation {

    H,
    L,
    M;

    public String value() {
        return name();
    }

    public static SeverityObservation fromValue(String v) {
        return valueOf(v);
    }

}
