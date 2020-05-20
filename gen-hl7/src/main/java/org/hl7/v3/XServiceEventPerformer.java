
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ServiceEventPerformer.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ServiceEventPerformer"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *     &lt;enumeration value="SPRF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ServiceEventPerformer")
@XmlEnum
public enum XServiceEventPerformer {

    PRF,
    SPRF;

    public String value() {
        return name();
    }

    public static XServiceEventPerformer fromValue(String v) {
        return valueOf(v);
    }

}
