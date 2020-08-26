
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleClassPartitivePartByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassPartitivePartByBOT"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="ACTM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassPartitivePartByBOT")
@XmlEnum
public enum RoleClassPartitivePartByBOT {

    PART,
    ACTM;

    public String value() {
        return name();
    }

    public static RoleClassPartitivePartByBOT fromValue(String v) {
        return valueOf(v);
    }

}
