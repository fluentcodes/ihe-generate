
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GenderStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderStatus"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenderStatus")
@XmlEnum
public enum GenderStatus {

    I,
    N;

    public String value() {
        return name();
    }

    public static GenderStatus fromValue(String v) {
        return valueOf(v);
    }

}
