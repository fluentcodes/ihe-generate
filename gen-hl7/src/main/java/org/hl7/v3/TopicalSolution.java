
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TopicalSolution.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TopicalSolution"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="TOPSOL"/&gt;
 *     &lt;enumeration value="LIN"/&gt;
 *     &lt;enumeration value="MUCTOPSOL"/&gt;
 *     &lt;enumeration value="TINC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TopicalSolution")
@XmlEnum
public enum TopicalSolution {

    TOPSOL,
    LIN,
    MUCTOPSOL,
    TINC;

    public String value() {
        return name();
    }

    public static TopicalSolution fromValue(String v) {
        return valueOf(v);
    }

}
