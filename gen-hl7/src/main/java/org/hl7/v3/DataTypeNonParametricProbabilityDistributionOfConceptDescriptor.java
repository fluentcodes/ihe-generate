
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeNonParametricProbabilityDistributionOfConceptDescriptor.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeNonParametricProbabilityDistributionOfConceptDescriptor"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="NPPD&lt;CD&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeNonParametricProbabilityDistributionOfConceptDescriptor")
@XmlEnum
public enum DataTypeNonParametricProbabilityDistributionOfConceptDescriptor {

    @XmlEnumValue("NPPD<CD>")
    NPPD_CD("NPPD<CD>");
    private final String value;

    DataTypeNonParametricProbabilityDistributionOfConceptDescriptor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeNonParametricProbabilityDistributionOfConceptDescriptor fromValue(String v) {
        for (DataTypeNonParametricProbabilityDistributionOfConceptDescriptor c: DataTypeNonParametricProbabilityDistributionOfConceptDescriptor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
