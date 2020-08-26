
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ERPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ERPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="ETU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ERPracticeSetting")
@XmlEnum
public enum ERPracticeSetting {

    ER,
    ETU;

    public String value() {
        return name();
    }

    public static ERPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
