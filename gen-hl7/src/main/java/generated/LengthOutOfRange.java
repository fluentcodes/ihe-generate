
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LengthOutOfRange.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LengthOutOfRange"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="LEN_RANGE"/&gt;
 *     &lt;enumeration value="LEN_LONG"/&gt;
 *     &lt;enumeration value="LEN_SHORT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LengthOutOfRange")
@XmlEnum
public enum LengthOutOfRange {

    LEN_RANGE,
    LEN_LONG,
    LEN_SHORT;

    public String value() {
        return name();
    }

    public static LengthOutOfRange fromValue(String v) {
        return valueOf(v);
    }

}
