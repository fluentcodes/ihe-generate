
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpperChinook.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UpperChinook"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-WAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpperChinook")
@XmlEnum
public enum UpperChinook {

    @XmlEnumValue("x-WAC")
    X_WAC("x-WAC");
    private final String value;

    UpperChinook(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpperChinook fromValue(String v) {
        for (UpperChinook c: UpperChinook.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
