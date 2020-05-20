
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeHistoricalAddress.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeHistoricalAddress"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="HXIT&lt;AD&gt;"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeHistoricalAddress")
@XmlEnum
public enum DataTypeHistoricalAddress {

    @XmlEnumValue("HXIT<AD>")
    HXIT_AD("HXIT<AD>");
    private final String value;

    DataTypeHistoricalAddress(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeHistoricalAddress fromValue(String v) {
        for (DataTypeHistoricalAddress c: DataTypeHistoricalAddress.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
