
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleClassExposureAgentCarrier.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassExposureAgentCarrier"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EXPAGTCAR"/&gt;
 *     &lt;enumeration value="EXPVECTOR"/&gt;
 *     &lt;enumeration value="FOMITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassExposureAgentCarrier")
@XmlEnum
public enum RoleClassExposureAgentCarrier {

    EXPAGTCAR,
    EXPVECTOR,
    FOMITE;

    public String value() {
        return name();
    }

    public static RoleClassExposureAgentCarrier fromValue(String v) {
        return valueOf(v);
    }

}
