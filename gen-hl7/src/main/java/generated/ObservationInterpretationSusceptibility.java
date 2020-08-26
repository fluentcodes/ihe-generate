
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationInterpretationSusceptibility.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationSusceptibility"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="VS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationSusceptibility")
@XmlEnum
public enum ObservationInterpretationSusceptibility {

    I,
    MS,
    R,
    S,
    VS;

    public String value() {
        return name();
    }

    public static ObservationInterpretationSusceptibility fromValue(String v) {
        return valueOf(v);
    }

}
