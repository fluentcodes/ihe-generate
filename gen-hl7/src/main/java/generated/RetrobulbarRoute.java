
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RetrobulbarRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrobulbarRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RBINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetrobulbarRoute")
@XmlEnum
public enum RetrobulbarRoute {

    RBINJ;

    public String value() {
        return name();
    }

    public static RetrobulbarRoute fromValue(String v) {
        return valueOf(v);
    }

}
