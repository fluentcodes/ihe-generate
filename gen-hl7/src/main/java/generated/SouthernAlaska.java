
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SouthernAlaska.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SouthernAlaska"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-AHT"/&gt;
 *     &lt;enumeration value="x-TFN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SouthernAlaska")
@XmlEnum
public enum SouthernAlaska {

    @XmlEnumValue("x-AHT")
    X_AHT("x-AHT"),
    @XmlEnumValue("x-TFN")
    X_TFN("x-TFN");
    private final String value;

    SouthernAlaska(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SouthernAlaska fromValue(String v) {
        for (SouthernAlaska c: SouthernAlaska.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
