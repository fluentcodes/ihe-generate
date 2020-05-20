
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FontStyle.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FontStyle"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="bold"/&gt;
 *     &lt;enumeration value="emphasis"/&gt;
 *     &lt;enumeration value="italics"/&gt;
 *     &lt;enumeration value="underline"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FontStyle")
@XmlEnum
public enum FontStyle {

    @XmlEnumValue("bold")
    BOLD("bold"),
    @XmlEnumValue("emphasis")
    EMPHASIS("emphasis"),
    @XmlEnumValue("italics")
    ITALICS("italics"),
    @XmlEnumValue("underline")
    UNDERLINE("underline");
    private final String value;

    FontStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontStyle fromValue(String v) {
        for (FontStyle c: FontStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
