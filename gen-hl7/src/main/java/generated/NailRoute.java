
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NailRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NailRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NailRoute")
@XmlEnum
public enum NailRoute {

    NAIL;

    public String value() {
        return name();
    }

    public static NailRoute fromValue(String v) {
        return valueOf(v);
    }

}
