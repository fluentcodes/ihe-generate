
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PayorParticipationFunction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PayorParticipationFunction"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CLMADJ"/&gt;
 *     &lt;enumeration value="ENROLL"/&gt;
 *     &lt;enumeration value="FFSMGT"/&gt;
 *     &lt;enumeration value="MCMGT"/&gt;
 *     &lt;enumeration value="PROVMGT"/&gt;
 *     &lt;enumeration value="UMGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayorParticipationFunction")
@XmlEnum
public enum PayorParticipationFunction {

    CLMADJ,
    ENROLL,
    FFSMGT,
    MCMGT,
    PROVMGT,
    UMGT;

    public String value() {
        return name();
    }

    public static PayorParticipationFunction fromValue(String v) {
        return valueOf(v);
    }

}
