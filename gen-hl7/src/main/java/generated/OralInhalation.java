
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OralInhalation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OralInhalation"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ORINHL"/&gt;
 *     &lt;enumeration value="ORIFINHL"/&gt;
 *     &lt;enumeration value="REBREATH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OralInhalation")
@XmlEnum
public enum OralInhalation {

    ORINHL,
    ORIFINHL,
    REBREATH;

    public String value() {
        return name();
    }

    public static OralInhalation fromValue(String v) {
        return valueOf(v);
    }

}
