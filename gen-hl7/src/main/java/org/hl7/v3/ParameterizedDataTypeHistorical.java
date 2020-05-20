
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParameterizedDataTypeHistorical.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeHistorical"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="HXIT&lt;T&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeHistorical")
@XmlEnum
public enum ParameterizedDataTypeHistorical {

    @XmlEnumValue("HXIT<T>")
    HXIT_T("HXIT<T>");
    private final String value;

    ParameterizedDataTypeHistorical(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeHistorical fromValue(String v) {
        for (ParameterizedDataTypeHistorical c: ParameterizedDataTypeHistorical.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
