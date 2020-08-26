
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EnteralRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EnteralRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ENTINSTL"/&gt;
 *     &lt;enumeration value="EFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnteralRoute")
@XmlEnum
public enum EnteralRoute {

    ENTINSTL,
    EFT;

    public String value() {
        return name();
    }

    public static EnteralRoute fromValue(String v) {
        return valueOf(v);
    }

}
