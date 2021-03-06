
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassSupply.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassSupply"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SPLY"/&gt;
 *     &lt;enumeration value="DIET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassSupply")
@XmlEnum
public enum ActClassSupply {

    SPLY,
    DIET;

    public String value() {
        return name();
    }

    public static ActClassSupply fromValue(String v) {
        return valueOf(v);
    }

}
