
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SetUpdateMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SetUpdateMode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ESA"/&gt;
 *     &lt;enumeration value="ESAC"/&gt;
 *     &lt;enumeration value="ESC"/&gt;
 *     &lt;enumeration value="ESD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SetUpdateMode")
@XmlEnum
public enum SetUpdateMode {

    ESA,
    ESAC,
    ESC,
    ESD;

    public String value() {
        return name();
    }

    public static SetUpdateMode fromValue(String v) {
        return valueOf(v);
    }

}
