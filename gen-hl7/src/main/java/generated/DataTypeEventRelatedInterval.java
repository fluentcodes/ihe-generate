
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeEventRelatedInterval.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeEventRelatedInterval"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EIVL&lt;TS&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeEventRelatedInterval")
@XmlEnum
public enum DataTypeEventRelatedInterval {

    @XmlEnumValue("EIVL<TS>")
    EIVL_TS("EIVL<TS>");
    private final String value;

    DataTypeEventRelatedInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeEventRelatedInterval fromValue(String v) {
        for (DataTypeEventRelatedInterval c: DataTypeEventRelatedInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
