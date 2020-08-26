
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityClassState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassState"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="STATE"/&gt;
 *     &lt;enumeration value="NAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityClassState")
@XmlEnum
public enum EntityClassState {

    STATE,
    NAT;

    public String value() {
        return name();
    }

    public static EntityClassState fromValue(String v) {
        return valueOf(v);
    }

}
