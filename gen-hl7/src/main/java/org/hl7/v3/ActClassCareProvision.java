
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassCareProvision.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassCareProvision"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PCPR"/&gt;
 *     &lt;enumeration value="ENC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassCareProvision")
@XmlEnum
public enum ActClassCareProvision {

    PCPR,
    ENC;

    public String value() {
        return name();
    }

    public static ActClassCareProvision fromValue(String v) {
        return valueOf(v);
    }

}
