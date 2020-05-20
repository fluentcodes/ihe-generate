
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeBagOfConceptDescriptors.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeBagOfConceptDescriptors"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="BAG&lt;CD&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeBagOfConceptDescriptors")
@XmlEnum
public enum DataTypeBagOfConceptDescriptors {

    @XmlEnumValue("BAG<CD>")
    BAG_CD("BAG<CD>");
    private final String value;

    DataTypeBagOfConceptDescriptors(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeBagOfConceptDescriptors fromValue(String v) {
        for (DataTypeBagOfConceptDescriptors c: DataTypeBagOfConceptDescriptors.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
