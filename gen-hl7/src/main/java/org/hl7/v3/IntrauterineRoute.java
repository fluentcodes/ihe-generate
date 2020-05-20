
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntrauterineRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrauterineRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="IURETINJ"/&gt;
 *     &lt;enumeration value="IUINJ"/&gt;
 *     &lt;enumeration value="IU"/&gt;
 *     &lt;enumeration value="IUINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntrauterineRoute")
@XmlEnum
public enum IntrauterineRoute {

    IURETINJ,
    IUINJ,
    IU,
    IUINSTL;

    public String value() {
        return name();
    }

    public static IntrauterineRoute fromValue(String v) {
        return valueOf(v);
    }

}
