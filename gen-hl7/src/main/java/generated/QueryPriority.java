
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QueryPriority.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryPriority"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryPriority")
@XmlEnum
public enum QueryPriority {

    D,
    I;

    public String value() {
        return name();
    }

    public static QueryPriority fromValue(String v) {
        return valueOf(v);
    }

}
