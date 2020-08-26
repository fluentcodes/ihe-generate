
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeUncertainProbabilisticConceptDescriptor.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeUncertainProbabilisticConceptDescriptor"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="UVP&lt;CD&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeUncertainProbabilisticConceptDescriptor")
@XmlEnum
public enum DataTypeUncertainProbabilisticConceptDescriptor {

    @XmlEnumValue("UVP<CD>")
    UVP_CD("UVP<CD>");
    private final String value;

    DataTypeUncertainProbabilisticConceptDescriptor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeUncertainProbabilisticConceptDescriptor fromValue(String v) {
        for (DataTypeUncertainProbabilisticConceptDescriptor c: DataTypeUncertainProbabilisticConceptDescriptor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
