
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntravascularRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravascularRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="HEMODIFF"/&gt;
 *     &lt;enumeration value="IVASCINFUS"/&gt;
 *     &lt;enumeration value="HEMOPORT"/&gt;
 *     &lt;enumeration value="IVASCINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntravascularRoute")
@XmlEnum
public enum IntravascularRoute {

    HEMODIFF,
    IVASCINFUS,
    HEMOPORT,
    IVASCINJ;

    public String value() {
        return name();
    }

    public static IntravascularRoute fromValue(String v) {
        return valueOf(v);
    }

}
