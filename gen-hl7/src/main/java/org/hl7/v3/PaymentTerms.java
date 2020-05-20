
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PaymentTerms.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTerms"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="N30"/&gt;
 *     &lt;enumeration value="N60"/&gt;
 *     &lt;enumeration value="N90"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentTerms")
@XmlEnum
public enum PaymentTerms {

    COD("COD"),
    @XmlEnumValue("N30")
    N_30("N30"),
    @XmlEnumValue("N60")
    N_60("N60"),
    @XmlEnumValue("N90")
    N_90("N90");
    private final String value;

    PaymentTerms(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTerms fromValue(String v) {
        for (PaymentTerms c: PaymentTerms.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
