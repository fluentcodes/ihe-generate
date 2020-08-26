
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationModeElectronicData.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationModeElectronicData"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ELECTRONIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationModeElectronicData")
@XmlEnum
public enum ParticipationModeElectronicData {

    ELECTRONIC;

    public String value() {
        return name();
    }

    public static ParticipationModeElectronicData fromValue(String v) {
        return valueOf(v);
    }

}
