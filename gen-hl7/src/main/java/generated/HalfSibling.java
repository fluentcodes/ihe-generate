
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HalfSibling.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HalfSibling"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="HSIB"/&gt;
 *     &lt;enumeration value="HBRO"/&gt;
 *     &lt;enumeration value="HSIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HalfSibling")
@XmlEnum
public enum HalfSibling {

    HSIB,
    HBRO,
    HSIS;

    public String value() {
        return name();
    }

    public static HalfSibling fromValue(String v) {
        return valueOf(v);
    }

}
