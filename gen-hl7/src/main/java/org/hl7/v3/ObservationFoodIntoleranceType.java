
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationFoodIntoleranceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationFoodIntoleranceType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="FINT"/&gt;
 *     &lt;enumeration value="FALG"/&gt;
 *     &lt;enumeration value="FNAINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationFoodIntoleranceType")
@XmlEnum
public enum ObservationFoodIntoleranceType {

    FINT,
    FALG,
    FNAINT;

    public String value() {
        return name();
    }

    public static ObservationFoodIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}
