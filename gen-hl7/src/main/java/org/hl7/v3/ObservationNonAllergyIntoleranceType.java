
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationNonAllergyIntoleranceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationNonAllergyIntoleranceType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="NAINT"/&gt;
 *     &lt;enumeration value="DNAINT"/&gt;
 *     &lt;enumeration value="ENAINT"/&gt;
 *     &lt;enumeration value="FNAINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationNonAllergyIntoleranceType")
@XmlEnum
public enum ObservationNonAllergyIntoleranceType {

    NAINT,
    DNAINT,
    ENAINT,
    FNAINT;

    public String value() {
        return name();
    }

    public static ObservationNonAllergyIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}
