
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeIntervalOfIntegerNumbers.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeIntervalOfIntegerNumbers"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IVL&lt;INT&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeIntervalOfIntegerNumbers")
@XmlEnum
public enum DataTypeIntervalOfIntegerNumbers {

    @XmlEnumValue("IVL<INT>")
    IVL_INT("IVL<INT>");
    private final String value;

    DataTypeIntervalOfIntegerNumbers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeIntervalOfIntegerNumbers fromValue(String v) {
        for (DataTypeIntervalOfIntegerNumbers c: DataTypeIntervalOfIntegerNumbers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
