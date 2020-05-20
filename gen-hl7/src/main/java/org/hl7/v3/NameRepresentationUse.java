
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NameRepresentationUse.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameRepresentationUse"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ABC"/&gt;
 *     &lt;enumeration value="IDE"/&gt;
 *     &lt;enumeration value="SYL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameRepresentationUse")
@XmlEnum
public enum NameRepresentationUse {

    ABC,
    IDE,
    SYL;

    public String value() {
        return name();
    }

    public static NameRepresentationUse fromValue(String v) {
        return valueOf(v);
    }

}
