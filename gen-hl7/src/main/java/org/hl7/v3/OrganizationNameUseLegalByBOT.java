
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OrganizationNameUseLegalByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationNameUseLegalByBOT"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrganizationNameUseLegalByBOT")
@XmlEnum
public enum OrganizationNameUseLegalByBOT {

    L,
    OR;

    public String value() {
        return name();
    }

    public static OrganizationNameUseLegalByBOT fromValue(String v) {
        return valueOf(v);
    }

}
