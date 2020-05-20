
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MDFSubjectAreaPrefix.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MDFSubjectAreaPrefix"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="COI"/&gt;
 *     &lt;enumeration value="DIM"/&gt;
 *     &lt;enumeration value="RIM"/&gt;
 *     &lt;enumeration value="STW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MDFSubjectAreaPrefix")
@XmlEnum
public enum MDFSubjectAreaPrefix {

    COI,
    DIM,
    RIM,
    STW;

    public String value() {
        return name();
    }

    public static MDFSubjectAreaPrefix fromValue(String v) {
        return valueOf(v);
    }

}
