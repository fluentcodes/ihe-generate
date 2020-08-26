
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntraperitonealRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraperitonealRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IPERINJ"/&gt;
 *     &lt;enumeration value="PDPINJ"/&gt;
 *     &lt;enumeration value="CAPDINSTL"/&gt;
 *     &lt;enumeration value="PDPINSTL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntraperitonealRoute")
@XmlEnum
public enum IntraperitonealRoute {

    IPERINJ,
    PDPINJ,
    CAPDINSTL,
    PDPINSTL;

    public String value() {
        return name();
    }

    public static IntraperitonealRoute fromValue(String v) {
        return valueOf(v);
    }

}
