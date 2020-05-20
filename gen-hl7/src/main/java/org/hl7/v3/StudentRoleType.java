
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StudentRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StudentRoleType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="STUD"/&gt;
 *     &lt;enumeration value="FSTUD"/&gt;
 *     &lt;enumeration value="PSTUD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StudentRoleType")
@XmlEnum
public enum StudentRoleType {

    STUD,
    FSTUD,
    PSTUD;

    public String value() {
        return name();
    }

    public static StudentRoleType fromValue(String v) {
        return valueOf(v);
    }

}
