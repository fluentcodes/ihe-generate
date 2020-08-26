
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Ritwan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Ritwan"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-YUR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Ritwan")
@XmlEnum
public enum Ritwan {

    @XmlEnumValue("x-YUR")
    X_YUR("x-YUR");
    private final String value;

    Ritwan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Ritwan fromValue(String v) {
        for (Ritwan c: Ritwan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
