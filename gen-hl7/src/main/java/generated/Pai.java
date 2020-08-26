
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Pai.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Pai"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-YUF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Pai")
@XmlEnum
public enum Pai {

    @XmlEnumValue("x-YUF")
    X_YUF("x-YUF");
    private final String value;

    Pai(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Pai fromValue(String v) {
        for (Pai c: Pai.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
