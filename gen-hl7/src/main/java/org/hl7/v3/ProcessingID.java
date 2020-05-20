
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProcessingID.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingID"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessingID")
@XmlEnum
public enum ProcessingID {

    D,
    P,
    T;

    public String value() {
        return name();
    }

    public static ProcessingID fromValue(String v) {
        return valueOf(v);
    }

}
