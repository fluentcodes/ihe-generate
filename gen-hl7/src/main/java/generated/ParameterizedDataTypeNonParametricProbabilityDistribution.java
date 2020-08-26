
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParameterizedDataTypeNonParametricProbabilityDistribution.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeNonParametricProbabilityDistribution"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NPPD&lt;T&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeNonParametricProbabilityDistribution")
@XmlEnum
public enum ParameterizedDataTypeNonParametricProbabilityDistribution {

    @XmlEnumValue("NPPD<T>")
    NPPD_T("NPPD<T>");
    private final String value;

    ParameterizedDataTypeNonParametricProbabilityDistribution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeNonParametricProbabilityDistribution fromValue(String v) {
        for (ParameterizedDataTypeNonParametricProbabilityDistribution c: ParameterizedDataTypeNonParametricProbabilityDistribution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
