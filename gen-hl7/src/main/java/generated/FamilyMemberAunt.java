
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FamilyMemberAunt.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberAunt"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AUNT"/&gt;
 *     &lt;enumeration value="MAUNT"/&gt;
 *     &lt;enumeration value="PAUNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberAunt")
@XmlEnum
public enum FamilyMemberAunt {

    AUNT,
    MAUNT,
    PAUNT;

    public String value() {
        return name();
    }

    public static FamilyMemberAunt fromValue(String v) {
        return valueOf(v);
    }

}
