
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActTaskMedicationListReviewCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskMedicationListReviewCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="MLREV"/&gt;
 *     &lt;enumeration value="MARWLREV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActTaskMedicationListReviewCode")
@XmlEnum
public enum ActTaskMedicationListReviewCode {

    MLREV,
    MARWLREV;

    public String value() {
        return name();
    }

    public static ActTaskMedicationListReviewCode fromValue(String v) {
        return valueOf(v);
    }

}
