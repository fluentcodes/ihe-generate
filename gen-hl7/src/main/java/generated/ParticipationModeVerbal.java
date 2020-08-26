
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationModeVerbal.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationModeVerbal"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="VERBAL"/&gt;
 *     &lt;enumeration value="DICTATE"/&gt;
 *     &lt;enumeration value="FACE"/&gt;
 *     &lt;enumeration value="PHONE"/&gt;
 *     &lt;enumeration value="VIDEOCONF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationModeVerbal")
@XmlEnum
public enum ParticipationModeVerbal {

    VERBAL,
    DICTATE,
    FACE,
    PHONE,
    VIDEOCONF;

    public String value() {
        return name();
    }

    public static ParticipationModeVerbal fromValue(String v) {
        return valueOf(v);
    }

}
