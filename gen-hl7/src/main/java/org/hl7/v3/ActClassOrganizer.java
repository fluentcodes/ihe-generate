
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassOrganizer.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassOrganizer"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ORGANIZER"/&gt;
 *     &lt;enumeration value="CATEGORY"/&gt;
 *     &lt;enumeration value="DOCBODY"/&gt;
 *     &lt;enumeration value="DOCSECT"/&gt;
 *     &lt;enumeration value="TOPIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassOrganizer")
@XmlEnum
public enum ActClassOrganizer {

    ORGANIZER,
    CATEGORY,
    DOCBODY,
    DOCSECT,
    TOPIC;

    public String value() {
        return name();
    }

    public static ActClassOrganizer fromValue(String v) {
        return valueOf(v);
    }

}
