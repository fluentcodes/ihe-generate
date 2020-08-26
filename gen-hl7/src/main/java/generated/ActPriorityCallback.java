
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActPriorityCallback.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActPriorityCallback"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CS"/&gt;
 *     &lt;enumeration value="CSP"/&gt;
 *     &lt;enumeration value="CSR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActPriorityCallback")
@XmlEnum
public enum ActPriorityCallback {

    CS,
    CSP,
    CSR;

    public String value() {
        return name();
    }

    public static ActPriorityCallback fromValue(String v) {
        return valueOf(v);
    }

}
