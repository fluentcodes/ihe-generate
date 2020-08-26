
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassGenomicObservation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassGenomicObservation"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="SEQ"/&gt;
 *     &lt;enumeration value="SEQVAR"/&gt;
 *     &lt;enumeration value="DETPOL"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="PHN"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassGenomicObservation")
@XmlEnum
public enum ActClassGenomicObservation {

    GEN,
    SEQ,
    SEQVAR,
    DETPOL,
    EXP,
    LOC,
    PHN,
    POL;

    public String value() {
        return name();
    }

    public static ActClassGenomicObservation fromValue(String v) {
        return valueOf(v);
    }

}
