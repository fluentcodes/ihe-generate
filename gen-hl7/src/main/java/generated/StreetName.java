
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StreetName.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StreetName"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="STB"/&gt;
 *     &lt;enumeration value="STTYP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StreetName")
@XmlEnum
public enum StreetName {

    STR,
    STB,
    STTYP;

    public String value() {
        return name();
    }

    public static StreetName fromValue(String v) {
        return valueOf(v);
    }

}
