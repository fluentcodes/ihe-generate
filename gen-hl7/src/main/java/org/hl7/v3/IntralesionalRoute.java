
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntralesionalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntralesionalRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ILESINJ"/&gt;
 *     &lt;enumeration value="ILESIRR"/&gt;
 *     &lt;enumeration value="ILTOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntralesionalRoute")
@XmlEnum
public enum IntralesionalRoute {

    ILESINJ,
    ILESIRR,
    ILTOP;

    public String value() {
        return name();
    }

    public static IntralesionalRoute fromValue(String v) {
        return valueOf(v);
    }

}
