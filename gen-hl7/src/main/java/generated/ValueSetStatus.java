
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ValueSetStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueSetStatus"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValueSetStatus")
@XmlEnum
public enum ValueSetStatus {

    A,
    D,
    P,
    R;

    public String value() {
        return name();
    }

    public static ValueSetStatus fromValue(String v) {
        return valueOf(v);
    }

}
