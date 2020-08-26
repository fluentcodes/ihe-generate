
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeParametricProbabilityDistributionOfPhysicalQuantities.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeParametricProbabilityDistributionOfPhysicalQuantities"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PPD&lt;PQ&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeParametricProbabilityDistributionOfPhysicalQuantities")
@XmlEnum
public enum DataTypeParametricProbabilityDistributionOfPhysicalQuantities {

    @XmlEnumValue("PPD<PQ>")
    PPD_PQ("PPD<PQ>");
    private final String value;

    DataTypeParametricProbabilityDistributionOfPhysicalQuantities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeParametricProbabilityDistributionOfPhysicalQuantities fromValue(String v) {
        for (DataTypeParametricProbabilityDistributionOfPhysicalQuantities c: DataTypeParametricProbabilityDistributionOfPhysicalQuantities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
