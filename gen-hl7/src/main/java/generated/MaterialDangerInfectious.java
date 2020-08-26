
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MaterialDangerInfectious.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MaterialDangerInfectious"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="INF"/&gt;
 *     &lt;enumeration value="BHZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaterialDangerInfectious")
@XmlEnum
public enum MaterialDangerInfectious {

    INF,
    BHZ;

    public String value() {
        return name();
    }

    public static MaterialDangerInfectious fromValue(String v) {
        return valueOf(v);
    }

}
