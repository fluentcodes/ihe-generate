
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InhalerMedicalDevice.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InhalerMedicalDevice"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="INH"/&gt;
 *     &lt;enumeration value="DSKUNH"/&gt;
 *     &lt;enumeration value="DSKS"/&gt;
 *     &lt;enumeration value="TRBINH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InhalerMedicalDevice")
@XmlEnum
public enum InhalerMedicalDevice {

    INH,
    DSKUNH,
    DSKS,
    TRBINH;

    public String value() {
        return name();
    }

    public static InhalerMedicalDevice fromValue(String v) {
        return valueOf(v);
    }

}
