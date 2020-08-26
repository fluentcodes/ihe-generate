
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_PhysicalVerbalParticipationMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_PhysicalVerbalParticipationMode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PHYSICAL"/&gt;
 *     &lt;enumeration value="VERBAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_PhysicalVerbalParticipationMode")
@XmlEnum
public enum XPhysicalVerbalParticipationMode {

    PHYSICAL,
    VERBAL;

    public String value() {
        return name();
    }

    public static XPhysicalVerbalParticipationMode fromValue(String v) {
        return valueOf(v);
    }

}
