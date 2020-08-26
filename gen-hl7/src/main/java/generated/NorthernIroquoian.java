
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NorthernIroquoian.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NorthernIroquoian"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-CAY"/&gt;
 *     &lt;enumeration value="x-MOH"/&gt;
 *     &lt;enumeration value="x-ONE"/&gt;
 *     &lt;enumeration value="x-ONO"/&gt;
 *     &lt;enumeration value="x-SEE"/&gt;
 *     &lt;enumeration value="x-TUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NorthernIroquoian")
@XmlEnum
public enum NorthernIroquoian {

    @XmlEnumValue("x-CAY")
    X_CAY("x-CAY"),
    @XmlEnumValue("x-MOH")
    X_MOH("x-MOH"),
    @XmlEnumValue("x-ONE")
    X_ONE("x-ONE"),
    @XmlEnumValue("x-ONO")
    X_ONO("x-ONO"),
    @XmlEnumValue("x-SEE")
    X_SEE("x-SEE"),
    @XmlEnumValue("x-TUS")
    X_TUS("x-TUS");
    private final String value;

    NorthernIroquoian(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NorthernIroquoian fromValue(String v) {
        for (NorthernIroquoian c: NorthernIroquoian.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
