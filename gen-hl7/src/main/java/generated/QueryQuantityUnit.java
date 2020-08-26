
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QueryQuantityUnit.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryQuantityUnit"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="LI"/&gt;
 *     &lt;enumeration value="PG"/&gt;
 *     &lt;enumeration value="RD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryQuantityUnit")
@XmlEnum
public enum QueryQuantityUnit {

    CH,
    LI,
    PG,
    RD;

    public String value() {
        return name();
    }

    public static QueryQuantityUnit fromValue(String v) {
        return valueOf(v);
    }

}
