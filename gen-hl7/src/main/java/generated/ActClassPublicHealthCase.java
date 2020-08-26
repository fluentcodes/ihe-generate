
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassPublicHealthCase.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPublicHealthCase"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="OUTB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassPublicHealthCase")
@XmlEnum
public enum ActClassPublicHealthCase {

    CASE,
    OUTB;

    public String value() {
        return name();
    }

    public static ActClassPublicHealthCase fromValue(String v) {
        return valueOf(v);
    }

}
