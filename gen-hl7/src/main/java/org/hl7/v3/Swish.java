
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Swish.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Swish"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SWISHSPIT"/&gt;
 *     &lt;enumeration value="SWISHSWAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Swish")
@XmlEnum
public enum Swish {

    SWISHSPIT,
    SWISHSWAL;

    public String value() {
        return name();
    }

    public static Swish fromValue(String v) {
        return valueOf(v);
    }

}
