
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DoseDurationLowDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DoseDurationLowDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DOSEDURL"/&gt;
 *     &lt;enumeration value="DOSEDURLIND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoseDurationLowDetectedIssueCode")
@XmlEnum
public enum DoseDurationLowDetectedIssueCode {

    DOSEDURL,
    DOSEDURLIND;

    public String value() {
        return name();
    }

    public static DoseDurationLowDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
