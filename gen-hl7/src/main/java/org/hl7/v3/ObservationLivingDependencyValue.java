
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationLivingDependencyValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationLivingDependencyValue"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="LIVDEP"/&gt;
 *     &lt;enumeration value="RELDEP"/&gt;
 *     &lt;enumeration value="SPSDEP"/&gt;
 *     &lt;enumeration value="URELDEP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationLivingDependencyValue")
@XmlEnum
public enum ObservationLivingDependencyValue {

    LIVDEP,
    RELDEP,
    SPSDEP,
    URELDEP;

    public String value() {
        return name();
    }

    public static ObservationLivingDependencyValue fromValue(String v) {
        return valueOf(v);
    }

}
