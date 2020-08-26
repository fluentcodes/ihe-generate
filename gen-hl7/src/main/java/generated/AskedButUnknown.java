
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AskedButUnknown.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AskedButUnknown"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ASKU"/&gt;
 *     &lt;enumeration value="NAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AskedButUnknown")
@XmlEnum
public enum AskedButUnknown {

    ASKU,
    NAV;

    public String value() {
        return name();
    }

    public static AskedButUnknown fromValue(String v) {
        return valueOf(v);
    }

}
