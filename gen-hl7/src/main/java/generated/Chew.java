
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Chew.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Chew"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CHEW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Chew")
@XmlEnum
public enum Chew {

    CHEW;

    public String value() {
        return name();
    }

    public static Chew fromValue(String v) {
        return valueOf(v);
    }

}
