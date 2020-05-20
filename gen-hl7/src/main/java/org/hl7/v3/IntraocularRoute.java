
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntraocularRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraocularRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="IOINJ"/&gt;
 *     &lt;enumeration value="IOSURGINS"/&gt;
 *     &lt;enumeration value="IOINSTL"/&gt;
 *     &lt;enumeration value="IOIRR"/&gt;
 *     &lt;enumeration value="IOTOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntraocularRoute")
@XmlEnum
public enum IntraocularRoute {

    IOINJ,
    IOSURGINS,
    IOINSTL,
    IOIRR,
    IOTOP;

    public String value() {
        return name();
    }

    public static IntraocularRoute fromValue(String v) {
        return valueOf(v);
    }

}
