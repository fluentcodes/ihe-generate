
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HairRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HairRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SHAMPOO"/&gt;
 *     &lt;enumeration value="HAIR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HairRoute")
@XmlEnum
public enum HairRoute {

    SHAMPOO,
    HAIR;

    public String value() {
        return name();
    }

    public static HairRoute fromValue(String v) {
        return valueOf(v);
    }

}
