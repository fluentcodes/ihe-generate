
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntraesophagealRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraesophagealRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IESOPHINSTIL"/&gt;
 *     &lt;enumeration value="IESOPHTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntraesophagealRoute")
@XmlEnum
public enum IntraesophagealRoute {

    IESOPHINSTIL,
    IESOPHTA;

    public String value() {
        return name();
    }

    public static IntraesophagealRoute fromValue(String v) {
        return valueOf(v);
    }

}
