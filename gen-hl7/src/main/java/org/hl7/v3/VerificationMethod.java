
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VerificationMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationMethod"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="VDOC"/&gt;
 *     &lt;enumeration value="VTOKEN"/&gt;
 *     &lt;enumeration value="VREG"/&gt;
 *     &lt;enumeration value="VVOICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationMethod")
@XmlEnum
public enum VerificationMethod {

    VDOC,
    VTOKEN,
    VREG,
    VVOICE;

    public String value() {
        return name();
    }

    public static VerificationMethod fromValue(String v) {
        return valueOf(v);
    }

}
