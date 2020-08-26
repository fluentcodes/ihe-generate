
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UnderwriterParticipationFunction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderwriterParticipationFunction"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PAYORCNTR"/&gt;
 *     &lt;enumeration value="REINS"/&gt;
 *     &lt;enumeration value="RETROCES"/&gt;
 *     &lt;enumeration value="SUBCTRT"/&gt;
 *     &lt;enumeration value="UNDERWRTNG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnderwriterParticipationFunction")
@XmlEnum
public enum UnderwriterParticipationFunction {

    PAYORCNTR,
    REINS,
    RETROCES,
    SUBCTRT,
    UNDERWRTNG;

    public String value() {
        return name();
    }

    public static UnderwriterParticipationFunction fromValue(String v) {
        return valueOf(v);
    }

}
