
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntrapericardialRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrapericardialRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="IPCARDINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntrapericardialRoute")
@XmlEnum
public enum IntrapericardialRoute {

    IPCARDINJ;

    public String value() {
        return name();
    }

    public static IntrapericardialRoute fromValue(String v) {
        return valueOf(v);
    }

}
