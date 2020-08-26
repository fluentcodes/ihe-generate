
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EncounterAdmissionSource.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterAdmissionSource"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="LD"/&gt;
 *     &lt;enumeration value="NB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncounterAdmissionSource")
@XmlEnum
public enum EncounterAdmissionSource {

    E,
    LD,
    NB;

    public String value() {
        return name();
    }

    public static EncounterAdmissionSource fromValue(String v) {
        return valueOf(v);
    }

}
