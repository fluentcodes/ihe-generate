
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActStatusNormal.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActStatusNormal"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="aborted"/&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="held"/&gt;
 *     &lt;enumeration value="new"/&gt;
 *     &lt;enumeration value="suspended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActStatusNormal")
@XmlEnum
public enum ActStatusNormal {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("held")
    HELD("held"),
    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    ActStatusNormal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActStatusNormal fromValue(String v) {
        for (ActStatusNormal c: ActStatusNormal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
