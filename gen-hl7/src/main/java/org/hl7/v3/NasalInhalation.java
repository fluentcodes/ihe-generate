
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NasalInhalation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NasalInhalation"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="NASINHL"/&gt;
 *     &lt;enumeration value="NASINHLC"/&gt;
 *     &lt;enumeration value="NP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NasalInhalation")
@XmlEnum
public enum NasalInhalation {

    NASINHL,
    NASINHLC,
    NP;

    public String value() {
        return name();
    }

    public static NasalInhalation fromValue(String v) {
        return valueOf(v);
    }

}
