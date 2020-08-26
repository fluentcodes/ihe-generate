
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExposureMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureMode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AIRBORNE"/&gt;
 *     &lt;enumeration value="CONTACT"/&gt;
 *     &lt;enumeration value="FOODBORNE"/&gt;
 *     &lt;enumeration value="WATERBORNE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposureMode")
@XmlEnum
public enum ExposureMode {

    AIRBORNE,
    CONTACT,
    FOODBORNE,
    WATERBORNE;

    public String value() {
        return name();
    }

    public static ExposureMode fromValue(String v) {
        return valueOf(v);
    }

}
