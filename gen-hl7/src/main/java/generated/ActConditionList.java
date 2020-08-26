
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActConditionList.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActConditionList"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CONDLIST"/&gt;
 *     &lt;enumeration value="INTOLIST"/&gt;
 *     &lt;enumeration value="PROBLIST"/&gt;
 *     &lt;enumeration value="RISKLIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActConditionList")
@XmlEnum
public enum ActConditionList {

    CONDLIST,
    INTOLIST,
    PROBLIST,
    RISKLIST;

    public String value() {
        return name();
    }

    public static ActConditionList fromValue(String v) {
        return valueOf(v);
    }

}
