
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExtraAmnioticRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtraAmnioticRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EXTRAMNINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtraAmnioticRoute")
@XmlEnum
public enum ExtraAmnioticRoute {

    EXTRAMNINJ;

    public String value() {
        return name();
    }

    public static ExtraAmnioticRoute fromValue(String v) {
        return valueOf(v);
    }

}
