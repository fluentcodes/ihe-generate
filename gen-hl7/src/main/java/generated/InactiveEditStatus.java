
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InactiveEditStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InactiveEditStatus"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InactiveEditStatus")
@XmlEnum
public enum InactiveEditStatus {

    I;

    public String value() {
        return name();
    }

    public static InactiveEditStatus fromValue(String v) {
        return valueOf(v);
    }

}
