
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipCheckpoint.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipCheckpoint"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipCheckpoint")
@XmlEnum
public enum ActRelationshipCheckpoint {

    B,
    E,
    S,
    X,
    T;

    public String value() {
        return name();
    }

    public static ActRelationshipCheckpoint fromValue(String v) {
        return valueOf(v);
    }

}
