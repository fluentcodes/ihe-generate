
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActAccommodationReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActAccommodationReason"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ACCREQNA"/&gt;
 *     &lt;enumeration value="FLRCNV"/&gt;
 *     &lt;enumeration value="MEDNEC"/&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActAccommodationReason")
@XmlEnum
public enum ActAccommodationReason {

    ACCREQNA,
    FLRCNV,
    MEDNEC,
    PAT;

    public String value() {
        return name();
    }

    public static ActAccommodationReason fromValue(String v) {
        return valueOf(v);
    }

}
