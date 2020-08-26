
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Insertion.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Insertion"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CERVINS"/&gt;
 *     &lt;enumeration value="IOSURGINS"/&gt;
 *     &lt;enumeration value="IU"/&gt;
 *     &lt;enumeration value="LPINS"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="SQSURGINS"/&gt;
 *     &lt;enumeration value="URETHINS"/&gt;
 *     &lt;enumeration value="VAGINSI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Insertion")
@XmlEnum
public enum Insertion {

    CERVINS,
    IOSURGINS,
    IU,
    LPINS,
    PR,
    SQSURGINS,
    URETHINS,
    VAGINSI;

    public String value() {
        return name();
    }

    public static Insertion fromValue(String v) {
        return valueOf(v);
    }

}
