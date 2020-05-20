
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PastSubset.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PastSubset"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PAST"/&gt;
 *     &lt;enumeration value="FIRST"/&gt;
 *     &lt;enumeration value="RECENT"/&gt;
 *     &lt;enumeration value="PREVSUM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PastSubset")
@XmlEnum
public enum PastSubset {

    PAST,
    FIRST,
    RECENT,
    PREVSUM;

    public String value() {
        return name();
    }

    public static PastSubset fromValue(String v) {
        return valueOf(v);
    }

}
