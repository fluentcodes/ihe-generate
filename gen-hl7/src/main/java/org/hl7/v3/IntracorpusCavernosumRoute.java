
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntracorpusCavernosumRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntracorpusCavernosumRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ICORPCAVINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntracorpusCavernosumRoute")
@XmlEnum
public enum IntracorpusCavernosumRoute {

    ICORPCAVINJ;

    public String value() {
        return name();
    }

    public static IntracorpusCavernosumRoute fromValue(String v) {
        return valueOf(v);
    }

}
