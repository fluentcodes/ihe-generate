
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SchedulingActReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SchedulingActReason"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="MTG"/&gt;
 *     &lt;enumeration value="MED"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *     &lt;enumeration value="DEC"/&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *     &lt;enumeration value="PHY"/&gt;
 *     &lt;enumeration value="BLK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SchedulingActReason")
@XmlEnum
public enum SchedulingActReason {

    MTG,
    MED,
    FIN,
    DEC,
    PAT,
    PHY,
    BLK;

    public String value() {
        return name();
    }

    public static SchedulingActReason fromValue(String v) {
        return valueOf(v);
    }

}
