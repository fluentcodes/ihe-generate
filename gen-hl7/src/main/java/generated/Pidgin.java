
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Pidgin.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Pidgin"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-CHH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Pidgin")
@XmlEnum
public enum Pidgin {

    @XmlEnumValue("x-CHH")
    X_CHH("x-CHH");
    private final String value;

    Pidgin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Pidgin fromValue(String v) {
        for (Pidgin c: Pidgin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
