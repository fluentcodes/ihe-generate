
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipHasSupport.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipHasSupport"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SPRT"/&gt;
 *     &lt;enumeration value="SPRTBND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipHasSupport")
@XmlEnum
public enum ActRelationshipHasSupport {

    SPRT,
    SPRTBND;

    public String value() {
        return name();
    }

    public static ActRelationshipHasSupport fromValue(String v) {
        return valueOf(v);
    }

}
