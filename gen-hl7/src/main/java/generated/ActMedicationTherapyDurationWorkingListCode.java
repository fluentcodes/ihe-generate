
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActMedicationTherapyDurationWorkingListCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMedicationTherapyDurationWorkingListCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PRN"/&gt;
 *     &lt;enumeration value="CHRON"/&gt;
 *     &lt;enumeration value="ONET"/&gt;
 *     &lt;enumeration value="ACU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMedicationTherapyDurationWorkingListCode")
@XmlEnum
public enum ActMedicationTherapyDurationWorkingListCode {

    PRN,
    CHRON,
    ONET,
    ACU;

    public String value() {
        return name();
    }

    public static ActMedicationTherapyDurationWorkingListCode fromValue(String v) {
        return valueOf(v);
    }

}
