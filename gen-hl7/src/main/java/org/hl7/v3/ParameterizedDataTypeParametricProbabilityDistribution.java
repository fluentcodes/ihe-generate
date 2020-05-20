
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParameterizedDataTypeParametricProbabilityDistribution.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeParametricProbabilityDistribution"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PPD&lt;T&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeParametricProbabilityDistribution")
@XmlEnum
public enum ParameterizedDataTypeParametricProbabilityDistribution {

    @XmlEnumValue("PPD<T>")
    PPD_T("PPD<T>");
    private final String value;

    ParameterizedDataTypeParametricProbabilityDistribution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeParametricProbabilityDistribution fromValue(String v) {
        for (ParameterizedDataTypeParametricProbabilityDistribution c: ParameterizedDataTypeParametricProbabilityDistribution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
