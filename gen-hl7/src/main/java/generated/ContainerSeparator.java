
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContainerSeparator.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContainerSeparator"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GEL"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContainerSeparator")
@XmlEnum
public enum ContainerSeparator {

    GEL,
    NONE;

    public String value() {
        return name();
    }

    public static ContainerSeparator fromValue(String v) {
        return valueOf(v);
    }

}
