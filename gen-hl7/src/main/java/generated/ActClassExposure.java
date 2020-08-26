
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassExposure.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassExposure"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EXPOS"/&gt;
 *     &lt;enumeration value="AEXPOS"/&gt;
 *     &lt;enumeration value="TEXPOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassExposure")
@XmlEnum
public enum ActClassExposure {

    EXPOS,
    AEXPOS,
    TEXPOS;

    public String value() {
        return name();
    }

    public static ActClassExposure fromValue(String v) {
        return valueOf(v);
    }

}
