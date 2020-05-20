
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IDClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IDClinPracticeSetting"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="INFD"/&gt;
 *     &lt;enumeration value="PEDID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IDClinPracticeSetting")
@XmlEnum
public enum IDClinPracticeSetting {

    INFD,
    PEDID;

    public String value() {
        return name();
    }

    public static IDClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
