
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ParticipationAuthorPerformer.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationAuthorPerformer"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AUT"/&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationAuthorPerformer")
@XmlEnum
public enum XParticipationAuthorPerformer {

    AUT,
    PRF;

    public String value() {
        return name();
    }

    public static XParticipationAuthorPerformer fromValue(String v) {
        return valueOf(v);
    }

}
