
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipTemporallyPertains.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipTemporallyPertains"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SAE"/&gt;
 *     &lt;enumeration value="SAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipTemporallyPertains")
@XmlEnum
public enum ActRelationshipTemporallyPertains {

    SAE,
    SAS;

    public String value() {
        return name();
    }

    public static ActRelationshipTemporallyPertains fromValue(String v) {
        return valueOf(v);
    }

}
