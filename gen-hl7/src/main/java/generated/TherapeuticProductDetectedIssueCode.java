
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TherapeuticProductDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TherapeuticProductDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TPROD"/&gt;
 *     &lt;enumeration value="DRG"/&gt;
 *     &lt;enumeration value="NHP"/&gt;
 *     &lt;enumeration value="NONRX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TherapeuticProductDetectedIssueCode")
@XmlEnum
public enum TherapeuticProductDetectedIssueCode {

    TPROD,
    DRG,
    NHP,
    NONRX;

    public String value() {
        return name();
    }

    public static TherapeuticProductDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
