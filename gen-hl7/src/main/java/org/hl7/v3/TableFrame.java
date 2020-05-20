
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TableFrame.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TableFrame"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="above"/&gt;
 *     &lt;enumeration value="below"/&gt;
 *     &lt;enumeration value="border"/&gt;
 *     &lt;enumeration value="box"/&gt;
 *     &lt;enumeration value="hsides"/&gt;
 *     &lt;enumeration value="lhs"/&gt;
 *     &lt;enumeration value="rhs"/&gt;
 *     &lt;enumeration value="void"/&gt;
 *     &lt;enumeration value="vsides"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TableFrame")
@XmlEnum
public enum TableFrame {

    @XmlEnumValue("above")
    ABOVE("above"),
    @XmlEnumValue("below")
    BELOW("below"),
    @XmlEnumValue("border")
    BORDER("border"),
    @XmlEnumValue("box")
    BOX("box"),
    @XmlEnumValue("hsides")
    HSIDES("hsides"),
    @XmlEnumValue("lhs")
    LHS("lhs"),
    @XmlEnumValue("rhs")
    RHS("rhs"),
    @XmlEnumValue("void")
    VOID("void"),
    @XmlEnumValue("vsides")
    VSIDES("vsides");
    private final String value;

    TableFrame(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableFrame fromValue(String v) {
        for (TableFrame c: TableFrame.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
