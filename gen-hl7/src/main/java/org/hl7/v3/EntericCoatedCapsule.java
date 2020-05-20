
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntericCoatedCapsule.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntericCoatedCapsule"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ENTCAP"/&gt;
 *     &lt;enumeration value="ERENTCAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntericCoatedCapsule")
@XmlEnum
public enum EntericCoatedCapsule {

    ENTCAP,
    ERENTCAP;

    public String value() {
        return name();
    }

    public static EntericCoatedCapsule fromValue(String v) {
        return valueOf(v);
    }

}
