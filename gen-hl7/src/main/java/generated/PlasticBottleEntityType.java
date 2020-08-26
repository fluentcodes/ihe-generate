
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PlasticBottleEntityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PlasticBottleEntityType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BOTP"/&gt;
 *     &lt;enumeration value="BOTPLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlasticBottleEntityType")
@XmlEnum
public enum PlasticBottleEntityType {

    BOTP,
    BOTPLY;

    public String value() {
        return name();
    }

    public static PlasticBottleEntityType fromValue(String v) {
        return valueOf(v);
    }

}
