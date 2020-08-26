
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeSetOfCodedSimpleValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeSetOfCodedSimpleValue"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SET&lt;CS&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeSetOfCodedSimpleValue")
@XmlEnum
public enum DataTypeSetOfCodedSimpleValue {

    @XmlEnumValue("SET<CS>")
    SET_CS("SET<CS>");
    private final String value;

    DataTypeSetOfCodedSimpleValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeSetOfCodedSimpleValue fromValue(String v) {
        for (DataTypeSetOfCodedSimpleValue c: DataTypeSetOfCodedSimpleValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
