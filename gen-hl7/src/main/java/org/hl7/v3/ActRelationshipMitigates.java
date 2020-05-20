
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipMitigates.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipMitigates"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="MITGT"/&gt;
 *     &lt;enumeration value="RCVY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipMitigates")
@XmlEnum
public enum ActRelationshipMitigates {

    MITGT,
    RCVY;

    public String value() {
        return name();
    }

    public static ActRelationshipMitigates fromValue(String v) {
        return valueOf(v);
    }

}
