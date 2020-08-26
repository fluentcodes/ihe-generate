
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Spouse.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Spouse"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SPS"/&gt;
 *     &lt;enumeration value="HUSB"/&gt;
 *     &lt;enumeration value="WIFE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Spouse")
@XmlEnum
public enum Spouse {

    SPS,
    HUSB,
    WIFE;

    public String value() {
        return name();
    }

    public static Spouse fromValue(String v) {
        return valueOf(v);
    }

}
