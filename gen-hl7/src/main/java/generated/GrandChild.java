
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GrandChild.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GrandChild"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GRNDCHILD"/&gt;
 *     &lt;enumeration value="GRNDDAU"/&gt;
 *     &lt;enumeration value="GRNDSON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GrandChild")
@XmlEnum
public enum GrandChild {

    GRNDCHILD,
    GRNDDAU,
    GRNDSON;

    public String value() {
        return name();
    }

    public static GrandChild fromValue(String v) {
        return valueOf(v);
    }

}
