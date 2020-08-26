
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContextControlPropagating.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextControlPropagating"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="OP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContextControlPropagating")
@XmlEnum
public enum ContextControlPropagating {

    AP,
    OP;

    public String value() {
        return name();
    }

    public static ContextControlPropagating fromValue(String v) {
        return valueOf(v);
    }

}
