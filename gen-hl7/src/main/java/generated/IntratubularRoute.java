
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntratubularRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntratubularRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ITUBINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntratubularRoute")
@XmlEnum
public enum IntratubularRoute {

    ITUBINJ;

    public String value() {
        return name();
    }

    public static IntratubularRoute fromValue(String v) {
        return valueOf(v);
    }

}
