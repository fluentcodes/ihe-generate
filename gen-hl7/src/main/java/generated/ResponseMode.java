
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResponseMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseMode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseMode")
@XmlEnum
public enum ResponseMode {

    D,
    I,
    Q;

    public String value() {
        return name();
    }

    public static ResponseMode fromValue(String v) {
        return valueOf(v);
    }

}
