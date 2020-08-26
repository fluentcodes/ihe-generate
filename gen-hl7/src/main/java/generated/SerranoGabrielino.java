
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SerranoGabrielino.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SerranoGabrielino"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-SER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SerranoGabrielino")
@XmlEnum
public enum SerranoGabrielino {

    @XmlEnumValue("x-SER")
    X_SER("x-SER");
    private final String value;

    SerranoGabrielino(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SerranoGabrielino fromValue(String v) {
        for (SerranoGabrielino c: SerranoGabrielino.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
