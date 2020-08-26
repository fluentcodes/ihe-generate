
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntracavitaryRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntracavitaryRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ICAVITINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntracavitaryRoute")
@XmlEnum
public enum IntracavitaryRoute {

    ICAVITINJ;

    public String value() {
        return name();
    }

    public static IntracavitaryRoute fromValue(String v) {
        return valueOf(v);
    }

}
