
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Ojibwayan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Ojibwayan"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-POT"/&gt;
 *     &lt;enumeration value="x-OJB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Ojibwayan")
@XmlEnum
public enum Ojibwayan {

    @XmlEnumValue("x-POT")
    X_POT("x-POT"),
    @XmlEnumValue("x-OJB")
    X_OJB("x-OJB");
    private final String value;

    Ojibwayan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Ojibwayan fromValue(String v) {
        for (Ojibwayan c: Ojibwayan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
