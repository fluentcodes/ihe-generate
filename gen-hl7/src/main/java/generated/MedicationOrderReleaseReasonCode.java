
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MedicationOrderReleaseReasonCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationOrderReleaseReasonCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="HOLDINAP"/&gt;
 *     &lt;enumeration value="HOLDDONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MedicationOrderReleaseReasonCode")
@XmlEnum
public enum MedicationOrderReleaseReasonCode {

    HOLDINAP,
    HOLDDONE;

    public String value() {
        return name();
    }

    public static MedicationOrderReleaseReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
