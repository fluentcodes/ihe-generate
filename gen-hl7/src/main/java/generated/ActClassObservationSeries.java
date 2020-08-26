
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassObservationSeries.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassObservationSeries"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="OBSSER"/&gt;
 *     &lt;enumeration value="OBSCOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassObservationSeries")
@XmlEnum
public enum ActClassObservationSeries {

    OBSSER,
    OBSCOR;

    public String value() {
        return name();
    }

    public static ActClassObservationSeries fromValue(String v) {
        return valueOf(v);
    }

}
