
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Dakotan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Dakotan"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-ASB"/&gt;
 *     &lt;enumeration value="x-DHG"/&gt;
 *     &lt;enumeration value="x-LKT"/&gt;
 *     &lt;enumeration value="x-NKT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Dakotan")
@XmlEnum
public enum Dakotan {

    @XmlEnumValue("x-ASB")
    X_ASB("x-ASB"),
    @XmlEnumValue("x-DHG")
    X_DHG("x-DHG"),
    @XmlEnumValue("x-LKT")
    X_LKT("x-LKT"),
    @XmlEnumValue("x-NKT")
    X_NKT("x-NKT");
    private final String value;

    Dakotan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dakotan fromValue(String v) {
        for (Dakotan c: Dakotan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
