
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassPosition.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPosition"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="POSACC"/&gt;
 *     &lt;enumeration value="POSCOORD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassPosition")
@XmlEnum
public enum ActClassPosition {

    POS,
    POSACC,
    POSCOORD;

    public String value() {
        return name();
    }

    public static ActClassPosition fromValue(String v) {
        return valueOf(v);
    }

}
