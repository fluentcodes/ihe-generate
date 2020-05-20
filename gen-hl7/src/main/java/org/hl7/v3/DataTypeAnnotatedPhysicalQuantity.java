
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeAnnotatedPhysicalQuantity.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeAnnotatedPhysicalQuantity"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ANT&lt;PQ&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeAnnotatedPhysicalQuantity")
@XmlEnum
public enum DataTypeAnnotatedPhysicalQuantity {

    @XmlEnumValue("ANT<PQ>")
    ANT_PQ("ANT<PQ>");
    private final String value;

    DataTypeAnnotatedPhysicalQuantity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeAnnotatedPhysicalQuantity fromValue(String v) {
        for (DataTypeAnnotatedPhysicalQuantity c: DataTypeAnnotatedPhysicalQuantity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
