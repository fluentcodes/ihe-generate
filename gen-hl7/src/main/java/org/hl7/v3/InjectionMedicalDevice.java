
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InjectionMedicalDevice.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InjectionMedicalDevice"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="AINJ"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="SYR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InjectionMedicalDevice")
@XmlEnum
public enum InjectionMedicalDevice {

    AINJ,
    PEN,
    SYR;

    public String value() {
        return name();
    }

    public static InjectionMedicalDevice fromValue(String v) {
        return valueOf(v);
    }

}
