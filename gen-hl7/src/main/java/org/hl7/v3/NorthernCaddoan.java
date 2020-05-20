
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NorthernCaddoan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NorthernCaddoan"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-ARI"/&gt;
 *     &lt;enumeration value="x-PAW"/&gt;
 *     &lt;enumeration value="x-WIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NorthernCaddoan")
@XmlEnum
public enum NorthernCaddoan {

    @XmlEnumValue("x-ARI")
    X_ARI("x-ARI"),
    @XmlEnumValue("x-PAW")
    X_PAW("x-PAW"),
    @XmlEnumValue("x-WIC")
    X_WIC("x-WIC");
    private final String value;

    NorthernCaddoan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NorthernCaddoan fromValue(String v) {
        for (NorthernCaddoan c: NorthernCaddoan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
