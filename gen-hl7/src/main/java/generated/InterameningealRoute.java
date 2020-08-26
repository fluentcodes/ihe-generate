
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InterameningealRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InterameningealRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="INTERMENINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterameningealRoute")
@XmlEnum
public enum InterameningealRoute {

    INTERMENINJ;

    public String value() {
        return name();
    }

    public static InterameningealRoute fromValue(String v) {
        return valueOf(v);
    }

}
