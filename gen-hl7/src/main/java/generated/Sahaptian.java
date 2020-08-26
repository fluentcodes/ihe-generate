
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Sahaptian.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Sahaptian"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-WAR"/&gt;
 *     &lt;enumeration value="x-UMA"/&gt;
 *     &lt;enumeration value="x-WAA"/&gt;
 *     &lt;enumeration value="x-YAK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Sahaptian")
@XmlEnum
public enum Sahaptian {

    @XmlEnumValue("x-WAR")
    X_WAR("x-WAR"),
    @XmlEnumValue("x-UMA")
    X_UMA("x-UMA"),
    @XmlEnumValue("x-WAA")
    X_WAA("x-WAA"),
    @XmlEnumValue("x-YAK")
    X_YAK("x-YAK");
    private final String value;

    Sahaptian(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Sahaptian fromValue(String v) {
        for (Sahaptian c: Sahaptian.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
