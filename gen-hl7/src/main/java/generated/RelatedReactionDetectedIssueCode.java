
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RelatedReactionDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RelatedReactionDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RREACT"/&gt;
 *     &lt;enumeration value="RALG"/&gt;
 *     &lt;enumeration value="RINT"/&gt;
 *     &lt;enumeration value="RAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelatedReactionDetectedIssueCode")
@XmlEnum
public enum RelatedReactionDetectedIssueCode {

    RREACT,
    RALG,
    RINT,
    RAR;

    public String value() {
        return name();
    }

    public static RelatedReactionDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
