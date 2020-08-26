
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Institution.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Institution"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="CS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Institution")
@XmlEnum
public enum Institution {

    I,
    X,
    G,
    N,
    CS;

    public String value() {
        return name();
    }

    public static Institution fromValue(String v) {
        return valueOf(v);
    }

}
