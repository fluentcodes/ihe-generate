
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationInterpretationChange.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationChange"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationChange")
@XmlEnum
public enum ObservationInterpretationChange {

    B,
    D,
    U,
    W;

    public String value() {
        return name();
    }

    public static ObservationInterpretationChange fromValue(String v) {
        return valueOf(v);
    }

}
