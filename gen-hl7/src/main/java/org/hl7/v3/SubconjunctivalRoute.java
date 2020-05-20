
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubconjunctivalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SubconjunctivalRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SCINJ"/&gt;
 *     &lt;enumeration value="SUBCONJTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubconjunctivalRoute")
@XmlEnum
public enum SubconjunctivalRoute {

    SCINJ,
    SUBCONJTA;

    public String value() {
        return name();
    }

    public static SubconjunctivalRoute fromValue(String v) {
        return valueOf(v);
    }

}
