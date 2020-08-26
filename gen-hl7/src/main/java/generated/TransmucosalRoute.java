
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TransmucosalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransmucosalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TMUCTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransmucosalRoute")
@XmlEnum
public enum TransmucosalRoute {

    TMUCTA;

    public String value() {
        return name();
    }

    public static TransmucosalRoute fromValue(String v) {
        return valueOf(v);
    }

}
