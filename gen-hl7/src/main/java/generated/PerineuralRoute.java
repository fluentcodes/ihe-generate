
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PerineuralRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PerineuralRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PNINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PerineuralRoute")
@XmlEnum
public enum PerineuralRoute {

    PNINJ;

    public String value() {
        return name();
    }

    public static PerineuralRoute fromValue(String v) {
        return valueOf(v);
    }

}
