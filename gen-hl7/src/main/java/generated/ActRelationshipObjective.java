
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipObjective.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipObjective"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="OBJC"/&gt;
 *     &lt;enumeration value="OBJF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipObjective")
@XmlEnum
public enum ActRelationshipObjective {

    OBJC,
    OBJF;

    public String value() {
        return name();
    }

    public static ActRelationshipObjective fromValue(String v) {
        return valueOf(v);
    }

}
