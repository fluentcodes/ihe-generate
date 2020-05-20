
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TargetAwareness.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetAwareness"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TargetAwareness")
@XmlEnum
public enum TargetAwareness {

    D,
    F,
    I,
    M,
    P,
    U;

    public String value() {
        return name();
    }

    public static TargetAwareness fromValue(String v) {
        return valueOf(v);
    }

}
