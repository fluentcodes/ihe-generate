
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeviceAlertLevel.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceAlertLevel"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceAlertLevel")
@XmlEnum
public enum DeviceAlertLevel {

    C,
    N,
    S,
    W;

    public String value() {
        return name();
    }

    public static DeviceAlertLevel fromValue(String v) {
        return valueOf(v);
    }

}
