
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExpectedSubset.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpectedSubset"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="FUTURE"/&gt;
 *     &lt;enumeration value="LAST"/&gt;
 *     &lt;enumeration value="NEXT"/&gt;
 *     &lt;enumeration value="FUTSUM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExpectedSubset")
@XmlEnum
public enum ExpectedSubset {

    FUTURE,
    LAST,
    NEXT,
    FUTSUM;

    public String value() {
        return name();
    }

    public static ExpectedSubset fromValue(String v) {
        return valueOf(v);
    }

}
