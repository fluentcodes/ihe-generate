
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodeSystemType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeSystemType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="EI"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeSystemType")
@XmlEnum
public enum CodeSystemType {

    E,
    EI,
    I;

    public String value() {
        return name();
    }

    public static CodeSystemType fromValue(String v) {
        return valueOf(v);
    }

}
