
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TimingDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TimingDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TIME"/&gt;
 *     &lt;enumeration value="ENDLATE"/&gt;
 *     &lt;enumeration value="STRTLATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimingDetectedIssueCode")
@XmlEnum
public enum TimingDetectedIssueCode {

    TIME,
    ENDLATE,
    STRTLATE;

    public String value() {
        return name();
    }

    public static TimingDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
