
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleClassOntologicalEquivalentEntityByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassOntologicalEquivalentEntityByBOT"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EQUIV"/&gt;
 *     &lt;enumeration value="SAME"/&gt;
 *     &lt;enumeration value="SUBY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassOntologicalEquivalentEntityByBOT")
@XmlEnum
public enum RoleClassOntologicalEquivalentEntityByBOT {

    EQUIV,
    SAME,
    SUBY;

    public String value() {
        return name();
    }

    public static RoleClassOntologicalEquivalentEntityByBOT fromValue(String v) {
        return valueOf(v);
    }

}
