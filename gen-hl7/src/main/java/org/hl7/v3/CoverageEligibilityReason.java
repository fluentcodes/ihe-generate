
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CoverageEligibilityReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageEligibilityReason"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="AGE"/&gt;
 *     &lt;enumeration value="CRIME"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="EMPLOY"/&gt;
 *     &lt;enumeration value="FINAN"/&gt;
 *     &lt;enumeration value="HEALTH"/&gt;
 *     &lt;enumeration value="VEHIC"/&gt;
 *     &lt;enumeration value="MULTI"/&gt;
 *     &lt;enumeration value="PNC"/&gt;
 *     &lt;enumeration value="STATUTORY"/&gt;
 *     &lt;enumeration value="WORK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoverageEligibilityReason")
@XmlEnum
public enum CoverageEligibilityReason {

    AGE,
    CRIME,
    DIS,
    EMPLOY,
    FINAN,
    HEALTH,
    VEHIC,
    MULTI,
    PNC,
    STATUTORY,
    WORK;

    public String value() {
        return name();
    }

    public static CoverageEligibilityReason fromValue(String v) {
        return valueOf(v);
    }

}
