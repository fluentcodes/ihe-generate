
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ParticipationEntVrf.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationEntVrf"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ENT"/&gt;
 *     &lt;enumeration value="VRF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationEntVrf")
@XmlEnum
public enum XParticipationEntVrf {

    ENT,
    VRF;

    public String value() {
        return name();
    }

    public static XParticipationEntVrf fromValue(String v) {
        return valueOf(v);
    }

}
