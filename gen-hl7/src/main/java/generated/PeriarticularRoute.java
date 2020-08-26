
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PeriarticularRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriarticularRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PAINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriarticularRoute")
@XmlEnum
public enum PeriarticularRoute {

    PAINJ;

    public String value() {
        return name();
    }

    public static PeriarticularRoute fromValue(String v) {
        return valueOf(v);
    }

}
