
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DoseIntervalDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DoseIntervalDetectedIssueCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DOSEIVL"/&gt;
 *     &lt;enumeration value="DOSEIVLIND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoseIntervalDetectedIssueCode")
@XmlEnum
public enum DoseIntervalDetectedIssueCode {

    DOSEIVL,
    DOSEIVLIND;

    public String value() {
        return name();
    }

    public static DoseIntervalDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
