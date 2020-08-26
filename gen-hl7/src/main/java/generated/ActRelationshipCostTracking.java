
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipCostTracking.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipCostTracking"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CHRG"/&gt;
 *     &lt;enumeration value="COST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipCostTracking")
@XmlEnum
public enum ActRelationshipCostTracking {

    CHRG,
    COST;

    public String value() {
        return name();
    }

    public static ActRelationshipCostTracking fromValue(String v) {
        return valueOf(v);
    }

}
