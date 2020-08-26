
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParameterizedDataTypeUncertainValueProbabilistic.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeUncertainValueProbabilistic"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="UVP&lt;T&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeUncertainValueProbabilistic")
@XmlEnum
public enum ParameterizedDataTypeUncertainValueProbabilistic {

    @XmlEnumValue("UVP<T>")
    UVP_T("UVP<T>");
    private final String value;

    ParameterizedDataTypeUncertainValueProbabilistic(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeUncertainValueProbabilistic fromValue(String v) {
        for (ParameterizedDataTypeUncertainValueProbabilistic c: ParameterizedDataTypeUncertainValueProbabilistic.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
