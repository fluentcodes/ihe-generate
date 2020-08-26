
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActIneligibilityReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActIneligibilityReason"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="COVSUS"/&gt;
 *     &lt;enumeration value="DECSD"/&gt;
 *     &lt;enumeration value="REGERR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActIneligibilityReason")
@XmlEnum
public enum ActIneligibilityReason {

    COVSUS,
    DECSD,
    REGERR;

    public String value() {
        return name();
    }

    public static ActIneligibilityReason fromValue(String v) {
        return valueOf(v);
    }

}
