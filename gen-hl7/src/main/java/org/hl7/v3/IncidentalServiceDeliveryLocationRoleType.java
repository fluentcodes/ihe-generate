
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IncidentalServiceDeliveryLocationRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IncidentalServiceDeliveryLocationRoleType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="PTRES"/&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="SCHOOL"/&gt;
 *     &lt;enumeration value="WORK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IncidentalServiceDeliveryLocationRoleType")
@XmlEnum
public enum IncidentalServiceDeliveryLocationRoleType {

    COMM,
    PTRES,
    ACC,
    SCHOOL,
    WORK;

    public String value() {
        return name();
    }

    public static IncidentalServiceDeliveryLocationRoleType fromValue(String v) {
        return valueOf(v);
    }

}
