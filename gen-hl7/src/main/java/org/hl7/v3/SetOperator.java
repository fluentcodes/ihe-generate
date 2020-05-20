
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SetOperator.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SetOperator"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="_ValueSetOperator"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SetOperator")
@XmlEnum
public enum SetOperator {

    @XmlEnumValue("_ValueSetOperator")
    VALUE_SET_OPERATOR("_ValueSetOperator"),
    H("H"),
    E("E"),
    I("I"),
    A("A"),
    P("P");
    private final String value;

    SetOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetOperator fromValue(String v) {
        for (SetOperator c: SetOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
