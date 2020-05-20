
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PharmacySupplyRequestRenewalRefusalReasonCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PharmacySupplyRequestRenewalRefusalReasonCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="FAMPHYS"/&gt;
 *     &lt;enumeration value="ONHOLD"/&gt;
 *     &lt;enumeration value="MODIFY"/&gt;
 *     &lt;enumeration value="ALREADYRX"/&gt;
 *     &lt;enumeration value="NEEDAPMT"/&gt;
 *     &lt;enumeration value="NOTPAT"/&gt;
 *     &lt;enumeration value="NOTAVAIL"/&gt;
 *     &lt;enumeration value="DISCONT"/&gt;
 *     &lt;enumeration value="TOOEARLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PharmacySupplyRequestRenewalRefusalReasonCode")
@XmlEnum
public enum PharmacySupplyRequestRenewalRefusalReasonCode {

    FAMPHYS,
    ONHOLD,
    MODIFY,
    ALREADYRX,
    NEEDAPMT,
    NOTPAT,
    NOTAVAIL,
    DISCONT,
    TOOEARLY;

    public String value() {
        return name();
    }

    public static PharmacySupplyRequestRenewalRefusalReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
