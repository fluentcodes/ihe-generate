
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntrathoracicRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrathoracicRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ITHORINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntrathoracicRoute")
@XmlEnum
public enum IntrathoracicRoute {

    ITHORINJ;

    public String value() {
        return name();
    }

    public static IntrathoracicRoute fromValue(String v) {
        return valueOf(v);
    }

}
