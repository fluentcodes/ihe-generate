
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ElectroOsmosisRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ElectroOsmosisRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ELECTOSMOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElectroOsmosisRoute")
@XmlEnum
public enum ElectroOsmosisRoute {

    ELECTOSMOS;

    public String value() {
        return name();
    }

    public static ElectroOsmosisRoute fromValue(String v) {
        return valueOf(v);
    }

}
