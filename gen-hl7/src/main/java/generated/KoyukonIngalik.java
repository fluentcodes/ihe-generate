
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für KoyukonIngalik.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="KoyukonIngalik"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-ING"/&gt;
 *     &lt;enumeration value="x-HOI"/&gt;
 *     &lt;enumeration value="x-KOY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KoyukonIngalik")
@XmlEnum
public enum KoyukonIngalik {

    @XmlEnumValue("x-ING")
    X_ING("x-ING"),
    @XmlEnumValue("x-HOI")
    X_HOI("x-HOI"),
    @XmlEnumValue("x-KOY")
    X_KOY("x-KOY");
    private final String value;

    KoyukonIngalik(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KoyukonIngalik fromValue(String v) {
        for (KoyukonIngalik c: KoyukonIngalik.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
