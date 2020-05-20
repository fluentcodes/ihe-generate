
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActRelationshipPatientTransport.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipPatientTransport"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ARR"/&gt;
 *     &lt;enumeration value="DEP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipPatientTransport")
@XmlEnum
public enum XActRelationshipPatientTransport {

    ARR,
    DEP;

    public String value() {
        return name();
    }

    public static XActRelationshipPatientTransport fromValue(String v) {
        return valueOf(v);
    }

}
