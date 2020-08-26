
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Rinse.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Rinse"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DENRINSE"/&gt;
 *     &lt;enumeration value="ORRINSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Rinse")
@XmlEnum
public enum Rinse {

    DENRINSE,
    ORRINSE;

    public String value() {
        return name();
    }

    public static Rinse fromValue(String v) {
        return valueOf(v);
    }

}
