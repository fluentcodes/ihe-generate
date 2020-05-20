
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GIClinicPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GIClinicPracticeSetting"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="GI"/&gt;
 *     &lt;enumeration value="PEDGI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GIClinicPracticeSetting")
@XmlEnum
public enum GIClinicPracticeSetting {

    GI,
    PEDGI;

    public String value() {
        return name();
    }

    public static GIClinicPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
