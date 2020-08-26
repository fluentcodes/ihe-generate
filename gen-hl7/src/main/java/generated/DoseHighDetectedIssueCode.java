
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DoseHighDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DoseHighDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DOSEH"/&gt;
 *     &lt;enumeration value="DOSEHINDA"/&gt;
 *     &lt;enumeration value="DOSEHINDSA"/&gt;
 *     &lt;enumeration value="DOSEHIND"/&gt;
 *     &lt;enumeration value="DOSEHINDW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoseHighDetectedIssueCode")
@XmlEnum
public enum DoseHighDetectedIssueCode {

    DOSEH,
    DOSEHINDA,
    DOSEHINDSA,
    DOSEHIND,
    DOSEHINDW;

    public String value() {
        return name();
    }

    public static DoseHighDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
