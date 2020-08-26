
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActMoodProposal.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodProposal"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PRP"/&gt;
 *     &lt;enumeration value="RMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMoodProposal")
@XmlEnum
public enum ActMoodProposal {

    PRP,
    RMD;

    public String value() {
        return name();
    }

    public static ActMoodProposal fromValue(String v) {
        return valueOf(v);
    }

}
