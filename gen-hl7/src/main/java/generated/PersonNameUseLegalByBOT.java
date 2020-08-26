
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PersonNameUseLegalByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNameUseLegalByBOT"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonNameUseLegalByBOT")
@XmlEnum
public enum PersonNameUseLegalByBOT {

    L,
    OR;

    public String value() {
        return name();
    }

    public static PersonNameUseLegalByBOT fromValue(String v) {
        return valueOf(v);
    }

}
