
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EndocervicalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EndocervicalRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="AMNINJ"/&gt;
 *     &lt;enumeration value="BILINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EndocervicalRoute")
@XmlEnum
public enum EndocervicalRoute {

    AMNINJ,
    BILINJ;

    public String value() {
        return name();
    }

    public static EndocervicalRoute fromValue(String v) {
        return valueOf(v);
    }

}
