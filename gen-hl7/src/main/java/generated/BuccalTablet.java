
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BuccalTablet.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BuccalTablet"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BUCTAB"/&gt;
 *     &lt;enumeration value="SRBUCTAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuccalTablet")
@XmlEnum
public enum BuccalTablet {

    BUCTAB,
    SRBUCTAB;

    public String value() {
        return name();
    }

    public static BuccalTablet fromValue(String v) {
        return valueOf(v);
    }

}
