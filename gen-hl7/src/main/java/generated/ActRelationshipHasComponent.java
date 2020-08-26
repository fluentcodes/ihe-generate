
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipHasComponent.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipHasComponent"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="ARR"/&gt;
 *     &lt;enumeration value="DEP"/&gt;
 *     &lt;enumeration value="CTRLV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipHasComponent")
@XmlEnum
public enum ActRelationshipHasComponent {

    COMP,
    ARR,
    DEP,
    CTRLV;

    public String value() {
        return name();
    }

    public static ActRelationshipHasComponent fromValue(String v) {
        return valueOf(v);
    }

}
