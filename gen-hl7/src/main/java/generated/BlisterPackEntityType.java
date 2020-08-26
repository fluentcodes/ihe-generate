
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BlisterPackEntityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BlisterPackEntityType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BLSTRPK"/&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BlisterPackEntityType")
@XmlEnum
public enum BlisterPackEntityType {

    BLSTRPK,
    CARD;

    public String value() {
        return name();
    }

    public static BlisterPackEntityType fromValue(String v) {
        return valueOf(v);
    }

}
