
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeUncertainNarrativeConceptDescriptor.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeUncertainNarrativeConceptDescriptor"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="UVN&lt;CD&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeUncertainNarrativeConceptDescriptor")
@XmlEnum
public enum DataTypeUncertainNarrativeConceptDescriptor {

    @XmlEnumValue("UVN<CD>")
    UVN_CD("UVN<CD>");
    private final String value;

    DataTypeUncertainNarrativeConceptDescriptor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeUncertainNarrativeConceptDescriptor fromValue(String v) {
        for (DataTypeUncertainNarrativeConceptDescriptor c: DataTypeUncertainNarrativeConceptDescriptor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
