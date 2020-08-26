
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Keresan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Keresan"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-KJQ"/&gt;
 *     &lt;enumeration value="x-KEE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Keresan")
@XmlEnum
public enum Keresan {

    @XmlEnumValue("x-KJQ")
    X_KJQ("x-KJQ"),
    @XmlEnumValue("x-KEE")
    X_KEE("x-KEE");
    private final String value;

    Keresan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Keresan fromValue(String v) {
        for (Keresan c: Keresan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
