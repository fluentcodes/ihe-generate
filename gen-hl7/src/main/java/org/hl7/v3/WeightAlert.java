
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WeightAlert.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="WeightAlert"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DOSEHINDW"/&gt;
 *     &lt;enumeration value="DOSELINDW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightAlert")
@XmlEnum
public enum WeightAlert {

    DOSEHINDW,
    DOSELINDW;

    public String value() {
        return name();
    }

    public static WeightAlert fromValue(String v) {
        return valueOf(v);
    }

}
