
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeNonParametricProbabilityDistribution.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeNonParametricProbabilityDistribution"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NPPD&lt;ANY&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeNonParametricProbabilityDistribution")
@XmlEnum
public enum DataTypeNonParametricProbabilityDistribution {

    @XmlEnumValue("NPPD<ANY>")
    NPPD_ANY("NPPD<ANY>");
    private final String value;

    DataTypeNonParametricProbabilityDistribution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeNonParametricProbabilityDistribution fromValue(String v) {
        for (DataTypeNonParametricProbabilityDistribution c: DataTypeNonParametricProbabilityDistribution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
