
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeSetOfCodedWithEquivalents.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeSetOfCodedWithEquivalents"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SET&lt;CE&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeSetOfCodedWithEquivalents")
@XmlEnum
public enum DataTypeSetOfCodedWithEquivalents {

    @XmlEnumValue("SET<CE>")
    SET_CE("SET<CE>");
    private final String value;

    DataTypeSetOfCodedWithEquivalents(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeSetOfCodedWithEquivalents fromValue(String v) {
        for (DataTypeSetOfCodedWithEquivalents c: DataTypeSetOfCodedWithEquivalents.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
