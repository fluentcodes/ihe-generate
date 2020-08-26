
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AgeDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AGE"/&gt;
 *     &lt;enumeration value="DOSEHINDA"/&gt;
 *     &lt;enumeration value="DOSELINDA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgeDetectedIssueCode")
@XmlEnum
public enum AgeDetectedIssueCode {

    AGE,
    DOSEHINDA,
    DOSELINDA;

    public String value() {
        return name();
    }

    public static AgeDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
