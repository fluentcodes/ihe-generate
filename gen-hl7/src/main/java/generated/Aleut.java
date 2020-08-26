
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Aleut.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Aleut"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-ALW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Aleut")
@XmlEnum
public enum Aleut {

    @XmlEnumValue("x-ALW")
    X_ALW("x-ALW");
    private final String value;

    Aleut(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Aleut fromValue(String v) {
        for (Aleut c: Aleut.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
