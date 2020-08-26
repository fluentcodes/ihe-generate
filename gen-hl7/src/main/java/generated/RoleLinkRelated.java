
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleLinkRelated.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleLinkRelated"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="REL"/&gt;
 *     &lt;enumeration value="IDENT"/&gt;
 *     &lt;enumeration value="DIRAUTH"/&gt;
 *     &lt;enumeration value="INDAUTH"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="BACKUP"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleLinkRelated")
@XmlEnum
public enum RoleLinkRelated {

    REL,
    IDENT,
    DIRAUTH,
    INDAUTH,
    PART,
    BACKUP,
    REPL;

    public String value() {
        return name();
    }

    public static RoleLinkRelated fromValue(String v) {
        return valueOf(v);
    }

}
