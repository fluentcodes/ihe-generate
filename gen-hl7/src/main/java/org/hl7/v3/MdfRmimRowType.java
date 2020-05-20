
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MdfRmimRowType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MdfRmimRowType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="assoc"/&gt;
 *     &lt;enumeration value="attr"/&gt;
 *     &lt;enumeration value="class"/&gt;
 *     &lt;enumeration value="rmim"/&gt;
 *     &lt;enumeration value="stc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MdfRmimRowType")
@XmlEnum
public enum MdfRmimRowType {

    @XmlEnumValue("assoc")
    ASSOC("assoc"),
    @XmlEnumValue("attr")
    ATTR("attr"),
    @XmlEnumValue("class")
    CLASS("class"),
    @XmlEnumValue("rmim")
    RMIM("rmim"),
    @XmlEnumValue("stc")
    STC("stc");
    private final String value;

    MdfRmimRowType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MdfRmimRowType fromValue(String v) {
        for (MdfRmimRowType c: MdfRmimRowType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
