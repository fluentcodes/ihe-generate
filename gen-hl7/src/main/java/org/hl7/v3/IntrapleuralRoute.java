
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntrapleuralRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrapleuralRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="IPLRINJ"/&gt;
 *     &lt;enumeration value="CTINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntrapleuralRoute")
@XmlEnum
public enum IntrapleuralRoute {

    IPLRINJ,
    CTINSTL;

    public String value() {
        return name();
    }

    public static IntrapleuralRoute fromValue(String v) {
        return valueOf(v);
    }

}
