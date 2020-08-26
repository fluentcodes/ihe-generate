
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReactionDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ReactionDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="REACT"/&gt;
 *     &lt;enumeration value="ALGY"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReactionDetectedIssueCode")
@XmlEnum
public enum ReactionDetectedIssueCode {

    REACT,
    ALGY,
    INT;

    public String value() {
        return name();
    }

    public static ReactionDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
