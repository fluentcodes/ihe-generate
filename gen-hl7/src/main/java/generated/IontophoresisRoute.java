
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IontophoresisRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IontophoresisRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IONTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IontophoresisRoute")
@XmlEnum
public enum IontophoresisRoute {

    IONTO;

    public String value() {
        return name();
    }

    public static IontophoresisRoute fromValue(String v) {
        return valueOf(v);
    }

}
