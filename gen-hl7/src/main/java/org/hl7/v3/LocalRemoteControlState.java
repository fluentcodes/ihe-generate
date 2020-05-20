
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocalRemoteControlState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalRemoteControlState"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalRemoteControlState")
@XmlEnum
public enum LocalRemoteControlState {

    L,
    R;

    public String value() {
        return name();
    }

    public static LocalRemoteControlState fromValue(String v) {
        return valueOf(v);
    }

}
