
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActNonObservationIndicationCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActNonObservationIndicationCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IND02"/&gt;
 *     &lt;enumeration value="IND01"/&gt;
 *     &lt;enumeration value="IND05"/&gt;
 *     &lt;enumeration value="IND03"/&gt;
 *     &lt;enumeration value="IND04"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActNonObservationIndicationCode")
@XmlEnum
public enum ActNonObservationIndicationCode {

    @XmlEnumValue("IND02")
    IND_02("IND02"),
    @XmlEnumValue("IND01")
    IND_01("IND01"),
    @XmlEnumValue("IND05")
    IND_05("IND05"),
    @XmlEnumValue("IND03")
    IND_03("IND03"),
    @XmlEnumValue("IND04")
    IND_04("IND04");
    private final String value;

    ActNonObservationIndicationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActNonObservationIndicationCode fromValue(String v) {
        for (ActNonObservationIndicationCode c: ActNonObservationIndicationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
