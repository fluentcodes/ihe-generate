
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GREG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarType")
@XmlEnum
public enum CalendarType {

    GREG;

    public String value() {
        return name();
    }

    public static CalendarType fromValue(String v) {
        return valueOf(v);
    }

}
