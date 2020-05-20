
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActExposureLevelCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActExposureLevelCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="MEDIUM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActExposureLevelCode")
@XmlEnum
public enum ActExposureLevelCode {

    HIGH,
    LOW,
    MEDIUM;

    public String value() {
        return name();
    }

    public static ActExposureLevelCode fromValue(String v) {
        return valueOf(v);
    }

}
