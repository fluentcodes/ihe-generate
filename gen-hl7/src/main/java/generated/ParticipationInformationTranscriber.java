
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationInformationTranscriber.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationInformationTranscriber"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TRANS"/&gt;
 *     &lt;enumeration value="ENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationInformationTranscriber")
@XmlEnum
public enum ParticipationInformationTranscriber {

    TRANS,
    ENT;

    public String value() {
        return name();
    }

    public static ParticipationInformationTranscriber fromValue(String v) {
        return valueOf(v);
    }

}
