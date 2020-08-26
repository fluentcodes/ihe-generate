
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UrinaryBladderIrrigation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UrinaryBladderIrrigation"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BLADIRR"/&gt;
 *     &lt;enumeration value="BLADIRRC"/&gt;
 *     &lt;enumeration value="BLADIRRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrinaryBladderIrrigation")
@XmlEnum
public enum UrinaryBladderIrrigation {

    BLADIRR,
    BLADIRRC,
    BLADIRRT;

    public String value() {
        return name();
    }

    public static UrinaryBladderIrrigation fromValue(String v) {
        return valueOf(v);
    }

}
