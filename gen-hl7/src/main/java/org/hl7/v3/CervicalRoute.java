
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CervicalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CervicalRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CERVINJ"/&gt;
 *     &lt;enumeration value="CERVINS"/&gt;
 *     &lt;enumeration value="DENRINSE"/&gt;
 *     &lt;enumeration value="CERV"/&gt;
 *     &lt;enumeration value="DEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CervicalRoute")
@XmlEnum
public enum CervicalRoute {

    CERVINJ,
    CERVINS,
    DENRINSE,
    CERV,
    DEN;

    public String value() {
        return name();
    }

    public static CervicalRoute fromValue(String v) {
        return valueOf(v);
    }

}
