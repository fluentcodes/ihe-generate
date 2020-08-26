
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CentralMuskogean.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CentralMuskogean"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="x-AKZ"/&gt;
 *     &lt;enumeration value="x-CKU"/&gt;
 *     &lt;enumeration value="x-MIK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CentralMuskogean")
@XmlEnum
public enum CentralMuskogean {

    @XmlEnumValue("x-AKZ")
    X_AKZ("x-AKZ"),
    @XmlEnumValue("x-CKU")
    X_CKU("x-CKU"),
    @XmlEnumValue("x-MIK")
    X_MIK("x-MIK");
    private final String value;

    CentralMuskogean(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CentralMuskogean fromValue(String v) {
        for (CentralMuskogean c: CentralMuskogean.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
