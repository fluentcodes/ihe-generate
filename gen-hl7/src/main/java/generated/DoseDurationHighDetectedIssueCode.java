
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DoseDurationHighDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DoseDurationHighDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DOSEDURH"/&gt;
 *     &lt;enumeration value="DOSEDURHIND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoseDurationHighDetectedIssueCode")
@XmlEnum
public enum DoseDurationHighDetectedIssueCode {

    DOSEDURH,
    DOSEDURHIND;

    public String value() {
        return name();
    }

    public static DoseDurationHighDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
