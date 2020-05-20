
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UnorderedListStyle.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UnorderedListStyle"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="Circle"/&gt;
 *     &lt;enumeration value="Disc"/&gt;
 *     &lt;enumeration value="Square"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnorderedListStyle")
@XmlEnum
public enum UnorderedListStyle {

    @XmlEnumValue("Circle")
    CIRCLE("Circle"),
    @XmlEnumValue("Disc")
    DISC("Disc"),
    @XmlEnumValue("Square")
    SQUARE("Square");
    private final String value;

    UnorderedListStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnorderedListStyle fromValue(String v) {
        for (UnorderedListStyle c: UnorderedListStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
