
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SirenikskiYupik.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SirenikskiYupik"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-ESU"/&gt;
 *     &lt;enumeration value="x-ESS"/&gt;
 *     &lt;enumeration value="x-EMS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SirenikskiYupik")
@XmlEnum
public enum SirenikskiYupik {

    @XmlEnumValue("x-ESU")
    X_ESU("x-ESU"),
    @XmlEnumValue("x-ESS")
    X_ESS("x-ESS"),
    @XmlEnumValue("x-EMS")
    X_EMS("x-EMS");
    private final String value;

    SirenikskiYupik(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SirenikskiYupik fromValue(String v) {
        for (SirenikskiYupik c: SirenikskiYupik.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
