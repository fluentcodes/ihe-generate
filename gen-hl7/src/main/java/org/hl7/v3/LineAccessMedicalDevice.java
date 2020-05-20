
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LineAccessMedicalDevice.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LineAccessMedicalDevice"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="LINE"/&gt;
 *     &lt;enumeration value="IALINE"/&gt;
 *     &lt;enumeration value="IVLINE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineAccessMedicalDevice")
@XmlEnum
public enum LineAccessMedicalDevice {

    LINE,
    IALINE,
    IVLINE;

    public String value() {
        return name();
    }

    public static LineAccessMedicalDevice fromValue(String v) {
        return valueOf(v);
    }

}
