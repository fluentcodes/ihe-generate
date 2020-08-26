
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExtendedReleaseCapsule.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedReleaseCapsule"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ERCAP"/&gt;
 *     &lt;enumeration value="ERCAP12"/&gt;
 *     &lt;enumeration value="ERCAP24"/&gt;
 *     &lt;enumeration value="ERECCAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtendedReleaseCapsule")
@XmlEnum
public enum ExtendedReleaseCapsule {

    ERCAP("ERCAP"),
    @XmlEnumValue("ERCAP12")
    ERCAP_12("ERCAP12"),
    @XmlEnumValue("ERCAP24")
    ERCAP_24("ERCAP24"),
    ERECCAP("ERECCAP");
    private final String value;

    ExtendedReleaseCapsule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendedReleaseCapsule fromValue(String v) {
        for (ExtendedReleaseCapsule c: ExtendedReleaseCapsule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
