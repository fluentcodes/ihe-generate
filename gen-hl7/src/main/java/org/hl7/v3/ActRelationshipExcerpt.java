
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipExcerpt.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipExcerpt"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="XCRPT"/&gt;
 *     &lt;enumeration value="VRXCRPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipExcerpt")
@XmlEnum
public enum ActRelationshipExcerpt {

    XCRPT,
    VRXCRPT;

    public String value() {
        return name();
    }

    public static ActRelationshipExcerpt fromValue(String v) {
        return valueOf(v);
    }

}
