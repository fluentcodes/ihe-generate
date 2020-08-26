
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für River.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="River"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-MRC"/&gt;
 *     &lt;enumeration value="x-MOV"/&gt;
 *     &lt;enumeration value="x-YUM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "River")
@XmlEnum
public enum River {

    @XmlEnumValue("x-MRC")
    X_MRC("x-MRC"),
    @XmlEnumValue("x-MOV")
    X_MOV("x-MOV"),
    @XmlEnumValue("x-YUM")
    X_YUM("x-YUM");
    private final String value;

    River(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static River fromValue(String v) {
        for (River c: River.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
