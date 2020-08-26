
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntradermalRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntradermalRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IDIMPLNT"/&gt;
 *     &lt;enumeration value="IDINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntradermalRoute")
@XmlEnum
public enum IntradermalRoute {

    IDIMPLNT,
    IDINJ;

    public String value() {
        return name();
    }

    public static IntradermalRoute fromValue(String v) {
        return valueOf(v);
    }

}
