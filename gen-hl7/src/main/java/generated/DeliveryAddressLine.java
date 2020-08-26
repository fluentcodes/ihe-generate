
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeliveryAddressLine.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryAddressLine"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DAL"/&gt;
 *     &lt;enumeration value="DINSTA"/&gt;
 *     &lt;enumeration value="DINSTQ"/&gt;
 *     &lt;enumeration value="DINST"/&gt;
 *     &lt;enumeration value="DMOD"/&gt;
 *     &lt;enumeration value="DMODID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryAddressLine")
@XmlEnum
public enum DeliveryAddressLine {

    DAL,
    DINSTA,
    DINSTQ,
    DINST,
    DMOD,
    DMODID;

    public String value() {
        return name();
    }

    public static DeliveryAddressLine fromValue(String v) {
        return valueOf(v);
    }

}
