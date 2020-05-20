
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DoseLowDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DoseLowDetectedIssueCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DOSEL"/&gt;
 *     &lt;enumeration value="DOSELINDA"/&gt;
 *     &lt;enumeration value="DOSELINDSA"/&gt;
 *     &lt;enumeration value="DOSELIND"/&gt;
 *     &lt;enumeration value="DOSELINDW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoseLowDetectedIssueCode")
@XmlEnum
public enum DoseLowDetectedIssueCode {

    DOSEL,
    DOSELINDA,
    DOSELINDSA,
    DOSELIND,
    DOSELINDW;

    public String value() {
        return name();
    }

    public static DoseLowDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
