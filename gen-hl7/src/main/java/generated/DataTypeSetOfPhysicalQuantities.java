
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeSetOfPhysicalQuantities.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeSetOfPhysicalQuantities"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SET&lt;PQ&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeSetOfPhysicalQuantities")
@XmlEnum
public enum DataTypeSetOfPhysicalQuantities {

    @XmlEnumValue("SET<PQ>")
    SET_PQ("SET<PQ>");
    private final String value;

    DataTypeSetOfPhysicalQuantities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeSetOfPhysicalQuantities fromValue(String v) {
        for (DataTypeSetOfPhysicalQuantities c: DataTypeSetOfPhysicalQuantities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
