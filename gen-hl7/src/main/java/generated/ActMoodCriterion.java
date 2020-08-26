
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActMoodCriterion.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodCriterion"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CRT"/&gt;
 *     &lt;enumeration value="EVN.CRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMoodCriterion")
@XmlEnum
public enum ActMoodCriterion {

    CRT("CRT"),
    @XmlEnumValue("EVN.CRT")
    EVN_CRT("EVN.CRT");
    private final String value;

    ActMoodCriterion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActMoodCriterion fromValue(String v) {
        for (ActMoodCriterion c: ActMoodCriterion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
