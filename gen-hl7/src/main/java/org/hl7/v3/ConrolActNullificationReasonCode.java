
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConrolActNullificationReasonCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConrolActNullificationReasonCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ALTD"/&gt;
 *     &lt;enumeration value="EIE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConrolActNullificationReasonCode")
@XmlEnum
public enum ConrolActNullificationReasonCode {

    ALTD,
    EIE;

    public String value() {
        return name();
    }

    public static ConrolActNullificationReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
