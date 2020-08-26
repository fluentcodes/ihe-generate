
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_EncounterPerformerParticipation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EncounterPerformerParticipation"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *     &lt;enumeration value="SPRF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_EncounterPerformerParticipation")
@XmlEnum
public enum XEncounterPerformerParticipation {

    CON,
    PRF,
    SPRF;

    public String value() {
        return name();
    }

    public static XEncounterPerformerParticipation fromValue(String v) {
        return valueOf(v);
    }

}
