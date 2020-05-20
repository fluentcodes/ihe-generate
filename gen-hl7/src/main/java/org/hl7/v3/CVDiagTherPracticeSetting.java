
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CVDiagTherPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CVDiagTherPracticeSetting"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CVDX"/&gt;
 *     &lt;enumeration value="CATH"/&gt;
 *     &lt;enumeration value="ECHO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVDiagTherPracticeSetting")
@XmlEnum
public enum CVDiagTherPracticeSetting {

    CVDX,
    CATH,
    ECHO;

    public String value() {
        return name();
    }

    public static CVDiagTherPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
