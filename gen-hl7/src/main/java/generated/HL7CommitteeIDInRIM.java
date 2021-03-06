
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HL7CommitteeIDInRIM.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HL7CommitteeIDInRIM"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="C02"/&gt;
 *     &lt;enumeration value="C06"/&gt;
 *     &lt;enumeration value="C09"/&gt;
 *     &lt;enumeration value="C00"/&gt;
 *     &lt;enumeration value="C04"/&gt;
 *     &lt;enumeration value="C03"/&gt;
 *     &lt;enumeration value="C12"/&gt;
 *     &lt;enumeration value="C10"/&gt;
 *     &lt;enumeration value="C20"/&gt;
 *     &lt;enumeration value="C01"/&gt;
 *     &lt;enumeration value="C21"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HL7CommitteeIDInRIM")
@XmlEnum
public enum HL7CommitteeIDInRIM {

    @XmlEnumValue("C02")
    C_02("C02"),
    @XmlEnumValue("C06")
    C_06("C06"),
    @XmlEnumValue("C09")
    C_09("C09"),
    @XmlEnumValue("C00")
    C_00("C00"),
    @XmlEnumValue("C04")
    C_04("C04"),
    @XmlEnumValue("C03")
    C_03("C03"),
    @XmlEnumValue("C12")
    C_12("C12"),
    @XmlEnumValue("C10")
    C_10("C10"),
    @XmlEnumValue("C20")
    C_20("C20"),
    @XmlEnumValue("C01")
    C_01("C01"),
    @XmlEnumValue("C21")
    C_21("C21");
    private final String value;

    HL7CommitteeIDInRIM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HL7CommitteeIDInRIM fromValue(String v) {
        for (HL7CommitteeIDInRIM c: HL7CommitteeIDInRIM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
