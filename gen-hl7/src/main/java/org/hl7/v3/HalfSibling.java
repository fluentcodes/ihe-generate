
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HalfSibling.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HalfSibling"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="HSIB"/&gt;
 *     &lt;enumeration value="HBRO"/&gt;
 *     &lt;enumeration value="HSIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HalfSibling")
@XmlEnum
public enum HalfSibling {

    HSIB,
    HBRO,
    HSIS;

    public String value() {
        return name();
    }

    public static HalfSibling fromValue(String v) {
        return valueOf(v);
    }

}
