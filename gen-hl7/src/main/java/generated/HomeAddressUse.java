
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HomeAddressUse.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HomeAddressUse"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="HP"/&gt;
 *     &lt;enumeration value="HV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HomeAddressUse")
@XmlEnum
public enum HomeAddressUse {

    H,
    HP,
    HV;

    public String value() {
        return name();
    }

    public static HomeAddressUse fromValue(String v) {
        return valueOf(v);
    }

}
