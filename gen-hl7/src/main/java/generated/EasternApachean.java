
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EasternApachean.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EasternApachean"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-APJ"/&gt;
 *     &lt;enumeration value="x-APL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EasternApachean")
@XmlEnum
public enum EasternApachean {

    @XmlEnumValue("x-APJ")
    X_APJ("x-APJ"),
    @XmlEnumValue("x-APL")
    X_APL("x-APL");
    private final String value;

    EasternApachean(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EasternApachean fromValue(String v) {
        for (EasternApachean c: EasternApachean.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
