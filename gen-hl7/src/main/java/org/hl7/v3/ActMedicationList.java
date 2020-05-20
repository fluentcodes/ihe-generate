
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActMedicationList.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMedicationList"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="MEDLIST"/&gt;
 *     &lt;enumeration value="CURMEDLIST"/&gt;
 *     &lt;enumeration value="DISCMEDLIST"/&gt;
 *     &lt;enumeration value="HISTMEDLIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMedicationList")
@XmlEnum
public enum ActMedicationList {

    MEDLIST,
    CURMEDLIST,
    DISCMEDLIST,
    HISTMEDLIST;

    public String value() {
        return name();
    }

    public static ActMedicationList fromValue(String v) {
        return valueOf(v);
    }

}
