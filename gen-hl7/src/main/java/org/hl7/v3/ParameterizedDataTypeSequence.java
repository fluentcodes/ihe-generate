
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParameterizedDataTypeSequence.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeSequence"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="LIST&lt;T&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeSequence")
@XmlEnum
public enum ParameterizedDataTypeSequence {

    @XmlEnumValue("LIST<T>")
    LIST_T("LIST<T>");
    private final String value;

    ParameterizedDataTypeSequence(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeSequence fromValue(String v) {
        for (ParameterizedDataTypeSequence c: ParameterizedDataTypeSequence.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
