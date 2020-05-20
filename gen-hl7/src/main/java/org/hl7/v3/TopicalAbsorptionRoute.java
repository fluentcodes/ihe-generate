
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TopicalAbsorptionRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TopicalAbsorptionRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="TTYMPTABSORP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TopicalAbsorptionRoute")
@XmlEnum
public enum TopicalAbsorptionRoute {

    TTYMPTABSORP;

    public String value() {
        return name();
    }

    public static TopicalAbsorptionRoute fromValue(String v) {
        return valueOf(v);
    }

}
