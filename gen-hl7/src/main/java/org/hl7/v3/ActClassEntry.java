
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassEntry.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassEntry"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ENTRY"/&gt;
 *     &lt;enumeration value="CLUSTER"/&gt;
 *     &lt;enumeration value="BATTERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassEntry")
@XmlEnum
public enum ActClassEntry {

    ENTRY,
    CLUSTER,
    BATTERY;

    public String value() {
        return name();
    }

    public static ActClassEntry fromValue(String v) {
        return valueOf(v);
    }

}
