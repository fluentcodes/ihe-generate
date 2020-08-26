
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CentralSalish.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CentralSalish"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-CLM"/&gt;
 *     &lt;enumeration value="x-LUT"/&gt;
 *     &lt;enumeration value="x-STR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CentralSalish")
@XmlEnum
public enum CentralSalish {

    @XmlEnumValue("x-CLM")
    X_CLM("x-CLM"),
    @XmlEnumValue("x-LUT")
    X_LUT("x-LUT"),
    @XmlEnumValue("x-STR")
    X_STR("x-STR");
    private final String value;

    CentralSalish(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CentralSalish fromValue(String v) {
        for (CentralSalish c: CentralSalish.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
