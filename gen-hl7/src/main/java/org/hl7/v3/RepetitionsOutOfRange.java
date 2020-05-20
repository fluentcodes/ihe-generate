
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RepetitionsOutOfRange.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RepetitionsOutOfRange"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="REP_RANGE"/&gt;
 *     &lt;enumeration value="MAXOCCURS"/&gt;
 *     &lt;enumeration value="MINOCCURS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepetitionsOutOfRange")
@XmlEnum
public enum RepetitionsOutOfRange {

    REP_RANGE,
    MAXOCCURS,
    MINOCCURS;

    public String value() {
        return name();
    }

    public static RepetitionsOutOfRange fromValue(String v) {
        return valueOf(v);
    }

}
