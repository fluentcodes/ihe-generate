
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntravenousInjection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravenousInjection"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="IVINJ"/&gt;
 *     &lt;enumeration value="IVINJBOL"/&gt;
 *     &lt;enumeration value="IVPUSH"/&gt;
 *     &lt;enumeration value="IVRPUSH"/&gt;
 *     &lt;enumeration value="IVSPUSH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntravenousInjection")
@XmlEnum
public enum IntravenousInjection {

    IVINJ,
    IVINJBOL,
    IVPUSH,
    IVRPUSH,
    IVSPUSH;

    public String value() {
        return name();
    }

    public static IntravenousInjection fromValue(String v) {
        return valueOf(v);
    }

}
