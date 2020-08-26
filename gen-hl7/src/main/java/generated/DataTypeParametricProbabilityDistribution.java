
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeParametricProbabilityDistribution.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeParametricProbabilityDistribution"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PPD&lt;QTY&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeParametricProbabilityDistribution")
@XmlEnum
public enum DataTypeParametricProbabilityDistribution {

    @XmlEnumValue("PPD<QTY>")
    PPD_QTY("PPD<QTY>");
    private final String value;

    DataTypeParametricProbabilityDistribution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeParametricProbabilityDistribution fromValue(String v) {
        for (DataTypeParametricProbabilityDistribution c: DataTypeParametricProbabilityDistribution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
