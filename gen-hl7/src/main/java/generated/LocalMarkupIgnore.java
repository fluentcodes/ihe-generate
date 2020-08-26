
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocalMarkupIgnore.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalMarkupIgnore"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="markup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalMarkupIgnore")
@XmlEnum
public enum LocalMarkupIgnore {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("markup")
    MARKUP("markup");
    private final String value;

    LocalMarkupIgnore(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalMarkupIgnore fromValue(String v) {
        for (LocalMarkupIgnore c: LocalMarkupIgnore.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
