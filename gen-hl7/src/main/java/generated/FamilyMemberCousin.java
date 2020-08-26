
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FamilyMemberCousin.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberCousin"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="COUSN"/&gt;
 *     &lt;enumeration value="MCOUSN"/&gt;
 *     &lt;enumeration value="PCOUSN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberCousin")
@XmlEnum
public enum FamilyMemberCousin {

    COUSN,
    MCOUSN,
    PCOUSN;

    public String value() {
        return name();
    }

    public static FamilyMemberCousin fromValue(String v) {
        return valueOf(v);
    }

}
