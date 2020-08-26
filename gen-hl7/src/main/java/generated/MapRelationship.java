
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MapRelationship.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MapRelationship"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BT"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="NT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapRelationship")
@XmlEnum
public enum MapRelationship {

    BT,
    E,
    NT;

    public String value() {
        return name();
    }

    public static MapRelationship fromValue(String v) {
        return valueOf(v);
    }

}
