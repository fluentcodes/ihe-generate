
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationTargetDevice.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetDevice"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DEV"/&gt;
 *     &lt;enumeration value="NRD"/&gt;
 *     &lt;enumeration value="RDV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetDevice")
@XmlEnum
public enum ParticipationTargetDevice {

    DEV,
    NRD,
    RDV;

    public String value() {
        return name();
    }

    public static ParticipationTargetDevice fromValue(String v) {
        return valueOf(v);
    }

}
