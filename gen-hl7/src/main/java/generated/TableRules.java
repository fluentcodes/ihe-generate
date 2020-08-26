
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TableRules.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TableRules"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="cols"/&gt;
 *     &lt;enumeration value="groups"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="rows"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TableRules")
@XmlEnum
public enum TableRules {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("cols")
    COLS("cols"),
    @XmlEnumValue("groups")
    GROUPS("groups"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("rows")
    ROWS("rows");
    private final String value;

    TableRules(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableRules fromValue(String v) {
        for (TableRules c: TableRules.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
