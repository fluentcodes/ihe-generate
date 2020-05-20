
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DuplicateTherapyAlert.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplicateTherapyAlert"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DUPTHPY"/&gt;
 *     &lt;enumeration value="DUPTHPGEN"/&gt;
 *     &lt;enumeration value="DUPTHPCLS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DuplicateTherapyAlert")
@XmlEnum
public enum DuplicateTherapyAlert {

    DUPTHPY,
    DUPTHPGEN,
    DUPTHPCLS;

    public String value() {
        return name();
    }

    public static DuplicateTherapyAlert fromValue(String v) {
        return valueOf(v);
    }

}
