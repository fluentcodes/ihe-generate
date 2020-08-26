
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MobileUnit.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileUnit"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="MOBL"/&gt;
 *     &lt;enumeration value="AMB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileUnit")
@XmlEnum
public enum MobileUnit {

    MOBL,
    AMB;

    public String value() {
        return name();
    }

    public static MobileUnit fromValue(String v) {
        return valueOf(v);
    }

}
