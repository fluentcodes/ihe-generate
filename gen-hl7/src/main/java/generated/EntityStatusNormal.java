
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityStatusNormal.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityStatusNormal"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityStatusNormal")
@XmlEnum
public enum EntityStatusNormal {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("inactive")
    INACTIVE("inactive");
    private final String value;

    EntityStatusNormal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityStatusNormal fromValue(String v) {
        for (EntityStatusNormal c: EntityStatusNormal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
