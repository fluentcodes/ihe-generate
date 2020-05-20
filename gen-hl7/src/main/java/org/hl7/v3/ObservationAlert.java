
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationAlert.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationAlert"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="OBSA"/&gt;
 *     &lt;enumeration value="AGE"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="GEND"/&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="LAB"/&gt;
 *     &lt;enumeration value="REACT"/&gt;
 *     &lt;enumeration value="RREACT"/&gt;
 *     &lt;enumeration value="CREACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationAlert")
@XmlEnum
public enum ObservationAlert {

    OBSA,
    AGE,
    COND,
    GEND,
    GEN,
    LAB,
    REACT,
    RREACT,
    CREACT;

    public String value() {
        return name();
    }

    public static ObservationAlert fromValue(String v) {
        return valueOf(v);
    }

}
