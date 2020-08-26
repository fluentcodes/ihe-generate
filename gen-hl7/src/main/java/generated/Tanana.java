
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Tanana.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Tanana"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-TAA"/&gt;
 *     &lt;enumeration value="x-TCB"/&gt;
 *     &lt;enumeration value="x-TAU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Tanana")
@XmlEnum
public enum Tanana {

    @XmlEnumValue("x-TAA")
    X_TAA("x-TAA"),
    @XmlEnumValue("x-TCB")
    X_TCB("x-TCB"),
    @XmlEnumValue("x-TAU")
    X_TAU("x-TAU");
    private final String value;

    Tanana(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Tanana fromValue(String v) {
        for (Tanana c: Tanana.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
