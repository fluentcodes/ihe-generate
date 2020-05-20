
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_BasicConfidentialityKind.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_BasicConfidentialityKind"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_BasicConfidentialityKind")
@XmlEnum
public enum XBasicConfidentialityKind {

    N,
    R,
    V;

    public String value() {
        return name();
    }

    public static XBasicConfidentialityKind fromValue(String v) {
        return valueOf(v);
    }

}
