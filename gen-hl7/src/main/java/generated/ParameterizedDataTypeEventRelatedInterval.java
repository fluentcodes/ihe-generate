
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParameterizedDataTypeEventRelatedInterval.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeEventRelatedInterval"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EIVL&lt;T&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeEventRelatedInterval")
@XmlEnum
public enum ParameterizedDataTypeEventRelatedInterval {

    @XmlEnumValue("EIVL<T>")
    EIVL_T("EIVL<T>");
    private final String value;

    ParameterizedDataTypeEventRelatedInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeEventRelatedInterval fromValue(String v) {
        for (ParameterizedDataTypeEventRelatedInterval c: ParameterizedDataTypeEventRelatedInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
