
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntratrachealRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntratrachealRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ITRACHINSTIL"/&gt;
 *     &lt;enumeration value="ITRACHMAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntratrachealRoute")
@XmlEnum
public enum IntratrachealRoute {

    ITRACHINSTIL,
    ITRACHMAB;

    public String value() {
        return name();
    }

    public static IntratrachealRoute fromValue(String v) {
        return valueOf(v);
    }

}
