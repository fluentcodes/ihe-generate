
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeBagOfPhysicalQuantities.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeBagOfPhysicalQuantities"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BAG&lt;PQ&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeBagOfPhysicalQuantities")
@XmlEnum
public enum DataTypeBagOfPhysicalQuantities {

    @XmlEnumValue("BAG<PQ>")
    BAG_PQ("BAG<PQ>");
    private final String value;

    DataTypeBagOfPhysicalQuantities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeBagOfPhysicalQuantities fromValue(String v) {
        for (DataTypeBagOfPhysicalQuantities c: DataTypeBagOfPhysicalQuantities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
