
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationIndirectTarget.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationIndirectTarget"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IND"/&gt;
 *     &lt;enumeration value="BEN"/&gt;
 *     &lt;enumeration value="CAGNT"/&gt;
 *     &lt;enumeration value="COV"/&gt;
 *     &lt;enumeration value="GUAR"/&gt;
 *     &lt;enumeration value="HLD"/&gt;
 *     &lt;enumeration value="RCV"/&gt;
 *     &lt;enumeration value="RCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationIndirectTarget")
@XmlEnum
public enum ParticipationIndirectTarget {

    IND,
    BEN,
    CAGNT,
    COV,
    GUAR,
    HLD,
    RCV,
    RCT;

    public String value() {
        return name();
    }

    public static ParticipationIndirectTarget fromValue(String v) {
        return valueOf(v);
    }

}
