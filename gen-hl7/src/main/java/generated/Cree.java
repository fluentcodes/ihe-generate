
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Cree.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Cree"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-CRP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Cree")
@XmlEnum
public enum Cree {

    @XmlEnumValue("x-CRP")
    X_CRP("x-CRP");
    private final String value;

    Cree(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Cree fromValue(String v) {
        for (Cree c: Cree.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
