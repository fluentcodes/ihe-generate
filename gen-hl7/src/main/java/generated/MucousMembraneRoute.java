
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MucousMembraneRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MucousMembraneRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="MUC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MucousMembraneRoute")
@XmlEnum
public enum MucousMembraneRoute {

    MUC;

    public String value() {
        return name();
    }

    public static MucousMembraneRoute fromValue(String v) {
        return valueOf(v);
    }

}
