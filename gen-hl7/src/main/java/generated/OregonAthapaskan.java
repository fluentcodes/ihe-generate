
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OregonAthapaskan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OregonAthapaskan"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-TOL"/&gt;
 *     &lt;enumeration value="x-TUU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OregonAthapaskan")
@XmlEnum
public enum OregonAthapaskan {

    @XmlEnumValue("x-TOL")
    X_TOL("x-TOL"),
    @XmlEnumValue("x-TUU")
    X_TUU("x-TUU");
    private final String value;

    OregonAthapaskan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OregonAthapaskan fromValue(String v) {
        for (OregonAthapaskan c: OregonAthapaskan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
