
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AdoptedChild.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AdoptedChild"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CHLDADOPT"/&gt;
 *     &lt;enumeration value="DAUADOPT"/&gt;
 *     &lt;enumeration value="SONADOPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdoptedChild")
@XmlEnum
public enum AdoptedChild {

    CHLDADOPT,
    DAUADOPT,
    SONADOPT;

    public String value() {
        return name();
    }

    public static AdoptedChild fromValue(String v) {
        return valueOf(v);
    }

}
