
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VitreousHumourRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VitreousHumourRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IVITIMPLNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VitreousHumourRoute")
@XmlEnum
public enum VitreousHumourRoute {

    IVITIMPLNT;

    public String value() {
        return name();
    }

    public static VitreousHumourRoute fromValue(String v) {
        return valueOf(v);
    }

}
