
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExtendedReleaseSuspension.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedReleaseSuspension"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ERSUSP"/&gt;
 *     &lt;enumeration value="ERSUSP12"/&gt;
 *     &lt;enumeration value="ERSUSP24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtendedReleaseSuspension")
@XmlEnum
public enum ExtendedReleaseSuspension {

    ERSUSP("ERSUSP"),
    @XmlEnumValue("ERSUSP12")
    ERSUSP_12("ERSUSP12"),
    @XmlEnumValue("ERSUSP24")
    ERSUSP_24("ERSUSP24");
    private final String value;

    ExtendedReleaseSuspension(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendedReleaseSuspension fromValue(String v) {
        for (ExtendedReleaseSuspension c: ExtendedReleaseSuspension.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
