
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Flush.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Flush"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IVFLUSH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Flush")
@XmlEnum
public enum Flush {

    IVFLUSH;

    public String value() {
        return name();
    }

    public static Flush fromValue(String v) {
        return valueOf(v);
    }

}
