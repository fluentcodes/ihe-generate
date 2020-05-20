
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInsurancePolicyCodeSubsidizedHealthProgramByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInsurancePolicyCodeSubsidizedHealthProgramByBOT"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SUBSIDIZ"/&gt;
 *     &lt;enumeration value="SUBSIDMC"/&gt;
 *     &lt;enumeration value="SUBSUPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInsurancePolicyCodeSubsidizedHealthProgramByBOT")
@XmlEnum
public enum ActInsurancePolicyCodeSubsidizedHealthProgramByBOT {

    SUBSIDIZ,
    SUBSIDMC,
    SUBSUPP;

    public String value() {
        return name();
    }

    public static ActInsurancePolicyCodeSubsidizedHealthProgramByBOT fromValue(String v) {
        return valueOf(v);
    }

}
