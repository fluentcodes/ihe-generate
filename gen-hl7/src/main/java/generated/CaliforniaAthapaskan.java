
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CaliforniaAthapaskan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CaliforniaAthapaskan"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-KTW"/&gt;
 *     &lt;enumeration value="x-HUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaliforniaAthapaskan")
@XmlEnum
public enum CaliforniaAthapaskan {

    @XmlEnumValue("x-KTW")
    X_KTW("x-KTW"),
    @XmlEnumValue("x-HUP")
    X_HUP("x-HUP");
    private final String value;

    CaliforniaAthapaskan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaliforniaAthapaskan fromValue(String v) {
        for (CaliforniaAthapaskan c: CaliforniaAthapaskan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
