
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SkinRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SkinRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="OCDRESTA"/&gt;
 *     &lt;enumeration value="SKIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SkinRoute")
@XmlEnum
public enum SkinRoute {

    OCDRESTA,
    SKIN;

    public String value() {
        return name();
    }

    public static SkinRoute fromValue(String v) {
        return valueOf(v);
    }

}
