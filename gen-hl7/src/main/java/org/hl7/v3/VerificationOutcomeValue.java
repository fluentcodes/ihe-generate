
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VerificationOutcomeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationOutcomeValue"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ACTPEND"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="ELG"/&gt;
 *     &lt;enumeration value="INACT"/&gt;
 *     &lt;enumeration value="INPNDUPD"/&gt;
 *     &lt;enumeration value="INPNDINV"/&gt;
 *     &lt;enumeration value="NELG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationOutcomeValue")
@XmlEnum
public enum VerificationOutcomeValue {

    ACTPEND,
    ACT,
    ELG,
    INACT,
    INPNDUPD,
    INPNDINV,
    NELG;

    public String value() {
        return name();
    }

    public static VerificationOutcomeValue fromValue(String v) {
        return valueOf(v);
    }

}
