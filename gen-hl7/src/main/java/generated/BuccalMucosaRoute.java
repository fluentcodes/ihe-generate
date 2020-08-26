
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BuccalMucosaRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BuccalMucosaRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BUC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuccalMucosaRoute")
@XmlEnum
public enum BuccalMucosaRoute {

    BUC;

    public String value() {
        return name();
    }

    public static BuccalMucosaRoute fromValue(String v) {
        return valueOf(v);
    }

}
