
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Other.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Other"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="NINF"/&gt;
 *     &lt;enumeration value="PINF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Other")
@XmlEnum
public enum Other {

    OTH,
    NINF,
    PINF;

    public String value() {
        return name();
    }

    public static Other fromValue(String v) {
        return valueOf(v);
    }

}
