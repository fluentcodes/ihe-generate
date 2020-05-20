
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntericCoatedTablet.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntericCoatedTablet"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ECTAB"/&gt;
 *     &lt;enumeration value="ERECTAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntericCoatedTablet")
@XmlEnum
public enum EntericCoatedTablet {

    ECTAB,
    ERECTAB;

    public String value() {
        return name();
    }

    public static EntericCoatedTablet fromValue(String v) {
        return valueOf(v);
    }

}
