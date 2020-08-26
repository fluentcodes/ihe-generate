
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Diegueno.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Diegueno"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-DIH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Diegueno")
@XmlEnum
public enum Diegueno {

    @XmlEnumValue("x-DIH")
    X_DIH("x-DIH");
    private final String value;

    Diegueno(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Diegueno fromValue(String v) {
        for (Diegueno c: Diegueno.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
