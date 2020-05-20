
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntrapulmonaryRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrapulmonaryRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EXTCORPINJ"/&gt;
 *     &lt;enumeration value="IPINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntrapulmonaryRoute")
@XmlEnum
public enum IntrapulmonaryRoute {

    EXTCORPINJ,
    IPINJ;

    public String value() {
        return name();
    }

    public static IntrapulmonaryRoute fromValue(String v) {
        return valueOf(v);
    }

}
