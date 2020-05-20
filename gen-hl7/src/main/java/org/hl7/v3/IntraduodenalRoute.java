
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntraduodenalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraduodenalRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="IDUODINSTIL"/&gt;
 *     &lt;enumeration value="IDOUDMAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntraduodenalRoute")
@XmlEnum
public enum IntraduodenalRoute {

    IDUODINSTIL,
    IDOUDMAB;

    public String value() {
        return name();
    }

    public static IntraduodenalRoute fromValue(String v) {
        return valueOf(v);
    }

}
