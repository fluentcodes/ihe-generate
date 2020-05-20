
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SurgClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SurgClinPracticeSetting"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SU"/&gt;
 *     &lt;enumeration value="PLS"/&gt;
 *     &lt;enumeration value="URO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurgClinPracticeSetting")
@XmlEnum
public enum SurgClinPracticeSetting {

    SU,
    PLS,
    URO;

    public String value() {
        return name();
    }

    public static SurgClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
