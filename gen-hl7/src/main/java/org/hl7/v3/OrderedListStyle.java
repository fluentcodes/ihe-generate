
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OrderedListStyle.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderedListStyle"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="Arabic"/&gt;
 *     &lt;enumeration value="BigAlpha"/&gt;
 *     &lt;enumeration value="BigRoman"/&gt;
 *     &lt;enumeration value="LittleAlpha"/&gt;
 *     &lt;enumeration value="LittleRoman"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderedListStyle")
@XmlEnum
public enum OrderedListStyle {

    @XmlEnumValue("Arabic")
    ARABIC("Arabic"),
    @XmlEnumValue("BigAlpha")
    BIG_ALPHA("BigAlpha"),
    @XmlEnumValue("BigRoman")
    BIG_ROMAN("BigRoman"),
    @XmlEnumValue("LittleAlpha")
    LITTLE_ALPHA("LittleAlpha"),
    @XmlEnumValue("LittleRoman")
    LITTLE_ROMAN("LittleRoman");
    private final String value;

    OrderedListStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderedListStyle fromValue(String v) {
        for (OrderedListStyle c: OrderedListStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
