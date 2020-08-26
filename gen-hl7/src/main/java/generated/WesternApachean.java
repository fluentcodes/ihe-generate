
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WesternApachean.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="WesternApachean"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-NAV"/&gt;
 *     &lt;enumeration value="x-APM"/&gt;
 *     &lt;enumeration value="x-APW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WesternApachean")
@XmlEnum
public enum WesternApachean {

    @XmlEnumValue("x-NAV")
    X_NAV("x-NAV"),
    @XmlEnumValue("x-APM")
    X_APM("x-APM"),
    @XmlEnumValue("x-APW")
    X_APW("x-APW");
    private final String value;

    WesternApachean(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WesternApachean fromValue(String v) {
        for (WesternApachean c: WesternApachean.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
