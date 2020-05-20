
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubcutaneousRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SubcutaneousRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SQIMPLNT"/&gt;
 *     &lt;enumeration value="SQINFUS"/&gt;
 *     &lt;enumeration value="IPUMPINJ"/&gt;
 *     &lt;enumeration value="SQ"/&gt;
 *     &lt;enumeration value="SQSURGINS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubcutaneousRoute")
@XmlEnum
public enum SubcutaneousRoute {

    SQIMPLNT,
    SQINFUS,
    IPUMPINJ,
    SQ,
    SQSURGINS;

    public String value() {
        return name();
    }

    public static SubcutaneousRoute fromValue(String v) {
        return valueOf(v);
    }

}
