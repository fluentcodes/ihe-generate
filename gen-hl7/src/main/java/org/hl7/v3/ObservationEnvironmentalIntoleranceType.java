
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationEnvironmentalIntoleranceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationEnvironmentalIntoleranceType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EINT"/&gt;
 *     &lt;enumeration value="EALG"/&gt;
 *     &lt;enumeration value="ENAINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationEnvironmentalIntoleranceType")
@XmlEnum
public enum ObservationEnvironmentalIntoleranceType {

    EINT,
    EALG,
    ENAINT;

    public String value() {
        return name();
    }

    public static ObservationEnvironmentalIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}
