
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleClassNamedInsured.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassNamedInsured"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NAMED"/&gt;
 *     &lt;enumeration value="DEPEN"/&gt;
 *     &lt;enumeration value="INDIV"/&gt;
 *     &lt;enumeration value="SUBSCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassNamedInsured")
@XmlEnum
public enum RoleClassNamedInsured {

    NAMED,
    DEPEN,
    INDIV,
    SUBSCR;

    public String value() {
        return name();
    }

    public static RoleClassNamedInsured fromValue(String v) {
        return valueOf(v);
    }

}
