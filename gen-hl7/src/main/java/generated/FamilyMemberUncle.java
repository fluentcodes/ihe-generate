
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FamilyMemberUncle.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberUncle"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="UNCLE"/&gt;
 *     &lt;enumeration value="MUNCLE"/&gt;
 *     &lt;enumeration value="PUNCLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberUncle")
@XmlEnum
public enum FamilyMemberUncle {

    UNCLE,
    MUNCLE,
    PUNCLE;

    public String value() {
        return name();
    }

    public static FamilyMemberUncle fromValue(String v) {
        return valueOf(v);
    }

}
