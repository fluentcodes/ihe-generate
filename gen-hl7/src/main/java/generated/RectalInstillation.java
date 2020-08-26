
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RectalInstillation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RectalInstillation"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RECINSTL"/&gt;
 *     &lt;enumeration value="RECTINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RectalInstillation")
@XmlEnum
public enum RectalInstillation {

    RECINSTL,
    RECTINSTL;

    public String value() {
        return name();
    }

    public static RectalInstillation fromValue(String v) {
        return valueOf(v);
    }

}
