
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BiliaryRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BiliaryRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BILINJ"/&gt;
 *     &lt;enumeration value="CHOLINJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BiliaryRoute")
@XmlEnum
public enum BiliaryRoute {

    BILINJ,
    CHOLINJ;

    public String value() {
        return name();
    }

    public static BiliaryRoute fromValue(String v) {
        return valueOf(v);
    }

}
