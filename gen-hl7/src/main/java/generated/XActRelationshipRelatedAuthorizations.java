
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActRelationshipRelatedAuthorizations.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipRelatedAuthorizations"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="REFR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipRelatedAuthorizations")
@XmlEnum
public enum XActRelationshipRelatedAuthorizations {

    AUTH,
    REFR;

    public String value() {
        return name();
    }

    public static XActRelationshipRelatedAuthorizations fromValue(String v) {
        return valueOf(v);
    }

}
