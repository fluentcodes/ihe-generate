
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActTaskOrderEntryCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskOrderEntryCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="OE"/&gt;
 *     &lt;enumeration value="LABOE"/&gt;
 *     &lt;enumeration value="MEDOE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActTaskOrderEntryCode")
@XmlEnum
public enum ActTaskOrderEntryCode {

    OE,
    LABOE,
    MEDOE;

    public String value() {
        return name();
    }

    public static ActTaskOrderEntryCode fromValue(String v) {
        return valueOf(v);
    }

}
