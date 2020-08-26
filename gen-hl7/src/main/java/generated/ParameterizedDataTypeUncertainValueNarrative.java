
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParameterizedDataTypeUncertainValueNarrative.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeUncertainValueNarrative"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="UVN&lt;T&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeUncertainValueNarrative")
@XmlEnum
public enum ParameterizedDataTypeUncertainValueNarrative {

    @XmlEnumValue("UVN<T>")
    UVN_T("UVN<T>");
    private final String value;

    ParameterizedDataTypeUncertainValueNarrative(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeUncertainValueNarrative fromValue(String v) {
        for (ParameterizedDataTypeUncertainValueNarrative c: ParameterizedDataTypeUncertainValueNarrative.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
