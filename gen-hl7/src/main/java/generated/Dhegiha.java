
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Dhegiha.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Dhegiha"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-KAA"/&gt;
 *     &lt;enumeration value="x-OMA"/&gt;
 *     &lt;enumeration value="x-OSA"/&gt;
 *     &lt;enumeration value="x-QUA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Dhegiha")
@XmlEnum
public enum Dhegiha {

    @XmlEnumValue("x-KAA")
    X_KAA("x-KAA"),
    @XmlEnumValue("x-OMA")
    X_OMA("x-OMA"),
    @XmlEnumValue("x-OSA")
    X_OSA("x-OSA"),
    @XmlEnumValue("x-QUA")
    X_QUA("x-QUA");
    private final String value;

    Dhegiha(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dhegiha fromValue(String v) {
        for (Dhegiha c: Dhegiha.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
