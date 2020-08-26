
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActTaskClinicalNoteReviewCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskClinicalNoteReviewCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CLINNOTEREV"/&gt;
 *     &lt;enumeration value="DISCHSUMREV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActTaskClinicalNoteReviewCode")
@XmlEnum
public enum ActTaskClinicalNoteReviewCode {

    CLINNOTEREV,
    DISCHSUMREV;

    public String value() {
        return name();
    }

    public static ActTaskClinicalNoteReviewCode fromValue(String v) {
        return valueOf(v);
    }

}
