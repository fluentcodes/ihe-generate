
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NameRepresentationUse.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameRepresentationUse"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ABC"/&gt;
 *     &lt;enumeration value="IDE"/&gt;
 *     &lt;enumeration value="SYL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameRepresentationUse")
@XmlEnum
public enum NameRepresentationUse {

    ABC,
    IDE,
    SYL;

    public String value() {
        return name();
    }

    public static NameRepresentationUse fromValue(String v) {
        return valueOf(v);
    }

}
