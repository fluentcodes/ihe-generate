
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProcessingMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingMode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessingMode")
@XmlEnum
public enum ProcessingMode {

    A,
    T,
    I,
    R;

    public String value() {
        return name();
    }

    public static ProcessingMode fromValue(String v) {
        return valueOf(v);
    }

}
